package day09;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReaderTask {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // Scanner 호출
		System.out.print("정수 입력 >> "); // 정수 입력 유도
		int num = sc.nextInt(); // 사용자가 입력한 값 int타입의 num으로 정의

		// memo 폴더 안의 task.txt 파일에서
		File f = new File("..\\..\\memo\\task.txt"); // File타입 f는 괄호안의 위치 파일이 없다면 생성 아니면 정의
//		1. 파일 데이터가 전송될 수 있게 스트림열기
		FileReader fr = null; // FileReader타입 fr은 null값
//		1-2. 버퍼 생성하기		-> 버퍼란?
		BufferedReader br = null; // BufferedReader타입 br은 null값

		// 사용자에게 콘솔창으로 정수를 입력받는다
		// 정수 입력 >> 5
		try {
			fr = new FileReader(f); // fr은 FileReader타입의 f값
			br = new BufferedReader(fr); // br은 BufferedReader타입의 fr값
			// 콘솔창에 5번줄까지 출력하기

			// 사용자가 원하는 줄까지 콘솔창에 출력하기
			for (int i = 0; i < num; i++) { // int i는 0; i가 nu 미만동안 반복; i++
				System.out.println(br.readLine()); // br.readLine() 출력
			}

		} catch (IOException e) { // 오류 IOException발생 시 e객체로 받아옴
			e.printStackTrace(); // e객체의 printStackTrace 메소드 실행
		} finally { // 무조건 실행
			try {
//		3-0. 버퍼 닫기
				if (br != null) br.close(); // if 한줄 처리 시 -> {} 생략, br객체가 null값이 아니라면 br의 close메소드 실행
//				3. 스트림 닫기 -> data leak 막기(데이터 누수 막기)
				if (fr != null) fr.close(); // fr객체가 null값이 아니라면 fr의 close메소드 실행
			} catch (IOException e) { // IOException 오류 발생시 e객체로 받아옴
			}
		}
	}

}
