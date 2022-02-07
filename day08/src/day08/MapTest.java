package day08;

import java.util.HashMap;
import java.util.Map.Entry;

public class MapTest {
	public static void main(String[] args) {
		HashMap<String, String> info1 = new HashMap<String, String>();	// HashMap의 <String타입 key와 String타입 value>를 받음
		
		// HashMap안에 HashMap
		HashMap<Integer, HashMap<String, String>> students = new HashMap<>();	// HashMap의<Integer타입 key와, HashMap타입 value를 받음>
		info1.put("이름","김철수");	// info1에 key : 이름, value : 김철수 추가
		info1.put("학과","컴퓨터");	// info1에 key : 학과, value : 컴퓨터 추가
		info1.put("나이","20");	// info1에 key : 나이, value : 20(String) 추가
		System.out.println(info1);	// HashMap info1을 출력
		
		System.out.println("--------------");	// 출력
		System.out.println(info1.entrySet());	// Set info1을 출력
//		Set<Entry<String,String>>	↓
//		Set인데 요소로 Entry타입으로 들어가고 제네릭으로 String, String이 들어간다
		
		
		for (Entry<String, String> ent : info1.entrySet()) {	// Entry의 <String(key), String(value)> ent에 info1의 엔트리세트만큼 반복
			System.out.println(ent.getKey());	// ent의 getKey 메소드 출력, key값을 출력
			System.out.println(ent.getValue());	// ent의 getValue 메소드 출력, value값을 출력
		}
		
		
		HashMap<String, String> info2 = new HashMap<String, String>();	// HashMap의 <String타입 key와 String타입 value>를 받음
		info2.put("이름","홍길동");	// info2에 key : 이름, value : 홍길동 추가
		info2.put("학과","경영");	// info2에 key : 학과, value : 경영 추가
		info2.put("나이","23");	// info2에 key : 나이, value : 23(String) 추가
		System.out.println(info2);	// info2을 출력
		
		students.put(2021001, info1);	// students에 2021001, info1 추가
		students.put(2017002, info2);	// students에 2017002, info2 추가
		
		// students HashMap을 출력
		System.out.println(students);	// students 출력
		
		// students HashMap의 key가 2021001 출력
		System.out.println(students.get(2021001));	// students의 2021001의 value 출력
		
		// students HashMap의 key가 2021001의 벨류가 "학과"인 것 가져와라
		System.out.println(students.get(2021001).get("학과"));	// students타입의 2021001의 "학과" value를 출력
	}
}
