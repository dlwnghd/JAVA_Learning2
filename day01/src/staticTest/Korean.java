package staticTest;

public class Korean {
	String name; // 인스턴스(객체) 변수, String타입 name
	int age;	// 인스턴스(객체) 변수, int타입 age
	static String country = "KOREA"; // 클래스 변수

	// 초기화 생성자 단축키 : Alt + shift + s > o > enter

	public Korean(String name, int age) { // Korean 메소드(String name, int age)를 
		this.name = name;	// this로 사용자가 부르고자 하는 값의 위치를 찾아.name값을 Korean의 입력한 name값에 넣어줌
		this.age = age;		// this로 사용자가 부르고자 하는 값의 위치를 찾아.age값을 Korean의 입력한 age값에 넣어줌
	}

	
	// 스태틱 메소드 / 정적 메소드
	public static void show() { // 모든 인스턴스(객체)에서 동일하게 동작하는 메소드
		System.out.println("static 메소드 호출됨");	// "static 메소드 호출됨" 출력
		System.out.println(country); // 인스턴스마다 달라지지 않는 스태틱 변수는 사용가능
		// 인스턴스(객체)마다 달라지는 인스턴스(객체)변수는 사용할 수 없다
//		System.out.println(this.name); // this.name값 출력
	}

}