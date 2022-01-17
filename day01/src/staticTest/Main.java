package staticTest;

import accessTest.Test;

public class Main {
	public static void main(String[] args) {
		Test t = new Test();	// Test타입의 t객체 = 연산자 new Student()로 매모리 위치를 알려줌
		System.out.println(t.d); // public만 사용 가능
		t.f4(); //public만 사용 가능
		
		Korean kim = new Korean("김철수", 10);	// Korean타입의 kim객체 = Korean타입("김철수", 10)을 저장
		Korean park = new Korean("박영희", 20);	// Korean타입의 park객체 = Korean타입("박영희", 20)을 저장
		
		kim.name = "김수정됨";		// Korean타입 kim의 name에 "김수정됨" 저장
		System.out.println(kim.name);	// kim객체의 name 출력
		System.out.println(park.name);	// park객체의 name 출력
		
		// 이 코드는 사실 이해를 위해 작성 됐을 뿐 올바른 방법은
		// Korean.country = "USA"; 로 해야 한다.
		kim.country = "USA";	// kim객체의 country변수에 "USA" 저장
		// kim객체 내의 country값을 "USA"로 바꾼다고 하지만 
		// country가 static 제어자(modifier)로 불려서
		// 값을 공유할 뿐이지, kim이나 park 객체 안에 존재하는 값은 아니다.
		
		Korean.country = "USA";	// Korean객체의 country변수에 "USA" 저장
		System.out.println(kim.country);	// kim객체의 country변수 출력
		System.out.println(park.country);	// park객체의 country변수 출력
		// 스태틱 변수는 모든 인스턴스(객체)가 값을 공유하기 때문에
		// 인스턴스가 중요하지 않다 따라서 클래스명.변수명 으로 사용할 수 있다
		System.out.println(Korean.country);	// Korean객체의 country변수 출력
		
		kim.show();	// kim객체의 show메소드 출력
		park.show();	// park객체의 show메소드 출력
		
		Korean.show();	// 클래스명.메소드명();
		//
	}
}