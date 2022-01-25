package day09;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriterTest {
	public static void main(String[] args) {
		// 파일로 출력(파일에 쓰기)
//		0. 파일객체만들기
		// 생성자에는 내가 사용할 파일의 경로를 써준다
		// 처음부터 끝까지 경로를 알려주는 방식 : 절대경로
		// 'test.txt' --> 상대경로 : 내 프로젝트의 위치에 따라서 달라지는 방식
		// .. : 상위 폴더를 의미한다 \\ : 폴더 안을 의미한다
		// Write 할 때
		File f1 = new File("..\\..\\memo\\temp.txt");

//		File f = new File("D:\\1600_java2_ljh\\memo\\temp.txt"); // 파일 경로
		FileWriter fw = null;
		BufferedWriter bw = null;

		try {
//			1. 파일 데이터가 전송될 수 있게 스트림열기
			// 생성자 매개변수로 내가 사용할 파일 객체를 써준다
			fw = new FileWriter(f1, false); // File 객체 f1 받아오기, false or 생략시 : 덮어쓰기
//			fw = new FileWriter(f,true); // File 객체 f 받아오기, true : 덧붙이기
//			1-2. 버퍼 생성하기		-> 버퍼란?
			// 생성자 매개변수로는 내가 열어놓은 스트림 객체를 써준다
			bw = new BufferedWriter(fw); // FileWriter 객체 fw 받아오기
//			2.  쓰기
			// write() : 파일에 문자열 값을 출력해준다, 줄바꿈은 포함하지 않는다
			bw.write("안녕하세요\n");
			bw.write("Surprise Mother Father\n");
			bw.write("상대경로를 통해 \n다른 폴더에 있는 파일을 바꿨어요\n");
			bw.write("오늘은\n화요일입니다.");

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {

			try {
//				3-0. 버퍼 닫기
				if (bw != null) {
					bw.close();
				}
//				3. 스트림 닫기 -> data leak 막기(데이터 누수 막기)
				if (fw != null) {
					fw.close();
				}
			} catch (IOException e) {

			}
		}

	}
}
