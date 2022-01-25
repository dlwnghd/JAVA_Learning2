package day08;

import java.util.HashMap;
import java.util.Map.Entry;

public class MapTest {
	public static void main(String[] args) {
		HashMap<String, String> info1 = new HashMap<String, String>();	// HashMap의 <String타입 key와 String타입 value>를 받음
		HashMap<Integer, HashMap<String, String>> students = new HashMap<>();	// HashMap의<Integer타입 key와, HashMap타입 value를 받음>
		info1.put("이름","김철수");	// key : 이름, value : 김철수
		info1.put("학과","컴퓨터");	// key : 학과, value : 컴퓨터
		info1.put("나이","20");	// key : 나이, value : 20(String)
		System.out.println(info1);	// HashMap을 출력
		
		System.out.println("--------------");	// 출력
		System.out.println(info1.entrySet());	// Set
//		Set<Entry<String,String>>
		for (Entry<String, String> ent : info1.entrySet()) {	// Entry의 <String(key), String(value)> ent에 info1의 세트만큼 반복
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
