package inheritTest;

public class Car {
	String name;	// String타입의 name(객체 변수)
	int price;		// int타입의 price(객체 변수)
	String color;	// String타입의 color(객체 변수
	
	// 초기화 생성자
	public Car(String name, int price, String color) {	// Car메소드 외부로부터 String타입의 name, int타입의 price, String타입의 color를 받음
		this.name = name;	// this.name == 맨위에 선언된 String name을 의미하고 name은 Main에서 메소드를 부를 때 사용한 name값
		this.price = price;	// this.price == 맨위에 선언된 int price을 의미하고 price은 Main에서 메소드를 부를 때 사용한 price값
		this.color = color;	// this.color == 맨위에 선언된 String color을 의미하고 color은 Main에서 메소드를 부를 때 사용한 color값
	}
	
	public void go() {	// go 메소드
		System.out.println("앞으로 갑니다");	// "앞으로 갑니다" 출력
	}
	public void engineOn() {	// engineOn 메소드
		System.out.println("열쇠로 시동을 켰습니다");	// "열쇠로 시동을 켰습니다" 출력
	}
	public void show() {	// show 메소드
		System.out.println("---자동차 정보---");	// "---자동차 정보---" 출력
		System.out.println("차주 : " + this.name);	// "차주 : " Car타입 name
		System.out.println("색상 : " + this.color);	// "색상 : " Car타입 color
		System.out.println("가격 : " + this.price + "만원");	// "가격 : " Car타입 price
	}
}