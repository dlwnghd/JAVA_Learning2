package accessTest;

public class Test {
	private int a;		// private 정의
	protected int b;	// protected 정의
	int c;				// default 정의
	public int d;		// public 정의

	public void f() {	// f 메소드
		System.out.println("같은 클래스에서 사용가능한지 확인용 메소드");
		System.out.println(a);	// private 가능
		System.out.println(b);	// protected 가능
		System.out.println(c);	// default 가능
		System.out.println(d);	// public 가능
		f1();	// private 가능
		f2();	// protected 가능
		f3();	// default 가능
		f4();	// public 가능
	}

	// private 메소드
	private void f1() {
		System.out.println("private 메소드"); // 출력문
	}

	// protected 메소드
	protected void f2() {
		System.out.println("protected 메소드"); // 출력문
	}

	// default 메소드
	void f3() {
		System.out.println("default 메소드"); // 출력문
	}

	//public 메소드
	public void f4() {
		System.out.println("public 메소드"); // 출력문
	}
}