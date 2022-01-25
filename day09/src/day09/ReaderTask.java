package day09;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReaderTask {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 >> ");
		int num = sc.nextInt();		
		
		// memo 폴더 안의 task.txt 파일에서
		File f = new File("..\\..\\memo\\task.txt");
		FileReader fr = null;
		BufferedReader br = null;
		// 사용자에게 콘솔창으로 정수를 입력받는다
		// 정수 입력 >> 5
		try {
			fr = new FileReader(f);
			br = new BufferedReader(fr);
			// 콘솔창에 5번줄까지 출력하기

			// 사용자가 원하는 줄까지 콘솔창에 출력하기
			for(int i = 0; i < num; i++) {
				System.out.println(br.readLine());	// line 출력
			}
			
			
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null) {
					br.close();
				}
				if (fr != null) {
					fr.close();
				}
			} catch (IOException e) {

			}
		}
//		1. 파일 데이터가 전송될 수 있게 스트림열기
//		1-2. 버퍼 생성하기		-> 버퍼란?
//		3-0. 버퍼 닫기
//		3. 스트림 닫기
	}

}
