package inheritTest;

public class Main {
	public static void main(String[] args) {
		Car momCar = new Car("MOM", 2000, "blue");
		SuperCar myCar = new SuperCar("배상엽",20000,"Red","Sports");
		
//		momCar.color = "blue";
//		momCar.name = "MOM";
//		momCar.price = 2000;
//		momCar.mode = "Sports"; 자식에만 있는 인스턴스 변수는 부모타입에서 사용 불가
		
		myCar.color = "red";
		myCar.name = "이주홍";
		myCar.price = 20000;
		myCar.mode = "Sports";
		
		momCar.show();
		momCar.go();
		momCar.engineOn();	// 부모에서 정의된 engineOn() 호출
//		momCar.openRoof();	// 자식클래스에서 새롭게 만든 메소드는 부모클래스에서 사용이 불가능하다
		
		myCar.show();
		myCar.go();
		myCar.engineOn();	// 자식에서 재정의된 engineOn() 호출
		myCar.openRoof();
//		myCar.engineOn2();
		
//		momCar.engineOn();과 myCar.engineOn();을 통해 다형성을 확인할 수 있다.
		
		// 상속받은 자식은 부모타입도 된다.
		System.out.println(myCar instanceof SuperCar);	// true
		System.out.println(momCar instanceof SuperCar);	// false
		System.out.println(myCar instanceof Car);	// true
		System.out.println(momCar instanceof Car);	// true
		
		// up casting(업캐스팅) : 자식을 부모타입으로 넣겠다
		Car c = myCar;
//		c.mode			// 업캐스팅 된다면 자식에서 새롭게 만든 멤버들은 사용이 불가능하다
//		c.openRoof();
		c.engineOn();	// 재정의된 메소드가 그대로 호출된다
		c.go();			// 부모에만 정의된 메소드도 사용 가능
		
		// down casting(다운캐스팅) : 부모를 자식타입으로 넣겠다
//		SuperCar s = (SuperCar) momCar;
//		s.go();		// 예외 오류 발생
		// 다운캐스팅은 부모타입으로 업캐스팅 된 자식을 다시 자식타입으로 바꾸는 것
		SuperCar s = (SuperCar) c;
		s.go();
		s.mode = "normal";
		s.openRoof();
		
		
		
		
		
	}
}