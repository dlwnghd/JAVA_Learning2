package movieDAO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.ArrayList;

import movieDTO.MovieDTO;

public class MovieDAO {	// Data Access Object 실질적으로 DB(txt파일)에 접근하는 객체
	// 메소드 구현 공간
	
	// 모든 영화 정보 보기 기능(selectAll)
	public ArrayList<MovieDTO> selectAll() throws IOException{	// ArratList<MovieDTO>타입으로 return
		BufferedReader br = DBConnection.read();	// BufferedReader타입 br에 DBConection클래스의 read()메소드를 통해 얻은 값 대입
		ArrayList<MovieDTO> list = new ArrayList<>();	// ArrayList<MovieDTO>타입 list = 새로운 ArrayList<MovieDTO>타입의 값 공간 생성
		// movie.txt에 있는 파일을 다 넘겨줄게
		
		String line = "";	// String타입의 line 생성
		
		// txt파일 안에 데이터가 없을때까지 반복
		while((line = br.readLine()) != null) {	// line값 = br의 readLine메소드에서 나온 값인데 null이 아니라면 반복
			MovieDTO dto = new MovieDTO();	// MovieDTO타입 dto = 새로운 MovieDTO타입의 값 공간 생성
			// line에는 영화 하나에 대한 정보가 담겨있다
			// 6개의 정보를 분리 시켜야한다
			// 각각의 6개의 정보는 \t(tab)로 연결되어있다.
			// line --> "1\t명량\t2014-07-30\t135,748,398,910\t17,613,682\t1,587"
			String[] temp = line.split("\t");	// String타입의 배열 temp는 line을 "\t"로 분리한 값들
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
			throws IOException{	// 오류발생은 사용자가 알아서 처리
		BufferedReader br = DBConnection.read();	// BufferedReader타입 br = DBConnection클래스의 read메소드에서 나온 값 대입
		String line = "";	// String타입 line 정의, 추가해줄 영화의 정보가 있을 줄
		String contents = "";	// String타입 contents 정의
		int ranking = 0;	// int타입 ranking 정의
		while((line = br.readLine())!= null) {	// line = br객체의 readLine메소드로 나온 값
			ranking++;	// ranking에 1을 더해줌
			String[] temp = line.split("\t");	// String타입 temp = line객체를 \t으로 분리하여 저장
			// temp --> {"1", "명량", "2014-07-30", "135,748,398,910", "17,613,682", "1,587"}
			int targetView = Integer.parseInt(temp[4].replaceAll(",", "")); // 관객수 부분 : "17,613,682" --> "17613682"
			
			// 순위변동
			if(targetView > Integer.parseInt(view)) {	// targetView 값이 Integer타입의 view보다 크다면, 기존에 있던 영화의 관람객수 > 추가한 영화의 관람객 수
				contents += line + "\n";	// contents = contents + line값 + 엔터(줄바꿈)
			}else {	// targetView 값이 Integer타입의 view보다 작다면, 기존에 있던 영화의 관람객수 < 추가한 영화의 관람객 수
				contents += ranking+"\t" + title + "\t" + date + "\t" + revenue 
						+"\t" + view + "\t" + screen + "\n";	// contents = ranking + 기존에 있던 영화의 정보
				break;	// 반복문 탈출
			}
		}
		
		// *추가한 영화의 바로 다음 영화의 순위*
		// while문이 끝났다면(추가한 영화의 정보의 순위가 업데이트)
		// 기본에 있던 데이터를 뒤에 덧붙여준다
		ranking++;	// ranking에 1을 추가(순위가 밀려남)
		contents += ranking + line.substring(line.indexOf("\t")) + "\n";	// contents = 순위 + line에 있는 정보들을 
		
		// 나머지 영화의 순위
		while((line = br.readLine())!= null) {	// line은 br.객체의 readLine의 return값인데 null값이 아니라면
			ranking++;	// ranking에 1을 더해줌
			// 순위는 1, 10 ,100으로 자릿수가 계속 변하기 때문에 첫번째 tab키를 기준으로 잘라서 나머지 데이터를 더해줌
			contents += ranking + line.substring(line.indexOf("\t")) + "\n";	// contents는 ranking + line객체에서 첫번째 tab키까지 자르고 나머지 + 엔터(줄바꿈)
		}
		br.close();	// 버퍼 읽기 닫기
		// while문이 끝나고 나면 contents에는 내가 원하는 데이터(추가할 영화)가 삽입된 하나의 문자열이 된다
		BufferedWriter bw = DBConnection.write();	// 데이터베이스에 써주기위해 BufferedWriter타입 bw객체는 DBConnection의 write메소드로 데이터 쓰기
		bw.close();	// 버퍼 쓰기 닫기
	}
	
	// 영화의 마지막 순위를 알려주는 메소드
	public int getLastRank() throws IOException{	// int값을 return해주는 getLastRank메소드, IOException 오류를 떠넘김
		BufferedReader br = DBConnection.read();	// BufferedReader타입 br은 DBConnection의 read메소드의 return값
		String line = "";	// String타입의 line 정의
		int rank = 0;	// int타입 rank는 0
		while((line = br.readLine())!= null) {	// (line : br.readLine의 return값)이 null값이 아니라면
			rank++;	// rank에 +1
		}
		// while문을 나오면 rank에는 랭킹의 마지막 순위의 번호가 int타입으로 들어있음
		br.close();	// 버퍼 읽기 닫기
		return rank;	// rank값 return
	}
	
	// 영화 수정하기 메소드
	public boolean update(int rank, String title) throws IOException {	// rank와 title을 받아 boolean타입으로 return하는 update메소드
		if( rank > getLastRank() || rank < 1) {	// rank가 마지막 랭크보다 크거나 rank가 1보다 작다면
			return false;	// false로 return
		}
		
		
		BufferedReader br = DBConnection.read();	// BufferedReader타입 br은 DBConnection의 read메소드의 return값
		String contents = "";	// String타입 contents 정의
		for (int i = 0; i < rank-1; i++) {	// int i는 0; i가 rank-1 미만동안 반복; i++
			contents += br.readLine() + "\n";	// contents = contents + br객체의 readLine메소드의 return값 + 엔터(줄바꿈)
		}
		
		// 반복문이 끝나면 내가 수정하기 이전까지의 영화정보가 contents에 담겨있다
		String line = br.readLine();	// 내가 수정하고 싶어하는 영화정보, String타입의 line은 br.readLine의 return값
		// line --> "5\t어벤져스: 엔드게임\t2019-04-24\t122,182,694,160\t13,934,592\t2,835"
		String[] temp = line.split("\t");	// String타입 배열 temp는 line의 tab으로 나눈 값들
		// temp --> {"5", "어벤져스: 엔드게임", "2017-04-24", "122,182,694,160","13,934,592" , "2,835"}
		temp[1] = title;	// temp의 [1]번째 방 배열은 title값
		// 만약 수정할 제목이 "수정됨"이라면
		// temp --> {"5", "수정됨", "2017-04-24", "122,182,694,160","13,934,592" , "2,835"}
		contents += String.join("\t", temp) + "\n";	// contents = contents + temp의 값들을 tab키로 연결한 하나의 문자열 + 엔터(줄바꿈)
		// String.join("\t", temp) --> "5\t어벤져스: 엔드게임\t2019-04-24\t122,182,694,160\t13,934,592\t2,835\n"
		while((line = br.readLine()) != null) {	// (line : br.readLine의 return값)이 null값이 아니라면
			contents += line + "\n";	// contetns = contents + line + 엔터(줄바꿈)
		}
		//while문이 끝나면 수정이 끝난 하나의 문자열이 완성된다
		br.close();	// 버퍼 읽기 닫기
		BufferedWriter bw = DBConnection.write();	// 데이터베이스에 써주기위해 BufferedWriter타입 bw객체는 DBConnection의 write메소드로 데이터 쓰기
		bw.write(contents);	// bw객체의 contents값을 받은 write메소드 실행, contents에 있는 긴 문자열을 bw에 쓰기
		bw.close();	// 버퍼 쓰기를 닫기
		return true;	// true값 return
	}
	
	// 영화 삭제하기 메소드
	// 랭킹으로 삭제하기
	public boolean remove(int rank) throws IOException{	// int타입 rank값을 받아 boolean값을 return하는 remove메소드, IOException 오류 떠넘김
		
		// 존재하지 않는 랭킹을 입력한다면
		if(rank > getLastRank() || rank < 1) return false;	// rank가 getLastRank메소드 return값보다 크거나 rank값이 1보다 작다면, false값 return
		
		// 존재하는 랭킹을 입력한다면
		BufferedReader br = DBConnection.read();	// BufferedReader타입 br은 DBConnection의 read메소드 return값
		String contents = "";	// String타입 contents 정의
		int ranking = 0;	// int타입 ranking 정의
		for (int i = 0; i < rank-1; i++) {	// int i는 0; i가 rank-1미만 동안 반복; i++, rank-1 : 내가 삭제하고 싶은 랭킹 이전까지
			ranking++;	// ranking은 +1
			contents += br.readLine() + "\n";	// contents = contents + br객체의 readLine메소드 return값 + 엔터(줄바꿈)
		}
		// for 문이 끝나면 contents에는 내가 삭제하기 이전의 행들이 들어있다
		br.readLine(); // 내가 삭제할 영화 읽기, 읽기만하고 contents에 담아주지 않음
		
		// 삭제할 영화를 제외한 나머지 영화데이터들 contents에 담기
		String line = "";	// String타입 line 정의
		while((line = br.readLine()) != null) {	// (line : br.readLine의 return값)이 null값이 아니라면
			ranking++;	// ranking은 +1
			contents += ranking + line.substring(line.indexOf("\t")) + "\n";	// contents는 ranking + line객체에서 첫번째 tab키까지 자르고 나머지 + 엔터(줄바꿈)
		}
		br.close();	// 버퍼 읽기 닫기
		BufferedWriter bw = DBConnection.write();	// 데이터베이스에 써주기위해 BufferedWriter타입 bw객체는 DBConnection의 write메소드로 데이터 쓰기
		bw.write(contents);	// bw객체의 contents값을 받은 write메소드 실행, contents에 있는 긴 문자열을 bw에 쓰기
		bw.close();	// 버퍼 쓰기 닫기
		return true;	// true값 return
	}
	
	// 영화 검색하기 메소드
	public ArrayList<MovieDTO> select(String title) throws IOException{	// String타입 title값을 받아 MovieDTO를 요소로 가지는 ArrayList타입을 return하는 select메소드, IOException 오류 떠넘김
		BufferedReader br = DBConnection.read();	// BufferedReader타입 br은 DBConnection의 read메소드의 return값
		// 검색된 영화 결과(DTO 객체들)을 담을 리스트
		ArrayList<MovieDTO> list = new ArrayList<MovieDTO>();	// ArrayList<MovieDTO>타입 list = 새로운 ArrayList<MovieDTO>타입의 값 공간 생성
		String line = "";	// String타입 line 정의
		while((line = br.readLine()) != null) {	// (line : br.readLine의 return값)이 null값이 아니라면
			String[] temp = line.split("\t");	// 제목은 1번째 방에 존재한다
			if(temp[1].contains(title)) {	// temp[1]번째방이 title값을 포함한다면
				MovieDTO dto = new MovieDTO();	// Movie타입 dto는 새로운 MovieDTO값				
				dto.setRank(Integer.parseInt(temp[0]));		// dto.temp[1]값을 받은 setTitle메소드 실행
				dto.setTitle(temp[1]);		// dto객체의 temp[1]값을 받은 setTitle메소드 실행
				dto.setDate(temp[2]);		// dto객체의 temp[2]값을 받은 setDate메소드 실행
				dto.setRevenue(temp[3]);	// dto객체의 temp[3]값을 받은 setRevenue메소드 실행
				dto.setView(temp[4]);		// dto객체의 temp[4]값을 받은 setView메소드 실행
				dto.setScreen(temp[5]);		// dto객체의 temp[5]값을 받은 setScreen메소드 실행
				list.add(dto);	// list객체의 dto값을 받은 add메소드 실행, list에 dto값 추가
			}
		}
		br.close();	// 버퍼 읽기 닫기
		return list;	// list값 return
	}
}