package movieDAO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.ArrayList;

import movieDTO.MovieDTO;

public class MovieDAO {	// Data Access Object 실질적으로 DB(txt파일)에 접근하는 객체
	// 메소드 구현 공간
	
	// 모든 영화 정보 보기 기능
	public ArrayList<MovieDTO> selectAll() throws IOException{	// ArratList<MovieDTO>타입으로 return
		BufferedReader br = DBConnection.read();	// BufferedReader타입 br = DBConection클래스의 read()메소드를 통해 얻은 값 대입
		ArrayList<MovieDTO> list = new ArrayList<>();	// ArrayList<MovieDTO>타입 list = 새로운 ArrayList<MovieDTO>타입의 값 공간 생성
		// movie.txt에 있는 파일을 다 넘겨줄게
		
		String line = "";	// String타입의 line 생성
		
		while((line = br.readLine()) != null) {	// line값 = br의 readLine메소드에서 나온 값인데 null이 아니라면 반복
			MovieDTO dto = new MovieDTO();	// MovieDTO타입 dto = 새로운 MovieDTO타입의 값 공간 생성
			// line에는 영화 하나에 대한 정보가 담겨있다
			// 6개의 정보를 분리 시켜야한다
			// 각각의 6개의 정보는 \t(tab)로 연결되어있다.
			// line --> "1\t명량\t2014-07-30\t135,748,398,910\t17,613,682\t1,587"
			String[] temp = line.split("\t");	// String타입의 배열 temp = line을 "\t"로 분리한 값들
			// temp --> {"1", "명량", "2014-07-30", "135,748,398,910", "17,613,682", "1,587"}
			// 분리한 데이터를 MovieDTO타입의 dto에 넣어줌
			dto.setRank(Integer.parseInt(temp[0]));	// Integer타입으로 변경하여 넣어줌
			dto.setTitle(temp[1]);	// 영화 제목
			dto.setDate(temp[2]);	// 영화 개봉일
			dto.setRevenue(temp[3]);	// 영화 수익
			dto.setView(temp[4]);	// 관객수
			dto.setScreen(temp[5]);	// 상영한 스크린 수
			// list에 넣어주기
			list.add(dto);	// list에 dto값 추가
		}
		br.close();	// br 닫기, (버퍼 읽기 닫기)
		return list;	// list값 돌려주기
	}
	
	
	
	// 영화 추가하기 메소드(제목, 개봉일, 수익, 관객수, 스크린수를 받아와야한다)
	public void add(String title, String date, String revenue, String view, String screen)
			throws IOException{
		BufferedReader br = DBConnection.read();	// BufferedReader타입 br = DBConnection클래스의 read메소드에서 나온 값 대입
		String line = "";	// String타입 line 정의, 추가해줄 영화의 
		String contents="";	// String타입 contents 정의
		int ranking = 0;	// int타입 ranking 정의
		while((line = br.readLine())!= null) {	// line = br객체의 readLine메소드로 나온 값
			ranking++;	// ranking에 1을 더해줌
			String[] temp = line.split("\t");	// String타입 temp = line객체를 \t으로 분리하여 저장
			// temp --> {"1", "명량", "2014-07-30", "135,748,398,910", "17,613,682", "1,587"}
			int targetView = Integer.parseInt(temp[4].replaceAll(",", "")); // 관객수 부분 : "17,613,682" --> "17613682"
			if(targetView > Integer.parseInt(view)) {	// targetView 값이 Integer타입의 view라면, 추가한 영화의 관람객 수가 기존에 있던 영화의 관람객수보다 초과라면
				contents += line + "\n";	// contents = contents + line값 + 엔터
			}else {	// targetView 값이 Interger타입의 view가 아니라면, 추가한 영화의 관람객 수가 기존에 있던 영화의 관람객수 이하라면
				contents += ranking+"\t" + title + "\t" + date + "\t" + revenue 
						+"\t" + view + "\t" + screen + "\t";	// contents = ranking + 기존에 있던 영화의 정보
				break;	// 반복문 탈출
			}
		}
		// while문이 끝났다면 기본에 있던 데이터를 뒤에 덧붙여준다
		ranking++;	// ranking에 1을 추가
		contents += ranking + line.substring(line.indexOf("\t")) + "\n";	// contents = 
		
		while((line = br.readLine())!= null) {
			ranking++;
			contents += ranking + line.substring(line.indexOf("\t")) + "\n";
		}
		// while문이 끝나고 나면 contents에는 내가 원하는 데이터가 삽입된 하나의 문자열이 된다		
		br.close();
		BufferedWriter bw = DBConnection.write();
		bw.close();
	}
	
