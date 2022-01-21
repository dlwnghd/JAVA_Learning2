package day07;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class MapTest {
	public static void main(String[] args) {
		HashMap<String, Integer> scores = new HashMap<>();	// String타입 key, Inger타입 value
		HashMap<Integer, Integer> temp = new HashMap<>();
		temp.put(0, 100);
		temp.put(1, 90);
		temp.put(2, 80);
		temp.put(3, 70);
		temp.put(4, 60);
		System.out.println(temp.get(0));
		
		
		
		
		System.out.println(scores);
		System.out.println(scores.size());
		System.out.println(scores.isEmpty());
		
		// 값 추가하기
		// put(key, value)
		scores.put("국어", 80);
		scores.put("영어", 70);		
		scores.put("수학", 80);	// 순서가 존재하지 않는다
		scores.put("수학", 80);	// 순서가 존재하지 않는다
		System.out.println(scores);
		System.out.println(scores.size());
		
		System.out.println(scores.get("수학"));	// key값으로 불러와야함
		
		// 이미 존재하는 key를 사용하면 value가 수정된다
		scores.put("영어",100);
		System.out.println(scores);
		
		System.out.println(scores.keySet());	// key값들만 모아놓은 Set로 return
		for (String string : scores.keySet()) {
			System.out.println(string);
		}
		
		System.out.println(scores.values());	// value값들만 모아놓은 Collection<Integer>로 return
		for (int num : scores.values()) {	// Integer를 안해도 되는 이유 -> Auto Unboxing
			System.out.println(num);
		}
		
		scores.entrySet();
		
		for (Entry<String,Integer> entry: scores.entrySet()) {
			System.out.println(entry);
			// getKey() 해당 Entry의 key값을 return
			// getValue() 해당 Entry의 value값을 return
			System.out.println("Key : "+ entry.getKey());
			System.out.println("Value : "+ entry.getValue()+"\n");
		}
		
		
		
		
		
		
		
	}
}