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
		// 내 프로젝트의 위치에 따라서 달라지는 방식 : 상대경로 
		// .. : 상위 폴더를 의미한다 
		// \\ : 폴더 안을 의미한다
		// Write 할 때 해당 파일이 존재하지 않는다면 파일을 만들어준다 
		File f1 = new File("..\\..\\memo\\temp.txt");	// File타입 객체 f1은 괄호안의 경로에 생성(파일 존재시 생성하지 않음) <- 상대경로
//		File f1 = new File("D:\\1600_java2_ljh\\memo\\temp.txt");	// 절대경로

//		File f = new File("D:\\1600_java2_ljh\\memo\\temp.txt"); // 파일 경로
		FileWriter fw = null;	// Stream 열기위한 FileWriter타입 fw객체 정의, 안전하게 null값을 줌
		BufferedWriter bw = null;	// Buffer를 열기위한 BufferedWriter타입 bw객체 정의, 안전하게 null값을 줌

//			1. 파일 데이터가 전송될 수 있게 스트림열기
		try {
			// 생성자 매개변수로 내가 사용할 파일 객체를 써준다
			fw = new FileWriter(f1, false); // File 객체 f1 받아오기, false or 생략시 : 덮어쓰기
//			fw = new FileWriter(f1,true); // File 객체 f 받아오기, true : 덧붙이기, 덧붙일 시 줄바꿈이 없었다면 바로 옆에서 부터 시작

//			1-2. 버퍼 생성하기		-> 버퍼란?
			// 생성자 매개변수로는 내가 열어놓은 스트림 객체를 써준다
			bw = new BufferedWriter(fw); // 객체 bw는 FileWriter타입 객체 fw 받아오기

//			2.  쓰기
			// write() : 파일에 문자열 값을 출력해준다, 줄바꿈은 포함하지 않는다
			bw.write("안녕하세요\n");	// bw에 괄호안의 값을 출력, \n으로 줄바꿈을 의도적으로 줌
			bw.write("Surprise Mother Father\n");	// bw에 괄호안의 값을 출력, \n으로 줄바꿈을 의도적으로 줌
			bw.write("상대경로를 통해 \n다른 폴더에 있는 파일을 바꿨어요\n");	// bw에 괄호안의 값을 출력, \n으로 줄바꿈을 의도적으로 줌
			bw.write("오늘은\n화요일입니다.");	// bw에 괄호안의 값을 출력, \n으로 줄바꿈을 의도적으로 줌

		} catch (IOException e) {	// IOException타입의 오류 발생시 e객체로 받음(예외처리)
			// TODO Auto-generated catch block
			e.printStackTrace();	// e의 printStackTrace메소드 실행
		} finally {	// 무조건적으로 실행

			try {
//				3-0. 버퍼 닫기
				if (bw != null) bw.close();	// if 한줄 처리 시 -> {} 생략, bw객체가 null값이 아니라면 bw의 close메소드 실행
//				3. 스트림 닫기 -> data leak 막기(데이터 누수 막기)
				if (fw != null) fw.close();	// fw객체가 null값이 아니라면 fw의 close메소드 실행
			} catch (IOException e) {	// IOException 오류 발생시 e 객체로 받음(예외처리)

			}
		}

	}
}
