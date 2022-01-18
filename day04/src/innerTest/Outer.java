package innerTest;


public class Outer {
	int ov = 10;
	static int osv = 100;
	
	
	class InnerInstance{
		// 인스턴스클래스
		int iiv = 20;
	}
	
	static class InnerStatic{
		// 스태틱클래스
		int isv = 30;
	}
	
	public void f() {
		// 메소드 내부에서만 클래스가 필요할 때 사용한다(지역클래스)
		class InnerLocal{
			int ilv = 40;
		}
		
		InnerLocal il = new InnerLocal();
		System.out.println(il.ilv);
	}
}