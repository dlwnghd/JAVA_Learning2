package day04;

public class SecondMan implements Soldier{

	// 인터페이스 Soldier에 있는 eat()메소드 오버라이드
	@Override
	public void eat() {	// eat메소드 재정의
		System.out.println("음식을 맛있게 먹습니다");	// 출력문
	}

	// 인터페이스 Soldier에 있는 work()메소드 오버라이드
	@Override
	public void work() {	// work메소드 재정의
		System.out.println("열심히 일을 하지만 잘 못한다,...");	// 출력문
	}

	// 인터페이스 Soldier에 있는 sleep()메소드 오버라이드
	@Override
	public void sleep() {	// sleep메소드 재정의
		System.out.println("잠이 잘 오지 않아요ㅜㅜ");	// 출력문
	}
	
}