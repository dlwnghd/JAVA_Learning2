package innerTest;

public class Main {
	public static void main(String[] args) {
		Outer o = new Outer();
		Outer o2 = new Outer();
		
		o.f();
		o.ov = 10;
		Outer.InnerInstance oii1 = o.new InnerInstance();
		Outer.InnerInstance oii2 = o2.new InnerInstance();
		oii1.iiv = 1000;
		System.out.println(oii1.iiv);
		System.out.println(oii2.iiv);
		
		Outer.InnerStatic ois = new Outer.InnerStatic();
		System.out.println(ois.isv);
	}
}
