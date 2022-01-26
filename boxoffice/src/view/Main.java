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
		Scanner sc = new Scanner(System.in);
		MovieDAO dao = new MovieDAO();
		
		while(true) {
			System.out.println("1.영화추가하기");
			System.out.println("2.영화수정하기");
			System.out.println("3.영화검색하기");
			System.out.println("4.영화삭제하기");
			System.out.println("5.모든영화정보보기");
			System.out.println("6.나가기");
			int choice = Integer.parseInt(sc.nextLine());
			
			
			if(choice == 6) {
				System.out.println("종료");
				break;
			}else if(choice == 1) {
				// 영화 추가하기
				System.out.print("영화제목 >> ");
				String title = sc.nextLine();
				System.out.print("개봉일 >> ");
				String date = sc.nextLine();
				System.out.print("수익 >> ");
				String revenue = sc.nextLine();
				System.out.print("관객수 >> ");
				String view = sc.nextLine();
				System.out.print("스크린수 >> ");
				String screen = sc.nextLine();
				
				dao.add(title, date, revenue, view, screen);
				System.out.println("추가 성공!");
				
			}else if(choice == 2) {
				// 영화 랭킹도 입력 받아서, 해당 랭킹 영화의 제목을 수정한다
				System.out.println("랭킹 입력 >> ");
				int rank = Integer.parseInt(sc.nextLine());
				System.out.println("수정할 제목 >> ");
				String title = sc.nextLine();
				
				if(dao.update(rank, title)) {
					System.out.println("수정 성공!");
				}else {
					System.out.println("순위를 잘못 입력함! 수정실패");
				}
			}else if(choice == 3) {
				// 영화 검색하기
				System.out.println("검색할 제목 >> ");
				String title = sc.nextLine();
				ArrayList<MovieDTO> list = dao.select(title);
				System.out.println("----검색결과----");
				for(MovieDTO movie : list) {
					System.out.println(movie.getRank()+"위-["+movie.getTitle()+"]---");
					System.out.println("|개봉일 :" + movie.getDate());
					System.out.println("|수익 :" + movie.getRevenue());
					System.out.println("|관객수 :" + movie.getView());
					System.out.println("|스크린수 :" + movie.getScreen());
				}
				
			}else if(choice == 4) {
				// 삭제하기
				System.out.println("랭킹 입력 >> ");
				int rank = Integer.parseInt(sc.next());
				
				if(dao.remove(rank)) {
					System.out.println("삭제 성공!");
				}else {
					System.out.println("삭제 실패! 해당 행크 없음");
				}
			}else if(choice == 5) {
				// 모든 영화 정보 보기
				ArrayList<MovieDTO> list = dao.selectAll();
				System.out.println("----영화정보----");
				for(MovieDTO movie : list) {
					System.out.println(movie.getRank()+"위-["+movie.getTitle()+"]---");
					System.out.println("|개봉일 :" + movie.getDate());
					System.out.println("|수익 :" + movie.getRevenue());
					System.out.println("|관객수 :" + movie.getView());
					System.out.println("|스크린수 :" + movie.getScreen());
				}
				
			}else {
				System.out.println("잘못 입력함");
			}
			
			System.out.println();
			
			
			
			
			
		}	// while문 닫는 중괄호
	}
}
