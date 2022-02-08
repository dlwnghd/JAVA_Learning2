package day09;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReaderTest {
	public static void main(String[] args) {
//		0. 파일객체만들기
		File f = new File("D:\\1600_java2_ljh\\memo\\temp.txt");	// File타입 f를 괄호안의 경로에 생성
		FileReader fr = null;	// FileReader타입 fr객체를 정의
		BufferedReader br = null;	// BufferedReader타입 br객체를 정의

		try {
//		1. 파일 데이터가 전송될 수 있게 스트림열기
			fr = new FileReader(f);	// fr객체는 FileReader
//		1-2. 버퍼 생성하기		-> 버퍼란?
			br = new BufferedReader(fr);	// br객체는 BufferedReader

//			2.  읽기
			// readLine() : 한 줄의 문자열을 return하며, 더이상 읽을 내용이 없으면 null이 return 된다
//			String line = br.readLine(); // String타입 line은 br객체의 readLine메소드의 return값
//			while (line != null) {	// line이 null값이 아닌 동안
//				System.out.println(br.readLine());	// br.readLine 출력
//				line = br.readLine();	// 다음 줄 line에 넣어주기
//			}
			
			String line = "";	// String타입 line은 "" 정의
			while ((line = br.readLine()) != null) {	// line에 br.readLine()을 넣어주고 그 값이 null이 아니면 반복
				System.out.println(line);	// line 출력
			}
			
			
			
		} catch (IOException e) {	// IOException 오류 발생시 e객체로 받아옴
			e.printStackTrace();	// e객체의 printStackTrace메소드 실행
		} finally {	// 무조건 실행
			try {	// 영역잡기 단축키 : alt + shift + z
//		3-0. 버퍼 닫기
				if (br != null) br.close();	// if 한줄 처리 시 -> {} 생략, br객체가 null값이 아니라면 br의 close메소드 실행
//				3. 스트림 닫기 -> data leak 막기(데이터 누수 막기)
				if (fr != null) fr.close();	// fr객체가 null값이 아니라면 fr의 close메소드 실행
			}catch(IOException e){	// IOException 오류 발생시 e객체로 받아옴
			}
		}
	}
}
