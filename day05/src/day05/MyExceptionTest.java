package day05;

import java.util.Scanner;

public class MyExceptionTest {
	public static void main(String[] args) throws InterruptedException{
		Scanner sc = new Scanner(System.in);
		User u = new User();
		
		u.wash();
		
		
		System.out.print("닉네임 입력 >> ");
		String nick = sc.nextLine();

		try {
			u.setNickName(nick);			
		} catch (BadWordException e) {
			e.printStackTrace();
			System.out.println("오류 발생");
		}

	}
}
