package anonyTest;

import day04.SecondMan;
import day04.Soldier;

public class Main {
	public static void main(String[] args) {
		Car c = new Car() {	// Car타입의 c객체
			public void engineOn() {	// 자식 클래스에서 새로 정의한 engineOn메소드
			}
			
			@Override
			public void go() {	// go()메소드를 재정의
				super.go();	// 부모 클래스의 go를 실행
			}
		};
		
		
		Soldier s2  = new SecondMan();	// Soldier타입의 s2객체는 SecondMan클래스로 생성
		s2.eat();	// s2객체의 eat메소드 실행

		
		Soldier s = new Soldier() {	// 익명의 내부 클래스 생성	, 업캐스팅
			
			// 일반 메소드
			public void f() {
				System.out.println("익명클래스에서 정의된 메소드");
			}
			
			// 오버라이딩
			@Override
			public void eat() {
				System.out.println("오버라이딩 eat");
			}

			// 오버라이딩
			@Override
			public void work() {
				System.out.println("오버라이딩 work");
			}

			// 오버라이딩
			@Override
			public void sleep() {
				System.out.println("오버라이딩 sleep");
			}
			
		};
		
		s.eat();
		s.work();
		s.sleep();
//		s.f(); 자식 클래스에서 새롭게 만든 메소드이기 때문에 업캐스팅 된 곳에서는 사용이 불가하다
	}
}
