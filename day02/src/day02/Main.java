package day02;

public class Main {
	public static void main(String[] args) {
		Student kim = new Student();	// Student타입의 kim객체 = 새로운 Student타입을 받아옴
		kim.setName("김철수");	// kim객체의 setName메소드는 "김철수"라는 값을 받음
		System.out.println("kim.getName() : " + kim.getName());	// kim.getName()메소드 출력
		
		
//		kim.name = "김철수";	// kim객체의 name인스턴스에 "김철수" 저장 -> Student 클래스에서 private로 설정했기 때문에 사용할 수 없음
//		kim.age = 10;	// kim객체의 age인스턴스에 10 저장
//		kim.age = -2000;	// kim객체의 age인스턴스에 -2000 저장
		// private 변수에 값을 설정할때는 setter를, 변수에 저장된 값을 가져올때는 getter를 사용한다
	}
}