package day03;

public abstract class Parent {	// 추상 클래스(abstract class), 상속받은 클래스에 메소드를 만들지 않았을 경우 강제성을 부여함
	int num;	// 변수 정의 가능, 일반 변수도 존재 가능
	
	public void normal() {
		System.out.println("일반메소드 존재 가능");	// 일반 메소드 존재 가능
	}
	
	public abstract void f();	// 추상 메소드, f()라는 메소드는 추상메소드이다, 미구현 상태
}