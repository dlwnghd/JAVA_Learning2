package day05;

import java.util.Scanner;

public class MyExceptionTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	// Scanner 호출
		User u = new User();	// User타입 u는 새로운 User타입 값

		try {
			u.wash();	// u클래스의 wash메소드 사용
		} catch (InterruptedException e1) {
			e1.printStackTrace();	// e1 객체의 printStachTrace메소드 실행
		}

		System.out.print("닉네임을 입력해 주시오 >> ");	// 닉네임 입력 유도
		String nick = sc.nextLine();	// String타입 nick객체는 입력받은 값

		try {
			u.setNickName(nick);	// u클래스의 setNickName메소드를 nick값을 받아 실행
		} catch (BadWordException e) {
			e.printStackTrace();	// e 객체의 printStachTrace메소드 실행
			System.out.println("오류 발생");	// 오류 발생 출력
		}
	}

}
