package day05;

import java.util.Scanner;

public class ThrowTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	// Scanner 호출

		while (true) {// 무한 반복
			System.out.println("입력  >> ");	// 입력 유도
			int choice = sc.nextInt();	// int타입 choice는 입력값
			if (choice == 1) {	// choice가 1이라면
				break;	// 반복문 탈출
			} else if (choice == 5) {	// choice가 5라면
				// throw : 예외를 발생시키는 키워드
				// throw new 예외이름();
				// ArithmeticException a = new ArithmeticException();
				try {
					throw new ArithmeticException("괄호안에문자열");	// ArithmeticException 예외를 발생시킴
				} catch (ArithmeticException e) {
					System.out.println(e.getMessage());	// e객체의 getMessage메소드 출력
					e.printStackTrace();	// e객체의 printStackTrace메소드 실행
					System.out.println("예외발생함!!");	// "예외발생함!!" 출력
				}
			}
		}
	}
}
