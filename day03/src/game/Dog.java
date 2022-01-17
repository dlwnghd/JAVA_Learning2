package game;

public class Dog extends Animal{	// Animal클래스를 상속받음

	public Dog(String name, int feed, int hp) {	// Dog클래스의 외부로부터(String타입 name, int타입 feed, int타입 hp)를 입력
		super(name, feed, hp);	// super로 부모클래스의 인스턴스 변수 참조(name, feed, hp)
	}
	
	// 먹이주기(재정의)
	@Override	// 오버라이딩
	public void eat() {	// eat 메소드
		this.hp += 2;	// 객체의 hp에 2를 더해줌,this.hp = this.hp + 2, 체력 2 증가
		this.feed -= 3;	// 객체의 feed에 3을 빼줌,this.hp = this.hp - 3, 음식 3 감소
		show();
	}
	
	// 산책가기(재정의)
	@Override	// 오버라이딩
	public void walk() {	// walk 메소드
//		↓ 3줄은 부모 클래스의 walk()메소드 + 조금 변경을 하면 되기에 주석 처리
//		this.hp -= 5;	// 객체의 hp에 5를 빼줌,this.hp = this.hp - 5, 체력 5 감소
//		this.feed += 2;	// 객체의 feed에 2를 더해줌,this.feed = this.feed + 2, 음식 2 증가
//		show();			// show()메소드 출력
		
		this.hp -= 4;	// 부모에 맞춰서 수정
		this.feed++;	// 부모에 맞춰서 수정
		super.walk();	// 부모 태그에 있는 walk() 사용
	}
	
	// 씻기기(재정의)
	@Override	// 오버라이딩
	public void wash() {	// wash 메소드
		System.out.println(this.name+"님 씻는 중!");	// 씻기기 출력문
		for (int i = 0; i < 5; i++) {	// int값 i는 0; i가 5미만동안; i++
			System.out.print("멍~!");	// "멍~!" 출력
			// 후에 공부할 때 자세히 설명
			try {
				Thread.sleep(1000);	// 1초
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println();	// 줄 띄우기
		this.hp += 20;	// this.hp = this.hp + 20
		this.feed += 20;	// this.feed = this.feed + 20
		show();	// show 메소드(스테이터스) 출력
	}
}
