package wrapperTest;

import java.util.Scanner;

public class StringTask {
	public static void main(String[] args) {
		// 사용자게에 비밀번호를 입력받아서 암호화하여 출력하라
		// 비밀번호 암호화 비밀번호는 한글 제외함
		Scanner sc = new Scanner(System.in);
		System.out.println("비밀번호 입력 >> ");
		String pw = sc.nextLine();
		
		String en_pw = "";
		for (int i = 0; i < pw.length(); i++) {
		en_pw += (char)(pw.charAt(i)*3);
		}
		System.out.println("암호화된 비밀번호 : " + en_pw);
		
		// en_pw에 들어있는 암호화된 비밀번호를 복호화 하여 출력하라
		
		// 사용자에게 휴대전화번호를 입력받아서 010-1234-1234
		// 해당 휴대전화를 01012341234 로 변경하여 출력하라
		
		//사용자에게 나이 이름 핸드폰번호를 입력받아서
		// 나이,이름,핸드폰번호
		// 로 연결된 하나의 문자열을 출력하라
		
		// 사용자에게 영어 단어를 입력 받아서
		// 두번째 o부터 끝까지 잘라서 출력하라
		// ex) orange delicious --> ous
		
		
		// 사용자에게 띄어쓰기로 두 수를 입력 받아서 두 수를 더한 결과를 출력하라
		
		// 제일 어려운 문제
	    // 사용자에게 한글로 숫자를 입력받아서 
	    // 숫자로 변경하여 출력하라
	    // ex) 입력 >> 일공이삼
	    // 출력 >> 1023
	}
}