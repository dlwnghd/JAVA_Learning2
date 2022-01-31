package innerTest;

public class Main {
	public static void main(String[] args) {
		Outer o = new Outer();	// Outer 객체o 생성
		Outer o2 = new Outer();	// Outer 객체o2 생성
		
		o.f();	// o객체 안에 있는 f()메소드 출력
		o.ov = 10;	// o객체 안에 있는 ov = 10
		
		// Outer클래스 내의 InnerInstance클래스 안의 oii1 = 외부클래스의 객체 필요
		Outer.InnerInstance oii1 = o.new InnerInstance();	// 객체화, Outer클래스의 InnerInstance클래스 oii객체는 외부클래스의 객체 o의 새로운 InnerInstacne타입을 만듬
		Outer.InnerInstance oii2 = o2.new InnerInstance();	// 객체화, Outer클래스의 InnerInstance클래스 oii2객체는 외부클래스의 객체 o2의 새로운 InnerInstacne타입을 만듬
		oii1.iiv = 1000;
		System.out.println("oii1.iiv : " + oii1.iiv);	// 외부클래스의 내부클래스의 객체 oii1에 있는 iiv값 출력
		System.out.println("oii2.iiv : " + oii2.iiv);	// 외부클래스의 내부클래스의 객체 oii2에 있는 iiv값 출력
		
		Outer.InnerStatic ois = new Outer.InnerStatic();	// 객체화, Outer클래스의 InnerStaic클래스 ois객체는 외부클래스 Outer클래스 아에 있는 InnerStatic호출 하여 만듬
		System.out.println("ois.isv : " + ois.isv);
	}
}
