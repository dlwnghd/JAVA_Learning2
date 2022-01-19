package day04;

public class Corporal implements Soldier{

	@Override
	public void eat() {
		System.out.println("밥을 맛있게 먹는다!!!");
	}

	@Override
	public void work() {
		System.out.println("사실상 모든 일을 맡아서 한다!!!");
	}

	@Override
	public void sleep() {
		System.out.println("쿨쿨 잘 잔다");
	}

}