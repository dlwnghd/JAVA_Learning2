package day09;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReaderTest {
	public static void main(String[] args) {
//		0. 파일객체만들기
		File f = new File("D:\\1600_java2_ljh\\memo\\temp.txt");
		FileReader fr = null;
		BufferedReader br = null;

		try {
			fr = new FileReader(f);
			br = new BufferedReader(fr);

//			2.  읽기
			// readLine() : 한 줄의 문자열을 return하며, 더이상 읽을 내용이 없으면 null이 return 된다
			
//			String line = br.readLine();
//			while (line != null) {
//				System.out.println(br.readLine());
//				line = br.readLine();	// 다음 줄 line에 넣어주기
//			}
			
			String line = "";
			while ((line = br.readLine()) != null) {	// line에 br.readLine()을 넣어주고 그 값이 null이 아니면 반복
				System.out.println(line);	// line 출력
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
