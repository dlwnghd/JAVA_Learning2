package innerTest;

public class Main {
	public static void main(String[] args) {
		Outer o = new Outer();	// Outer 객체 생성
		Outer o2 = new Outer();	// Outer 객체 생성
		
		o.f();	// o객체 안에 있는 f()메소드 출력
		o.ov = 10;	// o객체 안에 있는 ov = 10
		
		// Outer클래스 내의 InnerInstance클래스 안의 oii1 = 외부클래스의 객체 필요
		Outer.InnerInstance oii1 = o.new InnerInstance();	// 객체화
		Outer.InnerInstance oii2 = o2.new InnerInstance();
		oii1.iiv = 1000;
		System.out.println(oii1.iiv);
		System.out.println(oii2.iiv);
		
		Outer.InnerStatic ois = new Outer.InnerStatic();	// 객체화
		System.out.println(ois.isv);
	}
}
