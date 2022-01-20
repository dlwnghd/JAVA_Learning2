package day05;

import java.util.InputMismatchException;
import java.util.Scanner;	// java패키지.util클래스.Scanner메소드

public class ExceptionTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);	// Scanner 선언
		// 배열 안에 있는 요소를 나눠주는 프로그램
		int[] ar = {10, 20, 30};	// int타입배열 ar = {10, 20, 30}
		// 사용자에게 인덱스번호와 나눌 수를 입력 받아서
		// 해당 배열의 숫자를 나눈 결과를 보여주는 프로그램
		
				
		try {
			System.out.print("index 번호 입력 >> ");	// 사용자에게 index 번호 입력 유도
			int idx = sc.nextInt();	// 사용자 입력 값 int idx에 저장
			System.out.print("나눌 값 입력 >> ");	// 사용자에게 나눌 값 입력 유도
			int num = sc.nextInt();	// 사용자 입력 값 int num에 저장
			System.out.println("결과 : " + ar[idx] / num);	// 결과 출력
		}catch (ArrayIndexOutOfBoundsException e) {	// e에는 발생한 예외의 객체가 담기게 된다
//			e.printStackTrace();	// 예외의 종류를 출력하는 메소드
//			System.out.println(e.getMessage());	// getMessage() // 예외의 부연설명을 알려주는 메소드
			System.out.println("인덱스를 0부터2만 입력하시오");
		}catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다");
		}catch (InputMismatchException e) {
			System.out.println("숫자만 입력하세요");
		}catch (Exception e) {
			e.printStackTrace();
			System.out.println("오류가 발생함");
		}finally {	// 오류가 발생 하든 안하든 무조건 실행되는 영역
			System.out.println("오류가 발생 하든 안하든 무조건 실행되는 영역");
		}
		
		
		
		
		
		
		
		
		
		
		
		System.out.println("정상적으로 종료됨");
	}
}
