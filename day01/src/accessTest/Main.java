package accessTest;

public class Main {
	public static void main(String[] args) {
		Test t = new Test();	// Test타입의 t객체 = 연산자 new Student()로 매모리 위치를 알려줌
//		System.out.println(t.a); private 사용 불가
		System.out.println(t.b);	// protected 사용 가능
		System.out.println(t.c);	// default 사용 가능
		System.out.println(t.d);	// public 사용 가능
//		t.f1(); private은 사용 불가
		t.f2();	// protected 메소드 사용 가능
		t.f3();	// default 메소드 사용 가능
		t.f4();	// public 메소드 사용 가능
	}
}