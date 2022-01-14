package day01;

public class Student {
	String name;	// String 타입의 name
	int kor;		// int타입의 kor
	int eng;		// int타입의 eng
	
	
	// 만약 정의된 생성자(여기선 Student())가 없다면 컴퓨터(컴파일러)가 알아서 생성자를 추가해준다 --> 기본생성자
	// 정의된 생성자가 있다면 기본생성자를 추가해주지 않는다
	// 기본 생성자를 명시적으로 정의함으로써 메소드 오버로딩처럼 여러 방식으로 생성자를 활용할 수 있다.
	public Student() {;}	// 기본 생성자, ;은 의도적으로 비운 것을 다른 개발자에게 알려주기 위해 쓰기도 함
	
	public Student(String name, int kor, int eng) {	// 초기화 생성자, 생성자 정의 구간, 생성자는 메소드와 달리 기능이 정해져 있기 때문에 return타입이 없다 
		// 메모리의 등록시키는 역할이 사라지지는 않음
		// 아래는 추가적으로 동작할 기능을 넣을 수 있음
//		System.out.println("생성자 안에 적은 문장");
		this.name = name;	// this 생략 불가능, 생략 시 위에서 정의한 name == null 값이 옴
		this.kor = kor;		// this로 사용자가 부르고자 하는 값의 위치를 찾아.kor값을 Student의 입력한 kor값에 넣어줌
		this.eng = eng;		// this로 사용자가 부르고자 하는 값의 위치를 찾아.eng값을 Student의 입력한 eng값에 넣어줌
	}
	
	
	public void show() {	// show 메소드
		System.out.println("---학생정보---");		// "---학생정보---" 출력
		System.out.println("이름 : " + this.name);	// this 생략 가능
		System.out.println("국어 : " + this.kor);		// this 생략 가능
		System.out.println("영어 : " + this.eng);		// this 생략 가능
	}
}