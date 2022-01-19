package day05;

import java.util.Scanner;

public class MyExceptionTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		User u = new User();

		try {
			u.wash();
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}

		System.out.print("닉네임을 입력해 주시오 >> ");
		String nick = sc.nextLine();

		try {
			u.setNickName(nick);
		} catch (BadWordException e) {
			e.printStackTrace();
			System.out.println("오류 발생");
		}
	}

}
