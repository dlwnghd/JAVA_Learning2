package game;

public class Cat extends Animal {	// Animal클래스를 상속받음
	
	public Cat(String name, int feed, int hp) {	// Cat클래스의 외부로부터(String타입 name, int타입 feed, int타입 hp)를 입력
		super(name, feed, hp);	// super로 부모클래스의 인스턴스 변수 참조(name, feed, hp)
	}
	
	
	// 먹이주기(부모클래스와 동일한 동작 -> 재정의X)

	// 산책가기(재정의)
	@Override	// 오버라이딩
	public void walk() {	// walk() 메소드
		this.feed += 4; // 부모에 맞춰서 수정
		super.walk(); // 부모 태그에 있는 walk() 출력, feed++, hp--, show()
	}
	
	// 씻기기(재정의)
	@Override	// 오버라이딩
	public void wash() {	// wash() 메소드
		washtime(7, "야옹");	// washtime 메소드 사용
	}
	
	// 이스터에그 메소드 
	public void onlyCat() {	// Cat클래스에서 새롭게 정의된 메소드
		System.out.println("야옹야옹~");	// "야옹야옹~" 출력
	}
}