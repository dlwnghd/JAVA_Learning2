package wrapperTest;

import java.util.Scanner;

public class StringTask {
	public static void main(String[] args) {
		// 사용자게에 비밀번호를 입력받아서 암호화하여 출력하라
		// 비밀번호 암호화 비밀번호는 한글 제외함
		Scanner sc = new Scanner(System.in);
		System.out.print("비밀번호 입력 >> ");
		String pw = sc.nextLine();
		
		String en_pw = "";
		for (int i = 0; i < pw.length(); i++) {
		en_pw += (char)(pw.charAt(i)*3);
		}
		System.out.println("암호화된 비밀번호 : " + en_pw);
		
		// en_pw에 들어있는 암호화된 비밀번호를 복호화 하여 
		String en_pw2 = "";
		for (int i = 0; i < pw.length(); i++) {
			en_pw2 += (char)(en_pw.charAt(i)/3);
			}
		System.out.println("복호화된 비밀번호 : " + en_pw2);
		
		
		// 사용자에게 휴대전화번호를 입력받아서 010-1234-1234
		// 해당 휴대전화를 01012341234 로 변경하여 출력하라
		System.out.print("휴대전화번호 입력 >> ");
		String phone_num = sc.nextLine();
		
		String[] res = phone_num.split("-");
		for (int i = 0; i < res.length; i++) {
			System.out.print(res[i]);
		}
		
		//사용자에게 나이 이름 핸드폰번호를 입력받아서
		// 나이(int),이름(String),핸드폰번호(String)
		// 로 연결된 하나의 문자열을 출력하라

		System.out.print("나이 입력 >> ");
		int age = sc.nextInt();
		
		System.out.print("이름 입력 >> ");
		String name = sc.next();
		
		System.out.print("휴대전화번호 입력 >> ");
		String phone_num2 = sc.next();
				
		System.out.println(age+","+name+","+phone_num2);
		
		// 사용자에게 영어 단어를 입력 받아서
		// 두번째 o부터 끝까지 잘라서 출력하라
		// ex) orange delicious --> ous
		System.out.print("영어 단어 입력 >> ");
		String word = sc.nextLine();
		
		int a = word.indexOf("o", 5);
		System.out.println("word.substring(a) : " + word.substring(a));
		
		// 사용자에게 띄어쓰기로 두 수를 입력 받아서 두 수를 더한 결과를 출력하라
		System.out.print("두수를 띄어쓰기로 입력(ex. 56 42)  >> ");
		String word2 = sc.nextLine();
		
		System.out.println(word2);
		
		String[] res2 = word2.split(" ");
		int num1 = 0;
		int num2 = 0;
		for (int i = 0; i < res2.length; i++) {
			System.out.println("res[i] : " + res2[i]);
			num1 = Integer.parseInt(res2[0]);
			num2 = Integer.parseInt(res2[1]);
		}
		System.out.println(num1+num2);
		
		// 제일 어려운 문제
	    // 사용자에게 한글로 숫자를 입력받아서 
	    // 숫자로 변경하여 출력하라
	    // ex) 입력 >> 일공이삼
	    // 출력 >> 1023
		
		System.out.print("숫자 한글로 입력 >> ");
		String word3 = sc.nextLine();
		
		String[] res3 = word3.split("");
		
		for (int i = 0; i < res3.length; i++) {
			if (res3[i] .equals ("일")) {
				res3[i]="1";
			} else if(res[i] .equals ("이")){
				res3[i]="2";
			} else if(res[i] .equals ("삼")){
				res3[i]="3";
			} else if(res[i] .equals ("사")){
				res3[i]="4";
			} else if(res[i] .equals ("오")){
				res3[i]="5";
			} else if(res[i] .equals ("육")){
				res3[i]="6";
			} else if(res[i] .equals ("칠")){
				res3[i]="7";
			} else if(res[i] .equals ("팔")){
				res3[i]="8";
			} else if(res[i] .equals ("구")){
				res3[i]="9";
			} else if(res3[i] .equals ("공")||res3[i] .equals ("영")){
				res3[i]="0";
			} else {
				res3[i]="X";
			}
		}
		System.out.println(String.join("", res3));
	}
}