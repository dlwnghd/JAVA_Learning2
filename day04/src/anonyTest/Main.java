package anonyTest;

import day04.SecondMan;
import day04.Soilder;

public class Main {
	public static void main(String[] args) {
		Car c = new Car() {
			public void engineOn() {
			}
			
			@Override
			public void go() {
				super.go();
			}
		};
		
		
		Soilder s2  = new SecondMan();
		s2.eat();

		
		Soilder s = new Soilder() {	// 익명의 내부 클래스 생성	
			
			// 일반 메소드
			public void f() {
				System.out.println("익명클래스에서 정의된 메소드");
			}
			
			@Override
			public void eat() {
				System.out.println("오버라이딩 eat");
			}

			@Override
			public void work() {
				System.out.println("오버라이딩 work");
			}

			@Override
			public void sleep() {
				System.out.println("오버라이딩 sleep");
			}
			
		};
		
		s.eat();
		s.work();
		s.sleep();
//		s.f(); 새롭게 만든 메소드이기 때문에 업캐스팅 된 곳에서는 사용이 불가하다
	}
}
