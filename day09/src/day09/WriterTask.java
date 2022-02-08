package day09;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriterTask {
	public static void main(String[] args) {
		// memo폴더 안에 task.txt 파일에다가
		// 0번째줄입니다
		// 1번째줄입니다
		// ...
		// 9번째줄입니다
		// 메모장에 출력하기
		
//		0. 파일객체만들기
		File f = new File("..\\..\\memo\\task.txt");	// File타입 f객체를 File 상대경로에 없다면 생성
		
		FileWriter fw = null;	// Stream을 열기위한 FileWriter타입 fw 정의
		BufferedWriter bw = null;	// Buffer를 열기위한 BufferedWriter타입 bw 정의
		
		try {
//			1. 파일 데이터가 전송될 수 있게 스트림열기
			fw = new FileWriter(f, false);	// fw는 File객체 f 받아오기, false(덮어쓰기)
//			1-2. 버퍼 생성하기
			bw = new BufferedWriter(fw);	// bw는 FileWriter객체 fw 받아오기
//			2.  쓰기
			for (int i = 0; i < 10; i++) {	// int i는 0; i가 10미만동안 반복; i++
				bw.write(i+"번째 줄입니다\n");	// bw에 "i번째 줄입니다\n" 출력
			}
			
			
		}catch(IOException e){	// IOException 오류 발생시 e객체로 받아옴
			e.printStackTrace();	// e객체의 printStackTrace메소드 실행
		}finally {
			try {
//				3-0. 버퍼 닫기
				if (bw != null) bw.close();	// if 한줄 처리 시 -> {} 생략, bw객체가 null값이 아니라면 bw의 close메소드 실행
//				3. 스트림 닫기 -> data leak 막기(데이터 누수 막기)
				if (fw != null) fw.close();	// fw객체가 null값이 아니라면 fw의 close메소드 실행
			}catch(IOException e){
				
			}
		}
	}
}
