package day04;

public class Corporal implements Soldier {

	// 인터페이스 Soldier에 있는 eat()메소드 오버라이드
	@Override
	public void eat() { // eat메소드 재정의
		System.out.println("밥을 맛있게 먹는다!!!");	// 출력문
	}

	// 인터페이스 Soldier에 있는 work()메소드 오버라이드
	@Override
	public void work() { // work메소드 재정의
		System.out.println("사실상 모든 일을 맡아서 한다!!!");	// 출력문
	}

	// 인터페이스 Soldier에 있는 sleep()메소드 오버라이드
	@Override
	public void sleep() { // sleep메소드 재정의
		System.out.println("쿨쿨 잘 잔다");	// 출력문
	}

}
