package day05;

import java.util.Scanner;

public class StringReview {
	public static void main(String[] args) {
		// 사용자에게 비밀번호를 입력받아서 암호화하여 출력하라
		// 비밀번호 암호화 비밀번호는 한글 제외함
		Scanner sc = new Scanner(System.in);
//	      System.out.print("비밀번호 입력 >> ");
//	      String pw = sc.nextLine();
//	      
//	      String en_pw = "";
//	      for (int i = 0; i < pw.length(); i++) {	// 반복문
//	         en_pw += (char)(pw.charAt(i) * 3);	// pw의 i번째 번호에 *3을 한 후 char타입으로 바꾸어줘
//	      }
//	      System.out.println("암호화된 비밀번호 : " + en_pw);
//	      
//	      // en_pw에 들어있는 암호화된 비밀번호를 복호화 하여 출력하라
//	      String de_pw = "";
//	      for (int i = 0; i < pw.length(); i++) {	// 반복문
//	         de_pw += (char)(en_pw.charAt(i) / 3);	// 반대로
//	      }
//	      System.out.println("복호화된 비밀번호 : " + de_pw);

		// 사용자에게 휴대전화번호를 입력받아서 010-1234-1234
		// 해당 휴대전화를 01012341234 로 변경하여 출력하라
//		System.out.print("휴대폰전화번호 입력 >> ");
//		String phone = sc.nextLine();
//		
//		String[] temp = phone.split("-");	// {"011","123","1234"}
		
		// 1. 풀이
//		String res = String.join("", temp);	// 문자연결하여 대입 
//		System.out.println("정제된 데이터 : " + res);
		
		// 2. 풀이
//		String res = phone.replace("-", "");
//		System.out.println("정제된 데이터 : " + res);
		
		// 3. 풀이
//		String res = "";
//		for (int i = 0; i < temp.length; i++) {	// 배열에서는 length()가 아니라 length로 사용
//			res += temp[i];
//		}
		
		// 사용자에게 나이 이름 핸드폰번호를 입력받아서
		// 나이,이름,핸드폰번호
		// 로 연결된 하나의 문자열을 출력하라
		
//		String[] info = new String[3];
//		String[] head = {"나이", "이름", "핸드폰번호"};
//		
////		System.out.print("나이 입력 >> ");
////		info[0] = sc.nextLine();
////		System.out.print("이름 입력 >> ");
////		info[1] = sc.nextLine();
////		System.out.print("휴대전화번호 입력 >> ");
////		info[2] = sc.nextLine();
//
//		for (int i = 0; i < info.length; i++) {
//			System.out.print(head[i] + " >> ");
//			info[i] = sc.nextLine();
//		}
//		
//		String res = String.join(",", info);
//		System.out.println(res);
				
		// 사용자에게 영어 단어를 입력 받아서
		// 두번째 o부터 끝까지 잘라서 출력하라
		// ex) orange delicious --> ous
		
//		System.out.println("영어 단어 입력 >> ");
//		String target = sc.nextLine();
//		int firstO = target.indexOf("o");
//		int secondO = target.indexOf("o",firstO+1);
//		
//		System.out.println("첫번째 o의 위치 : " + target.indexOf("o"));
//		System.out.println("두번째 o의 위치 : " + target.indexOf("o", target.indexOf("o")+1));
//		String res = target.substring(target.indexOf("o", target.indexOf("o")+1));
//		System.out.println(res);
		
		// 사용자에게 띄어쓰기로 두 수를 입력 받아서 두 수를 더한 결과를 출력하라
//		System.out.println("두 수를 띄어쓰기로 입력 >> ");
//		String[] temp = sc.nextLine().split(" ");		
//		System.out.println("결과 : "+ (Integer.parseInt(temp[0]) + (Integer.parseInt(temp[1]))));
		
		
		
		// 제일 어려운 문제
		// 사용자에게 한글로 숫자를 입력받아서
		// 숫자로 변경하여 출력하라
//	      ex) 입력 >> 일공이삼
//	      출력 >> 1023
		String input = sc.nextLine();
		
		String hangeul = "공일이삼사오육칠팔수";
		
		String res = "";
		for (int i = 0; i < input.length(); i++) {
//			System.out.println("input.charAt(" + i + ") : " + input.charAt(i));
			res += hangeul.indexOf(input.charAt(i));
		}
		System.out.println("바뀐 결과 : " + res);
		
	}
}
