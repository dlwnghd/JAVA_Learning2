package wrapperTest;

import java.util.Scanner;

public class StringTask {
	public static void main(String[] args) {
		// 사용자게에 비밀번호를 입력받아서 암호화하여 출력하라
		// 비밀번호 암호화 비밀번호는 한글 제외함
		Scanner sc = new Scanner(System.in); // Scanner 사용 호출
		System.out.print("비밀번호 입력 >> "); // 사용자로부터 비밀번호 입력 유도
		String pw = sc.nextLine(); // String타입 pw객체는 입력받은 값

		String en_pw = ""; // String타입의 en_pw객체 정의
		for (int i = 0; i < pw.length(); i++) {	// int i는 0; i가 pw데이터의 길이 미만동안 반복; i++
			en_pw += (char) (pw.charAt(i) * 3);	//en_pw는 pw의 문자를 int타입으로 바꾸어 3을 곱하고 char타입으로 변경한 값을 추가
		}
		System.out.println("암호화된 비밀번호 : " + en_pw);	// 암호화된 비밀번호 출력

		// en_pw에 들어있는 암호화된 비밀번호를 복호화 하여
		String en_pw2 = "";	// String타입의 en_pw2 정의
		for (int i = 0; i < pw.length(); i++) {	// int i는 0; i가 pw데이터의 길이 미만동안 반복; i++
			en_pw2 += (char) (en_pw.charAt(i) / 3);	// en_pw2는 pw의 문자를 int타입으로 바꾸어 3을 나누고 char타입으로 변경한 값을 추가
		}
		System.out.println("복호화된 비밀번호 : " + en_pw2);	// 복호화된 비밀번호 출력

		// 사용자에게 휴대전화번호를 입력받아서 010-1234-1234
		// 해당 휴대전화를 01012341234 로 변경하여 출력하라
		System.out.print("휴대전화번호 입력 >> ");	// 사용자로부터 휴대전화번호 입력 유도
		String phone_num = sc.nextLine();	// 입력한 값을 String타입의 phone_num에 저장

		String[] res = phone_num.split("-");	// String타입 배멸 res는 phone_num을 "-"가 있는 구간마다 나누어서 저장
		for (int i = 0; i < res.length; i++) {	// int i는 0; i가 res데이터의 길이 미만동안 반복; i++
			System.out.print(res[i]);	// res[i]번째 배열 출력
		}

		// 사용자에게 나이 이름 핸드폰번호를 입력받아서
		// 나이(int),이름(String),핸드폰번호(String)
		// 로 연결된 하나의 문자열을 출력하라

		// 나이 입력
		System.out.print("나이 입력 >> ");
		int age = sc.nextInt();
		
		// 이름 입력
		System.out.print("이름 입력 >> ");
		String name = sc.next();

		// 휴대전화번호 입력
		System.out.print("휴대전화번호 입력 >> ");
		String phone_num2 = sc.next();

		// 나이, 이름, 전화번호 출력
		System.out.println(age + "," + name + "," + phone_num2);

		// 사용자에게 영어 단어를 입력 받아서
		// 두번째 o부터 끝까지 잘라서 출력하라
		// ex) orange delicious --> ous
		System.out.print("영어 단어 입력 >> ");
		String word = sc.nextLine();

		int a = word.indexOf("o", 5);	// 5번째부터 o의 위치를 찾아낸 번호를 int타입 a에 정의
		System.out.println("word.substring(a) : " + word.substring(a));	// a까지 문자열을 잘라내서 출력

		// 사용자에게 띄어쓰기로 두 수를 입력 받아서 두 수를 더한 결과를 출력하라
		System.out.print("두수를 띄어쓰기로 입력(ex. 56 42)  >> ");
		String word2 = sc.nextLine();

		System.out.println(word2);

		String[] res2 = word2.split(" ");	// String타입 배열 res2는 word2를 " "로 분할하여 저장
		int num1 = 0;	// int타입 num1은 0
		int num2 = 0;	// int타입 num2는 0
		for (int i = 0; i < res2.length; i++) {	// int i는 0; i가 res2데이터의 길이 미만동안 반복; i++
			System.out.println("res2[i] : " + res2[i]);	// res2[i]출력
			num1 = Integer.parseInt(res2[0]);	// num1 = res2의 0번째 방의 값을 Integer타입으로 변환하여 저장
			num2 = Integer.parseInt(res2[1]);	// num2 = res2의 1번째 방의 값을 Integer타입으로 변환하여 저장
		}
		System.out.println(num1 + num2);	// num1 + num2 출력

		// 제일 어려운 문제
		// 사용자에게 한글로 숫자를 입력받아서
		// 숫자로 변경하여 출력하라
		// ex) 입력 >> 일공이삼
		// 출력 >> 1023

		// 아래의 풀이는 너무 멍청하게 풀어서 설명을 정리하지는 않겠슴 더 좋은 풀이는 day05의 StringReview 참조
		System.out.print("숫자 한글로 입력 >> ");
		String word3 = sc.nextLine();

		String[] res3 = word3.split("");

		for (int i = 0; i < res3.length; i++) {
			if (res3[i].equals("일")) {
				res3[i] = "1";
			} else if (res[i].equals("이")) {
				res3[i] = "2";
			} else if (res[i].equals("삼")) {
				res3[i] = "3";
			} else if (res[i].equals("사")) {
				res3[i] = "4";
			} else if (res[i].equals("오")) {
				res3[i] = "5";
			} else if (res[i].equals("육")) {
				res3[i] = "6";
			} else if (res[i].equals("칠")) {
				res3[i] = "7";
			} else if (res[i].equals("팔")) {
				res3[i] = "8";
			} else if (res[i].equals("구")) {
				res3[i] = "9";
			} else if (res3[i].equals("공") || res3[i].equals("영")) {
				res3[i] = "0";
			} else {
				res3[i] = "X";
			}
		}
		System.out.println(String.join("", res3));
	}
}