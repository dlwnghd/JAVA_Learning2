package innerTest;


public class Outer {
	
	int ov = 10;	// 일반적인 변수
	static int osv = 100;	// static 변수
	
	// 내부 인스턴스클래스
	class InnerInstance{
		int iiv = 20;	// 내부 인스턴스 변수
	}
	
	// 내부 스태틱클래스
	static class InnerStatic{
		int isv = 30;	// 내부 스택틱 변수
	}
	
	
	// 메소드 내부에서만 클래스가 필요할 때 사용한다(지역클래스)
	public void f() {

		// 내부 지역클래스
		class InnerLocal{
			int ilv = 40;	// 내부 지역 변수
		}
		
		InnerLocal il = new InnerLocal();	// 객체화
		System.out.println(il.ilv);	// il 내부의 ilv 출력
	}
//	InnerLocal il	// 오류! : InnerLoval타입 없음
}