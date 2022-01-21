package day07;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class SetTest {
	public static void main(String[] args) {
		HashSet<String> s = new HashSet<>();
		System.out.println("s : " + s);
		// size() : 세트의 크기
		System.out.println("s.size() : " + s.size());
		// isEmpty() : 비어있을때 true, 아니며 false return
		System.out.println("s.isEmpty() : " + s.isEmpty());
		
		// add(값) : 값을 세트에 추가한다, 중복된 값이 있다면 1개만 추가된다
		s.add("banana");
		s.add("apple");
		s.add("grape");
		s.add("peach");
		s.add("apple");	// 중복된 값은 저장 불가능
		System.out.println("s : " + s);	// 순서가 없음
		
		// remove(값) : 값을 세트에서 삭제한다
		System.out.println("s.remove(\"banana\") : " + s.remove("banana"));
		System.out.println("s.remove(\"banananananananana\") : " + s.remove("banananananananana"));
		System.out.println("s : " + s);
		
		// 세트의 개별적 요소를 각각 조회하는 방법
		// iterator : 순서를 부여해준다
		Iterator<String> iter = s.iterator();
		// hasNext() --> 꺼낼 요소가 남아있다면 true를, 없다면 false를 return
		// next() --> 요소를 return 한다
		
		while(iter.hasNext()) {
			System.out.println("iter.next() : "+iter.next());
		}
		
//		System.out.println(iter.hasNext());
//		System.out.println(iter.next());
//
//		System.out.println(iter.hasNext());
//		System.out.println(iter.next());
//		
//		System.out.println(iter.hasNext());
//		System.out.println(iter.next());
//				
//		System.out.println(iter.hasNext());
////		System.out.println(iter.next()); 세트의 요소 갯수가 다 없어지면 오류
		
		System.out.println("-빠른for문을 통한 조회-");
		for (String fruit : s) {
			System.out.println("fruit : " + fruit);
		}
		
		
		ArrayList<String> temp = new ArrayList<>();
		temp.add("hello");
		temp.add("nice");
		temp.add("to");
		temp.add("meet");
		temp.add("you");
		
		// iterator()는 컬렉션 타입의 요소를 읽어오는데에 표준화를 제공하기 위해 만든 것이다
		Iterator<String> it = temp.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		for (int i = 0; i < temp.size(); i++) {
			System.out.println(temp.get(i));
		}
		
	}
}