package game;

public class Cat extends Animal {	// Animal클래스를 상속받음
	
	public Cat(String name, int feed, int hp) {	// Cat클래스의 외부로부터(String타입 name, int타입 feed, int타입 hp)를 입력
		super(name, feed, hp);	// super로 부모클래스의 인스턴스 변수 참조(name, feed, hp)
	}
	
	public void onlyCat() {	// Cat클래스에서 새롭게 정의된 메소드
		System.out.println("야옹야옹~");	// "야옹야옹~" 출력
	}
	
	// 먹이주기(부모클래스와 동일 -> 재정의X)

	// 산책가기(재정의)
	@Override	// 오버라이딩
	public void walk() {	// walk() 메소드
		this.feed += 4; // 부모에 맞춰서 수정
		super.walk(); // 부모 태그에 있는 walk() 출력, feed++, hp--, show()
	}
	
	// 씻기기(재정의)
	@Override	// 오버라이딩
	public void wash() {	// wash() 메소드
		this.hp += 20;		// hp = hp + 20
		this.feed += 20;	// feed = feed + 20
		System.out.println(this.name + "님 씻는 중!");	// 출력문
		for (int i = 0; i < 7; i++) {	// int값 i=0; i가 7미만 동안; i++
			System.out.print("야옹~!");	// "야옹~!" 출력
			// 후에 공부할 때 자세히 설명
			try {
				Thread.sleep(1000);	// 1초
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println();	// 줄 띄우기
		show();	// 스테이터스 출력
	}
}