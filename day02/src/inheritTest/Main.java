package inheritTest;

public class Main {
	public static void main(String[] args) {
		Car momCar = new Car("MOM", 2000, "blue");
		SuperCar myCar = new SuperCar("배상엽",20000,"Red","Sports");
		
//		momCar.color = "blue";
//		momCar.name = "MOM";
//		momCar.price = 2000;
//		momCar.mode = "Sports"; 자식에만 있는 인스턴스 변수는 부모타입에서 사용 불가
		
		myCar.color = "red"; // myCar객체에 color인스턴스에 "red" 저장
		myCar.name = "이주홍"; // myCar객체에 name인스턴스에 "이주홍" 저장
		myCar.price = 20000; // myCar객체에 price인스턴스에 20000 저장
		myCar.mode = "Sports";	// myCar객체에 mode인스턴스에 "Sports" 저장
		
		momCar.show();	// momCar객체에 show() 메소드
		momCar.go();	// momCar객체에 go() 메소드
		momCar.engineOn();	// 부모에서 정의된 engineOn() 호출
//		momCar.openRoof();	// 자식클래스에서 새롭게 만든 메소드는 부모클래스에서 사용이 불가능하다
		
		myCar.show();	// myCar객체에 show() 메소드
		myCar.go();		// myCar객체에 go() 메소드
		myCar.engineOn();	// myCar객체에 재정의된 engineOn() 호출
		myCar.openRoof();	// myCar객체에 정의된 openRoof() 호출
//		myCar.engineOn2();
		
//		momCar.engineOn();과 myCar.engineOn();을 통해 다형성을 확인할 수 있다.
		
		// 상속받은 자식은 부모타입도 된다.
		System.out.println(myCar instanceof SuperCar);	// true
		System.out.println(momCar instanceof SuperCar);	// false
		System.out.println(myCar instanceof Car);	// true
		System.out.println(momCar instanceof Car);	// true
		
		// up casting(업캐스팅) : 자식을 부모타입으로 넣겠다
		Car c = myCar;
//		c.mode();		// 업캐스팅 된다면 자식에서 새롭게 만든 멤버들은 사용이 불가능하다
//		c.openRoof();	// 자식메소드에만 있는 메소드 이기 때문에 작동하지 않음
		c.engineOn();	// 재정의된 메소드가 그대로 호출된다
		c.go();			// 부모에만 정의된 메소드도 사용 가능
		
		// down casting(다운캐스팅) : 부모를 자식타입으로 넣겠다
//		SuperCar s = (SuperCar) momCar;
//		s.go();		// 예외 오류 발생, 부모클래스가 더 작기 때문에 부를 수 없는 메소드
		// 다운캐스팅은 부모타입으로 업캐스팅 된 자식을 다시 자식타입으로 바꾸는 것
		SuperCar s = (SuperCar) c;	// SuperCar클래스 s객체 = c를 (SuperCar)타입으로 바꿈
		s.go();	// s객체의 go메소드 출력
		s.mode = "normal";	// s객체의 mode값 = "normal"이다
		s.openRoof();	// s객체의 openRoof메소드 출력
	}
}