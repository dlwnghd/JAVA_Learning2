package day03;

public class AbstractTest {
	public static void main(String[] args) {
		// 인터페이스는 구현되지 않은 부분이 있기 때문에
		// 객체화가 불가능하다
//		InterTest i = new InterTest();
		
		// 추상 클래스는 객체화 불가능
		// 추상 클래스는 필드 위에 구현되지 않는 부분이 있다
		// 따라서 메모리에 올라갈 수 없다
//		Parent p = new Parent();
		Child c = new Child();	// Child타입 c객체 = 새로운 Child타입을 받아옴
		c.f();	// c객체.f()메소드 출력
	}
}
