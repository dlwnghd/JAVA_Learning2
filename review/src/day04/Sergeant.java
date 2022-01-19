package day04;

public class Sergeant extends SoldierAdapter{

	@Override
	public void eat() {
		System.out.println("밥을 거의 먹지않고 px로 간다");
	}

//	@Override
//	public void work() {
//		System.out.println("일을 하지 않는다");
//	}

	@Override
	public void sleep() {
		System.out.println("쿨쿨 잠을 잔다");
	}
	
}