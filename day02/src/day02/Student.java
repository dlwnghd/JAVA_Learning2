package day02;

public class Student {
	// 여러가지 변수들의 접근 제어자
	// private : 오로지 본인 클래스 안에서만 사용 가능(Student 클래스 내에서만 사용 가능)
	private String name;	// private 접근 제어자의 String타입의 name(인스턴스(객체) 변수)
	int age;	// int타입의 age(인스턴스(객체) 변수)
	
	// 메소드를 이용해서 우회적으로 Main에서 사용
	// 메소드 게터 세터 단축키
	// alt + shift + s > r > alt + a > alt + r
	public String getName() {	// public String타입으로 값을 반환해주는 getName메소드
		return name;	// name값을 반환해 주고, 메소드 종료
	}
	public void setName(String name) {	// setName메소드 외부로부터 String타입의 name값을 받음
		this.name = name;	// this.name == 맨위에 선언되 private String name을 의미하고 name은 Main에서 메소드를 부를 때 사용한 name값
	}
	public int getAge() {	// int타입으로 값을 반환해주는 getAge메소드
		return age;	// age값을 반환해 주고, 메소드 종료
	}
	public void setAge(int age) {	// setAge메소드 외부로부터 int타입의 age값을 받음
		this.age = age;	// this.name == 7번째줄의 int age;와 같고 age는 외부로부터 받은 값
	}
	
}