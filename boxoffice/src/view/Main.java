package view;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// view를 만드는 공간(콘솔창)
		// DB는 기본적으로 추가 수정 검색 삭제
		Scanner sc = new Scanner(System.in);
		
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
				
			}else if(choice == 2) {
				
			}else if(choice == 3) {
				
			}else if(choice == 4) {
				
			}else if(choice == 5) {
				
			}else {
				System.out.println("잘못 입력함");
			}
			
			System.out.println();
			
			
			
			
			
		}	// while문 닫는 곳
	}
}
