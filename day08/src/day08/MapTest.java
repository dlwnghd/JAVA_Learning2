package day08;

import java.util.HashMap;
import java.util.Map.Entry;

public class MapTest {
	public static void main(String[] args) {
		HashMap<Integer, HashMap<String, String>> students = new HashMap<>();
		HashMap<String, String> info1 = new HashMap<String, String>();
		info1.put("이름","김철수");
		info1.put("학과","컴퓨터");
		info1.put("나이","20");
		System.out.println(info1);	// HashMap
		
		System.out.println("--------------");
		System.out.println(info1.entrySet());	// Set
//		Set<Entry<String,String>>
		for (Entry<String, String> ent : info1.entrySet()) {
			System.out.println(ent.getKey());
			System.out.println(ent.getValue());
		}
		
		
		HashMap<String, String> info2 = new HashMap<String, String>();
		info2.put("이름","홍길동");
		info2.put("학과","경영");
		info2.put("나이","23");
		System.out.println(info2);
		
		students.put(2021001, info1);
		students.put(2017002, info2);
		
		System.out.println(students);
		
		
		System.out.println(students.get(2021001));
		
		// students타입의 2021001의 "학과" 벨류를 가져와라
		System.out.println(students.get(2021001).get("학과"));
	}
}
