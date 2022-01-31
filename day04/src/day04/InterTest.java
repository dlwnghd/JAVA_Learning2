package day04;

public class InterTest {
	public static void main(String[] args) {
		SecondMan s = new SecondMan();	// SecondMan타입의 s는 새로운 SecondMan값으로 정의
		Corporal c = new Corporal();	// Corporal타입의 c는 새로운 Corporal값으로 정의
		s.eat();	// s객체(인스턴스)의 eat()메소드 출력
		c.eat();	// c객체(인스턴스)의 eat()메소드 출력
	}
}
