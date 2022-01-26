package movieDAO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class DBConnection {
	public static BufferedReader read() throws IOException{
		File file = new File("movie.txt.txt");
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		return br;
	}
	
	public static BufferedWriter write() throws IOException{
		File file = new File("movie.txt");
		FileWriter fw = new FileWriter(file);
		BufferedWriter bw = new BufferedWriter(fw);
		
		return bw;
	}
}
