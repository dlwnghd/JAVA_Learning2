package day07;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class SetTest {
	public static void main(String[] args) {
		HashSet<String> s = new HashSet<>();	// HashSet을 String타입의 s객체로 새로 지정
		System.out.println("s : " + s);	// s 출력
		// size() : 세트의 크기
		System.out.println("s.size() : " + s.size());	// s의 크기 출력
		// isEmpty() : 비어있을때 true, 아니며 false return
		System.out.println("s.isEmpty() : " + s.isEmpty());	// s가 비어있는지 확인하는 메소드 실행
		
		// add(값) : 값을 세트에 추가한다, 중복된 값이 있다면 1개만 추가된다
		s.add("banana");	// s객체에 banana추가
		s.add("apple");	// s객체에 apple추가
		s.add("grape");	// s객체에 grape추가
		s.add("peach");	// s객체에 peach추가
		s.add("apple");	// 중복된 값은 저장 불가능, 코드의 실행에 오류는 없으나 실행결과는 없음
		System.out.println("s : " + s);	// 순서가 없음
		
		// remove(값) : 값을 세트에서 삭제한다
		System.out.println("s.remove(\"banana\") : " + s.remove("banana"));	// s객체에서 banana라는 값을 찾아서 삭제하고 true값을 return
		System.out.println("s.remove(\"banananananananana\") : " + s.remove("banananananananana"));	// 존재하지 않는 값은 삭제할 수 없어서 false값을 return
		System.out.println("s : " + s);	// banana가 삭제된 객체 s 출력
		
//		Set의 경우 순서가 없기 때문에 get()을 이용해서 특정값을 빼기 힘들다
//		따라서 iterator라는 메소드를 통해 순서를 부여해서 찾음
		
		// 세트의 개별적 요소를 각각 조회하는 방법
		// iterator : 순서를 부여해준다
		Iterator<String> iter = s.iterator();	// Iterator의 String타입 iter에 s객체로 순서를 부여해줌
		// hasNext() --> 꺼낼 요소가 남아있다면 true를, 없다면 false를 return
		// next() --> 요소를 return 한다
		
		while(iter.hasNext()) {	// 객체iter에 뺄 수 있는 값 혹은 요소가 남아있다면 반복
			System.out.println("iter.next() : "+iter.next());	// iter의 요소를 return
		}
		// ↓반복을 줄임
		
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
		for (String fruit : s) {	// String타입의 fruit에 s값을 차례대로 넣으면서 반복
			System.out.println("fruit : " + fruit);	// fruit값을 출력
		}
		
		
		ArrayList<String> temp = new ArrayList<>();	// ArrayList에 String타입 temp는 배열로 새롭게 정의
		temp.add("hello");	// temp에 "hello"추가
		temp.add("nice");	// temp에 "nice"추가
		temp.add("to");		// temp에 "to"추가
		temp.add("meet");	// temp에 "meet"추가
		temp.add("you");	// temp에 "you"추가
		
		// iterator()는 컬렉션 타입의 요소를 읽어오는데에 표준화를 제공하기 위해 만든 것이다
		Iterator<String> it = temp.iterator();	// Iterator의 String타입 it는 temp의 순서를 부여한 값을 넣어줌
		while(it.hasNext()) {	// it에 빼낼 요소나 값이 남아있는 동안 반복
			System.out.println(it.next());	// it의 요소를 return
		}
		
		
		for (int i = 0; i < temp.size(); i++) {	// int i는 0; i가 temp의 데이터길이의 미만 동안 반복; i++
			System.out.println(temp.get(i));	// temp의 i번째 데이터 출력
		}
		
	}
}