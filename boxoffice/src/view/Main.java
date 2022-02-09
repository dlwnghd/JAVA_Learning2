package view;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import movieDAO.MovieDAO;
import movieDTO.MovieDTO;

public class Main {
	public static void main(String[] args) throws IOException {
		// view를 만드는 공간(콘솔창)
		// DB는 기본적으로 추가 수정 검색 삭제
		Scanner sc = new Scanner(System.in);	// Scanner 호출
		MovieDAO dao = new MovieDAO();	// MovieDAO타입 dao객체 정의
		
		while(true) {
			// 메인메뉴 출력문 ↓
			System.out.println("1.영화추가하기");
			System.out.println("2.영화수정하기");
			System.out.println("3.영화검색하기");
			System.out.println("4.영화삭제하기");
			System.out.println("5.모든영화정보보기");
			System.out.println("6.나가기");
			int choice = Integer.parseInt(sc.nextLine());	// 사용자가 입력한 값 int타입으로 변경하여 int타입 choice로 정의
			
			
			if(choice == 6) {	
				// 나가기
				System.out.println("종료");	// 종료 출력
				break;	// 반복문 탈출
			}else if(choice == 1) {
				// 영화 추가하기
				System.out.print("영화제목 >> ");	// 영화제목 입력 유도
				String title = sc.nextLine();	// 사용자가 입력한 값 String타입 title에 저장
				System.out.print("개봉일 >> ");	// 개봉일 입력 유도
				String date = sc.nextLine();	// 사용자가 입력한 값 String타입 date에 저장
				System.out.print("수익 >> ");	// 수익 입력 유도
				String revenue = sc.nextLine();	// 사용자가 입력한 값 String타입 revenue에 저장
				System.out.print("관객수 >> ");	// 관객수 입력 유도
				String view = sc.nextLine();	// 사용자가 입력한 값 String타입 view에 저장
				System.out.print("스크린수 >> ");	// 스크린수 입력 유도
				String screen = sc.nextLine();	// 사용자가 입력한 값 String타입 screen에 저장
				
				dao.add(title, date, revenue, view, screen);	// dao객체에 괄호안에 있는 값들 추가
				System.out.println("추가 성공!");	// 추가 성공 메세지 출력
				
			}else if(choice == 2) {
				// 영화 수정하기
				// 영화 랭킹을 입력 받아서, 해당 랭킹 영화의 제목을 수정한다
				System.out.println("랭킹 입력 >> ");	// 랭킹 입력 유도
				int rank = Integer.parseInt(sc.nextLine());	// 사용자가 입력한 값 Integer타입으로 변환 후 int타입 rank에 저장
				System.out.println("수정할 제목 >> ");	// 수정할 제목 입력 유도
				String title = sc.nextLine();	// 사용자가 입력한 값 String타입 title에 저장
				
				if(dao.update(rank, title)) {	// rank와 title값을 받은 dao.update메소드가 true라면
					System.out.println("수정 성공!");	// 수정 성공 메세지 출력
				}else {	// rank와 title값을 받은 dao.update메소드가 false라면
					System.out.println("순위를 잘못 입력함! 수정 실패");	// 수정 실패 메세지 출력
				}
			}else if(choice == 3) {
				// 영화 검색하기
				System.out.println("검색할 제목 >> ");	// 검색할 제목 입력 유도
				String title = sc.nextLine();	// 사용자가 입력한 값 String타입 title에 저장
				ArrayList<MovieDTO> list = dao.select(title);	// MovieDTO를 요소로 가지는 ArrayList타입 list는 dao객체의 title을 받아 selcet메소드에서 return된 값
				System.out.println("----검색결과----");	// 검색결과 출력문
				for(MovieDTO movie : list) {	// MovieDTO타입 movie는 list의 모든 데이터 반복
					System.out.println(movie.getRank()+"위-["+movie.getTitle()+"]---");	// movie객체의 getRank메소드의 return값 "위-[" movie객체의 getTitle메소드의 return값 + "]---"
					System.out.println("|개봉일 :" + movie.getDate());	// 개봉일 출력
					System.out.println("|수익 :" + movie.getRevenue());	// 수익 출력
					System.out.println("|관객수 :" + movie.getView());	// 관객수 출력
					System.out.println("|스크린수 :" + movie.getScreen());	// 스크린수 출력
				}
				
			}else if(choice == 4) {
				// 삭제하기
				System.out.println("랭킹 입력 >> ");	// 랭킹 입력 유도
				int rank = Integer.parseInt(sc.next());	// 사용자가 입력한 값 Integer타입으로 변환 후 int타입 rank에 저장
				
				if(dao.remove(rank)) {	// rank값을 받은 dao.remove메소드가 true라면
					System.out.println("삭제 성공!");	// 삭제 성공 메세지 출력
				}else {	// rank값을 받은 dao.remove메소드가 false라면
					System.out.println("삭제 실패! 해당 행크 없음");	// 삭제 실패 메세지 출력
				}
			}else if(choice == 5) {
				// 모든 영화 정보 보기
				ArrayList<MovieDTO> list = dao.selectAll();	// MovieDTO를 요소로 가진 ArrayList list는 dao객체의.selectAll메소드를 통해 return나온 값
				System.out.println("----영화정보----");	// 영화정보 출력
				for(MovieDTO movie : list) {	// MovieDTO타입 movie는 list의 값 전체 반복
					System.out.println(movie.getRank() + "위-[" + movie.getTitle() + "]---");	// movie객체의 getRank메소드, movie객체의 getTitle메소드 출력
					System.out.println("|개봉일 :" + movie.getDate());	// movie객체의 getDate메소드 return값 출력
					System.out.println("|수익 :" + movie.getRevenue());	// movie객체의 getRevenue메소드 return값 출력
					System.out.println("|관객수 :" + movie.getView());	// movie객체의 getView메소드 return값 출력
					System.out.println("|스크린수 :" + movie.getScreen());	// movie객체의 getScreen메소드 return값 출력
				}
				
			}else {	// 이외의 값 입력 시
				System.out.println("잘못 입력함");	// 잘못 입력함 출력
			}
			System.out.println();	// 줄 바꿈
		}	// while문 닫는 중괄호
	}
}
