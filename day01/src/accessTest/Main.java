package accessTest;

public class Main {
	public static void main(String[] args) {
		Test t = new Test();
//		System.out.println(t.a); private 사용 불가
		System.out.println(t.b);
		System.out.println(t.c);
		System.out.println(t.d);
//		t.f1(); private은 사용 불가
		t.f2();
		t.f3();
		t.f4();
	}
}
