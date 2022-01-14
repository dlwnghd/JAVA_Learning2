package day02;

public class Student {
	// 여러가지 변수들의 접근 제어자
	// private : 오로지 본인 클래스 안에서만 사용 가능
	private String name;
	int age;
	
	// 메소드 게터 세터 단축키
	// alt + shift + s > r > alt + a > alt + r
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}