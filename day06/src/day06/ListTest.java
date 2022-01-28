package day06;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListTest {
	public static void main(String[] args) {
		// <> 안에는 리스트 안에 저장할 요소의 클래스 타입을 써줘야 한다
		ArrayList<Integer> ar = new ArrayList</* Integer */>();	// Integer[] ar = new Integer();
		System.out.println(ar);	// ar 출력
		// ar이라는 ArrayList에 값을 추가하기
		// add(요소(값)) --> 값을 리스트의 요소로 추가해준다
		ar.add(10);	// 자동으로 boxing됨, int타입 10이 Integer타입 10으로 변경됨, ar에 10 추가
		ar.add(35);	// 자동으로 boxing됨, int타입 35이 Integer타입 35으로 변경됨, ar에 35 추가
		ar.add(15);	// 자동으로 boxing됨, int타입 15이 Integer타입 15으로 변경됨, ar에 15 추가
		ar.add(10);	// 중복 허용, 순서가 존재
		ar.remove(0);
		System.out.println(ar);
		
		// size() : ArrayList 속의 요소 갯수를 int타입으로 return
		
		// get(인데스) : ArrayList안에 해당 인덱스 요소를 Integer타입으로 return
		for (int i = 0; i < ar.size(); i++) {	// int i는 0; 가 ar의 배열크기 미만동안; i++
			System.out.println(ar.get(i));	// ar의 i번째 데이터 출력
		}
//		System.out.println(ar.get(0));
//		System.out.println(ar.get(1));
//		System.out.println(ar.get(2));
//		System.out.println(ar.get(3));
//		System.out.println(ar.get(4)); // 인덱스 번호가 벗어나면 오류 발생
	
		// 값을 중간에 삽입하기
		// 1번째 인덱스에 100 삽입하기
		ar.add(1,100);	// ar배열의 1번째 배열에 100 삽입, 1번째에 있던 데이터는 뒤로 밀려남
		System.out.println(ar);	// ar 출력
		
		// remove(인덱스) : 해당 인덱스의 요소를 삭제한다
		ar.remove(1);	// 1번째 방 삭제, 데이터도 함께 삭제됨
		System.out.println(ar);		// ar 출력
		
		// isEmpty()
		System.out.println(ar.isEmpty());	// ar배열이 비어있니?, 맞으면 true, 아니면 false
		
		
		ArrayList<String> names = new ArrayList<String>();	// String[] names = new String();
		names.add("안녕");	// name배열에 "안녕" 추가
		names.add("반가워");	// name배열에 "반가워" 추가
		names.add("다음에");	// name배열에 "다음에" 추가
		names.add("또보자");	// name배열에 "또보자" 추가
		System.out.println(names);	// names배열 출력
		
		for(String n : names) {	// 빠른 for문,names배열안에 데이터를 String타입의 n으로 부르고 처음부터 끝까지 반복
			System.out.println(n);	// n 출력
		}
		
		// 실무
		// 리스트를 쓰고 있다는 가독성을 높이기 위해 이렇게 표현 하기도 한다
		List<Double> ar2 = new ArrayList<Double>();	// Double[] ar2 = new Double();
		
		// 제네릭을 생략하면 기본적으로 Object 타입이 들어간다
//		ArrayList temp = new ArrayList();
//		temp.add(10);
//		temp.add("안녕");
//		temp.add(3.1);
//		temp.add(true);
//		System.out.println(temp);
			
	}
}
