package day07;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class MapTest {
	public static void main(String[] args) {
		HashMap<String, Integer> scores = new HashMap<>();	// String타입 key, Integer타입 value를 가지는 scores객체를 새로 정의
		HashMap<Integer, Integer> temp = new HashMap<>();	// Integer타입 key, Integer타입 value를 가지는 temp객체를 새로 정의
		temp.put(0, 100);	// temp의 0번째 key는 100 값을 추가
		temp.put(1, 90);	// temp의 1번째 key는 90 값을 추가
		temp.put(2, 80);	// temp의 2번째 key는 80 값을 추가
		temp.put(3, 70);	// temp의 3번째 key는 70 값을 추가
		temp.put(4, 60);	// temp의 4번째 key는 60 값을 추가
		System.out.println(temp.get(0));	// temp의 0번째 인덱스 출력
		
		System.out.println(scores);	// scores 출력
		System.out.println(scores.size());	// scores의 데이터 길이 출력
		System.out.println(scores.isEmpty());	//scores가 비어있다면 true 아니면 false return
		
		// 값 추가하기
		// put(key, value)
		scores.put("국어", 80);	// scores에 key "국어", value 80을 추가
		scores.put("영어", 70);	// scores에 key "영어", value 70을 추가		
		scores.put("수학", 80);	// scores에 key "수학", value 80을 추가
		scores.put("수학", 80);	// 순서가 존재하지 않는다, 
		
		System.out.println(scores);	// scores 출력
		System.out.println(scores.size());	// scores의 데이터 크기 출력
		
		System.out.println(scores.get("수학"));	// key값으로 불러와야함
		
		// 이미 존재하는 key를 사용하면 value가 수정된다
		scores.put("영어",100);	// scores에 key "영어", value 100을 추가이지만 "영어" key값이 존재하기에 수정이 됨
		System.out.println(scores);	// scores 출력
		
		System.out.println(scores.keySet());	// key값들만 모아놓은 Set(반복X)로 return
		for (String string : scores.keySet()) {	// String타입의 string에 scores의 키값들을 주고 전부 반복
			System.out.println("string : " + string);	// string 출력
		}
		
		System.out.println(scores.values());	// value값들만 모아놓은 Collection<Integer>로 return
		for (int num : scores.values()) {	// Integer를 안해도 되는 이유 -> Auto Unboxing
			System.out.println("num : " + num);	// num 출력
		}
		
		scores.entrySet();	// scores객체를 entrySet메소드 실행
		
		for (Entry<String,Integer> entry: scores.entrySet()) {	// Entry의 key는 String, value는 Integer인 entry는 scores를 entrySet메소드화 한 값을 넣어 전체 반복
			System.out.println("entry : " + entry);	// entry 출력
			// getKey() 해당 Entry의 key값을 return
			// getValue() 해당 Entry의 value값을 return
			System.out.println("key : "+ entry.getKey());	// key값 출력
			System.out.println("value : "+ entry.getValue()+"\n");	// value값 출력
		}
	}
}