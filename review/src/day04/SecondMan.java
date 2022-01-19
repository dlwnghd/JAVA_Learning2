package day04;

public class SecondMan implements Soldier{

	@Override
	public void eat() {
		System.out.println("음식을 맛있게 먹습니다");
	}

	@Override
	public void work() {
		System.out.println("열심히 일을 하지만 잘 못한다,...");
	}

	@Override
	public void sleep() {
		System.out.println("잠이 잘 오지 않아요ㅜㅜ");
	}

}
