package day04;

public class Sergeant extends SoilderAdapter{

	@Override
	public void eat() {
		System.out.println("밥을 거의 먹지않고 px로 간다");
	}

	@Override
	public void work() {
	}

	@Override
	public void sleep() {
		System.out.println("쿨쿨 잠을 잔다");
	}
	
}