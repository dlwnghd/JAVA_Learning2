package day04;

//SoliderAdapter를 상속받음, Soldier를 implements함
public class Sergeant extends SoilderAdapter /*implements Soldier*/{

	// 인터페이스 Soldier에 있는 eat()메소드 오버라이드
	@Override
	public void eat() { // eat메소드 재정의
		System.out.println("밥을 거의 먹지않고 px로 간다");	// 출력문
	}

	// 인터페이스 Soldier에 있는 work()메소드 오버라이드
	// 필요하지 않더라도 호출 기능은 구현을 해야만하는데 Adapter클래스를 정의해두면 
	// 없어도 된다
//	@Override
//	public void work() { // work메소드 재정의
//	}

	// 인터페이스 Soldier에 있는 sleep()메소드 오버라이드
	@Override
	public void sleep() { // sleep메소드 재정의
		System.out.println("쿨쿨 잠을 잔다");	// 출력문
	}

}