package inheritTest;

public class SuperCar extends Car{
	String mode;
	
	// alt + shift + s > o > enter
	// 상속받은 자식 클래스는 생성자를 호출하기 이전에 부모 생성자를 먼저 호출한다
	public SuperCar(String name, int price, String color, String mode) {
		super(name, price, color);	// super() --> 부모생성자를 의미 Car()
		this.mode = mode;	// myCar.mode에 String mode값 저장
	}
	
	// 메소드 오버라이딩
	// 재정의
//	public void engineOn() {
//		System.out.println("버튼으로 시동을 켰습니다");
//	}
	
	@Override // 어노테이션 주석
			// 컴퓨터에게 알려주는 주석
			// engine0n으로 입력했을 경우 오버라이딩이 아니기 때문에
			// 이러한 버그확인을 위해 필요함
	public void engineOn() {
		System.out.println("버튼으로 시동을 켰습니다");
	}
	// 단순 추가
	public void engineOn2() {
		System.out.println("버튼으로 시동을 켰습니다");
	}
	
	public void openRoof() {
		System.out.println("지붕이 열렸습니다.");
	}
	
	@Override
	public void show() {
		super.show();	// super <- 부모 클래스, 부모 클래스안에 있는 show 사용
//		↓반복되는 구간 주석처리
//		System.out.println("---자동차 정보---");
//		System.out.println("차주 : " + this.name);
//		System.out.println("색상 : " + this.color);
//		System.out.println("가격 : " + this.price + "만원");
		System.out.println("모드 : " + this.color);
	}
}
