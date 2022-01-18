package day03;

public interface InterTest {	// 인터페이스
	// 상수화, 재정의가 불가능함
//	int num = 10;	// 일반 인스턴스 변수가 아님 (아래 참조↓)
	static final int num = 10;	// static과 final이 생략되어 나온 것
	
	public abstract void f1();	// 추상 메소드 f1()
	public void f2();	// abstract가 생략되었다고 생각하면됨, 일반메소드XXXXX
	
//	public void f() {
//		일반 메소드는 정의 불가능하다
//	}
}
