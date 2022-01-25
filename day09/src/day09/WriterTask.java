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
		File f = new File("..\\..\\memo\\task.txt");	// 파일 경로
		
		FileWriter fw = null;	// FileWrit
		BufferedWriter bw = null;
		
		try {
//			1. 파일 데이터가 전송될 수 있게 스트림열기
			fw = new FileWriter(f, false);
//			1-2. 버퍼 생성하기
			bw = new BufferedWriter(fw);
//			2.  쓰기
			for (int i = 0; i < 10; i++) {
				bw.write(i+"번째 줄입니다\n");
			}
			
			
		}catch(IOException e){
			e.printStackTrace();
		}finally {
			try {
//				3-0. 버퍼 닫기
				if(bw != null) {bw.close();}
//				3. 스트림 닫기
				if(fw != null) {fw.close();}				
			}catch(IOException e){
				
			}
		}
	}
}