	// 영화의 마지막 순위를 알려주는 메소드
	public int getLastRank() throws IOException{
		BufferedReader br = DBConnection.read();
		String line = "";
		int rank = 0;
		while((line = br.readLine())!= null) {
			rank++;
		}
		br.close();
		return rank;
	}
	
	// 영화 수정하기 메소드
	public boolean update(int rank, String title) throws IOException {
		if( rank > getLastRank() || rank < 1) {
			return false;
		}
		
		
		BufferedReader br = DBConnection.read();
		String contents = "";
		for (int i = 0; i < rank-1; i++) {
			contents += br.readLine() + "\n";
		}
		// 반복문이 끝나면 내가 수정하기 이전까지의 영화정보가 contents에 담겨있다
		String line = br.readLine();	// 내가 수정하고 싶어하는 영화정보
		// line --> "5\t어벤져스: 엔드게임\t2019-04-24\t122,182,694,160\t13,934,592\t2,835"
		String[] temp = line.split("\t");
		// temp --> {"5", "어벤져스: 엔드게임", "2017-04-24", "122,182,694,160","13,934,592" , "2,835"}
		temp[1] = title;	// 수정할 제목이 "수정됨"이라면
		// temp --> {"5", "수정됨", "2017-04-24", "122,182,694,160","13,934,592" , "2,835"}
		contents += String.join("\t", temp) + "\n";
		// String.join("\t", temp) --> "5\t어벤져스: 엔드게임\t2019-04-24\t122,182,694,160\t13,934,592\t2,835\n"
		while((line = br.readLine()) != null) {
			contents += line + "\n";
		}
		//while문이 끝나면 수정이 끝난 하나의 문자열이 완성된다
		br.close();
		
		BufferedWriter bw = DBConnection.write();
		
		bw.write(contents);
		
		bw.close();
		
		return true;
	}
	
	// 영화 삭제하기 메소드
	// 랭킹으로 삭제하기
	public boolean remove(int rank) throws IOException{
		if(rank > getLastRank() || rank < 1) return false;
		
		BufferedReader br = DBConnection.read();
		String contents = "";
		int ranking = 0;
		for (int i = 0; i < rank-1; i++) {
			ranking++;
			contents += br.readLine() + "\n";
		}
		// for 문이 끝나면 contents에는 내가 삭제하기 이전의 행들이 들어있다
		br.readLine(); // 내가 삭제할 영화
		
		String line = "";
		while((line = br.readLine()) != null) {
			ranking++;
			contents += ranking + line.substring(line.indexOf("\t")) + "\n";
		}
		br.close();
		
		BufferedWriter bw = DBConnection.write();
		
		bw.write(contents);
		
		bw.close();
		
		return true;
	}
	
	// 영화 검색하기 메소드
	public ArrayList<MovieDTO> select(String title) throws IOException{
		BufferedReader br = DBConnection.read();
		// 검색된 영화 결과(DTO 객체들)을 담을 리스트
		ArrayList<MovieDTO> list = new ArrayList<MovieDTO>();
		String line = "";
		while((line = br.readLine()) != null) {
			String[] temp = line.split("\t");	// 제목은 1번째 방에 존재한다
			if(temp[1].contains(title)) {
				MovieDTO dto = new MovieDTO();
				dto.setTitle(temp[1]);
				dto.setDate(temp[2]);
				dto.setRevenue(temp[3]);
				dto.setView(temp[4]);
				dto.setScreen(temp[5]);
			}
			
		}
		
		
		br.close();
		
		return list;
	}
	
}








