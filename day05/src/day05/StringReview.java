package day05;

import java.util.Scanner;

public class StringReview {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 사용자에게 비밀번호를 입력받아서 암호화하여 출력하라
		// 비밀번호 암호화 비밀번호는 한글 제외함		
//	      System.out.print("비밀번호 입력 >> ");	// 사용자로부터 비밀번호 입력 유도
//	      String pw = sc.nextLine();	// 입력한 값 String타입 pw로 저장
//	      
//	      String en_pw = "";	// String타입 en_pw정의
//	      for (int i = 0; i < pw.length(); i++) {	// 반복문
//	         en_pw += (char)(pw.charAt(i) * 3);	// pw의 i번째 글자에 *3을 한 후 char타입으로 바꾸어줘
//	      }
//	      System.out.println("암호화된 비밀번호 : " + en_pw);	// 암호화된 비밀번호 출력
//	      
//	      // en_pw에 들어있는 암호화된 비밀번호를 복호화 하여 출력하라
//	      String de_pw = "";	// String타입 de_pw정의
//	      for (int i = 0; i < pw.length(); i++) {	// 반복문
//	         de_pw += (char)(en_pw.charAt(i) / 3);	// pw의 i번째 글자에 /3을 한 후 char타입으로 바꾸어줘
//	      }
//	      System.out.println("복호화된 비밀번호 : " + de_pw);	// 복호화된 비밀번호 출력

		// 사용자에게 휴대전화번호를 입력받아서 (ex.010-1234-1234)
		// 해당 휴대전화를 01012341234 로 변경하여 출력하라
//		System.out.print("휴대폰전화번호 입력 >> ");	// 사용자로부터 휴대전화번호 입력 유도
//		String phone = sc.nextLine();	// 사용자가 입력한 값 String타입의 phone에 저장
				
		// 1. 풀이(split, join 메소드 사용)
//		String[] temp = phone.split("-");	// 입력 받은 번호를 "-"마다 나누어서 String배열 temp에 저장, {"011","123","1234"}
//		String res = String.join("", temp);	// 베열 temp에 있는 데이터들 연결하여 하나의 String타입 res에 저장 
//		System.out.println("정제된 데이터 : " + res);	// res 출력
		
		// 2. 풀이(replace 메소드 사용)
//		String res = phone.replace("-", "");	// phone타입에서 "-"문자를 전부 ""로 교체하여 res에 저장
//		System.out.println("정제된 데이터 : " + res);	// res 출력
		
		// 3. 풀이
//		String[] temp = phone.split("-");	// 입력 받은 번호를 "-"마다 나누어서 String배열 temp에 저장, {"011","123","1234"}
//		String res = "";	// String타입 res 선언 
//		for (int i = 0; i < temp.length; i++) {	// 배열에서는 length()가 아니라 length로 사용
//			res += temp[i];	// res에 temp[i]를 차례대로 더해서 출력(String타입이기에 나열될 것임)
//		}
//		System.out.println("정제된 데이터 : " + res);	// res 출력
		
		// 사용자에게 나이 이름 핸드폰번호를 입력받아서
		// 나이,이름,핸드폰번호
		// 로 연결된 하나의 문자열을 출력하라
		String[] info = new String[3];	// String타입배열 info = 새로운 String값 3개를 받아온다
		String[] head = {"나이", "이름", "핸드폰번호"};	// String타입배열 head는 나이, 이름, 핸드폰번호로 선언
		
//		System.out.print("나이 입력 >> ");	// 사용자로부터 나이 입력 유도
//		info[0] = sc.nextLine();	// 사용자가 입력한 값 info[0]에 저장
//		System.out.print("이름 입력 >> ");	// 사용자로부터 이름 입력 유도
//		info[1] = sc.nextLine();	// 사용자가 입력한 값 info[1]에 저장
//		System.out.print("휴대전화번호 입력 >> ");	// 사용자로부터 휴대전화번호 입력 유도
//		info[2] = sc.nextLine();	// 사용자가 입력한 값 info[2]에 저장
		// ↓반복

//		// 방법 2
//		for (int i = 0; i < info.length; i++) {	// i는 0; i가 info데이터길이 미만동안; i++
//			System.out.print(head[i] + " >> ");	// head[i] + " >> "출력
//			info[i] = sc.nextLine();	// 사용자가 입력한 값 info[i]에 저장
//		}
		
		// 출력
//		String res = String.join(",", info);	// String타입 res에 info에 있는 데이터들을 ","로 연결한 값 저장
//		System.out.println(res);	// res 출력
		
				
		// 사용자에게 영어 단어를 입력 받아서
		// 두번째 o부터 끝까지 잘라서 출력하라
		// ex) orange delicious --> ous
		
//		System.out.println("영어 단어 입력 >> ");	// 사용자로부터 영어 단어 입력 유도
//		String target = sc.nextLine();	// 사용자가 입력한 값 String타입 target에 저장
//		int firstO = target.indexOf("o");	// int타입 firstO = target에서 처음부터 "o"가 있는 인덱스번호를 return
//		int secondO = target.indexOf("o",firstO+1);	// int타입 secondO = target에서 firstO+1부터 "o"가 있는 인덱스번호를 return
//		
//		System.out.println("첫번째 o의 위치 : " + firstO);	// 첫번째 o의 위치 출력
//		System.out.println("두번째 o의 위치 : " + secondO);	// 두번째 o의 위치 출력
//		String res = target.substring(secondO);	// String타입 res는 문자 "o"가 나오는 지점까지 자르기, 두번째 o의 위치부터
//		System.out.println(res);	// res 출력
		
		
		// 사용자에게 띄어쓰기로 두 수를 입력 받아서 두 수를 더한 결과를 출력하라
//		System.out.println("두 수를 띄어쓰기로 입력 >> ");	// 사용자로부터 두 수를 입력 받도록 유도
//		String[] temp = sc.nextLine().split(" ");	// String타입 배열 temp = 입력 받은 값을 " "로 나누어 저장
//		System.out.println("결과 : "+ (Integer.parseInt(temp[0]) + (Integer.parseInt(temp[1]))));	// 두 수를 각각 Integer타입으로 바꾸어 계산 후 출력
		
		
		
		// 제일 어려운 문제
		// 사용자에게 한글로 숫자를 입력받아서
		// 숫자로 변경하여 출력하라
//	      ex) 입력 >> 일공이삼
//	      출력 >> 1023
		System.out.print("한글로 숫자를 입력하세요 >> ");	// 사용자로부터 숫자를 한글로 입력하도록 유도
		String input = sc.nextLine();	// String타입 input을 입력받음
		
		String hangeul = "공일이삼사오육칠팔구";	// String타입 hangeul은 "공일이삼사오육칠팔수" 저장
		
		String res = "";	// String타입 res 선언 
		for (int i = 0; i < input.length(); i++) {	// 반복문
//			System.out.println("input.charAt(" + i + ") : " + input.charAt(i));	// input 인덱스의 문자를 return, input.charAt(i) 출력
			if (input.charAt(i) == '영') {	// 만약 '공'이 아닌 '영'을 입력했을 경우
				res += 0;	// res = res + 0	
			}else {				
				res += hangeul.indexOf(input.charAt(i));	// res = res + hanguel이라는 문자열에서 input 인덱스의 문자에서 넣은 문자와 일치하는 값의 문자열 위치번호
			}
		}
		System.out.println("바뀐 결과 : " + res);	// res 출력
	}
}
