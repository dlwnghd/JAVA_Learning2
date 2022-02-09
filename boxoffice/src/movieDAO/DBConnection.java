package movieDAO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class DBConnection {
	// BufferedReader타입으로 값을 돌려주는 read()메소드 IOException 오류 발생시 넘기기(throws : 쓰는 사람이 알아서 처리해라)
	public static BufferedReader read() throws IOException{ // BufferedReader타입으로 return하는 read메소드
		File file = new File("movie.txt");	// 파일 위치 불러오기
		FileReader fr = new FileReader(file);	// 파일 읽기
		BufferedReader br = new BufferedReader(fr);	// 버퍼 읽기
		return br;	// br값 돌려주기
	}

	// BufferedWriter타입으로 값을 돌려주는 write()메소드 IOException 오류 발생시 넘기기(throws : 쓰는 사람이 알아서 처리해라)
	public static BufferedWriter write() throws IOException{ // BufferedWriter타입으로 return하는 write메소드 
		File file = new File("movie.txt");	// 파일 위치 불러오기
		FileWriter fw = new FileWriter(file);	// 파일 쓰기
		BufferedWriter bw = new BufferedWriter(fw);	// 버퍼 쓰기
		return bw;	// bw값 돌려주기
	}
}