package game;

public class Sheep extends Animal {	// Animal클래스를 상속받음

	public Sheep(String name, int feed, int hp) {	// Sheep클래스의 외부로부터(String타입 name, int타입 feed, int타입 hp)를 입력
		super(name, feed, hp);	// super로 부모클래스의 인스턴스 변수 참조(name, feed, hp)
	}

	// 먹이주기(재정의)
	@Override	// 오버라이딩
	public void eat() {		// eat() 메소드
		this.hp += 2;		// hp = hp + 2
		this.feed -= 3;		// feed = feed - 3
		show();				// show()메소드 출력
	}

	// 산책가기(재정의)
	@Override	// 오버라이딩
	public void walk() {	// walk() 메소드
		this.hp -= 4; // 부모에 맞춰서 수정
		this.feed++; // 부모에 맞춰서 수정
		super.walk(); // 부모 태그에 있는 walk() 사용
	}

	// 씻기기(재정의)
	@Override	// 오버라이딩
	public void wash() {	// wash() 메소드
		washtime(10, "메에");	// washtime 메소드 사용
	}
}