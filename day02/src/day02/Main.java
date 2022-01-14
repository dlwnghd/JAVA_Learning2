package day02;

public class Main {
	public static void main(String[] args) {
		Student kim = new Student();
		kim.setName("김철수");
		System.out.println(kim.getName());
		
//		kim.name = "김철수";
//		kim.age = 10;
//		kim.age = -2000;
		// private 변수에 값을 설정할때는 setter를, 변수에 저장된 값을 가져올때는 getter를 사용한다
		
	}
}