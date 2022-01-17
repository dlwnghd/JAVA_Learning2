package game;

public class Animal {
	// 모든 캐릭터들의 부모 클래스
	String name;	//캐릭터 이름을 저장할 인스턴스 변수
	int feed;		// 음식갯수를 저장할 인스턴스변수
	int hp;			// 체력을 저장할 인스턴스변수
	
	public Animal(String name, int feed, int hp) {	// Animal클래스의 외부로부터(String타입 name, int타입 feed, int타입 hp)를 입력
		this.name = name;	// this(Main에서 Animal타입으로 정의한 객체)의 name값 == 위에 선언된 String name을 의미하고, name은 Main에서 메소드를 부를 때 사용한 name값
		this.feed = feed;	// this의 feed값 == 이 메소드에서 선언된 name;
		this.hp = hp;		// this의 hp값 == 이 메소드에서 선언된 hp;
		System.out.println(this.name + "캐릭터가 생성되었습니다!");	// 캐릭터 생성 출력문
	}
	
	// 반복되는 스테이터스 메소드로 만들기
	public void show() {	// show()메소드
		System.out.println("현재 체력 : "+this.hp);	// 현재 체력 출력
		System.out.println("남은 음식 : "+this.feed);	// 남은 음식 출력
	}
	// 먹이주기 메소드
	public void eat() {		// eat()메소드
		this.hp++;		// 체력 1증가
		this.feed--;	// 음식 1감소
		show();	// 스테이터스 출력
	}
	
	// 산책가기 메소드
	public void walk() {	// walk()메소드
		this.hp--;		// 체력 증가
		this.feed++;	// 음식 감소
		show();	// 스테이터스 출력
	}
	// 씻기기 메소드
	public void wash() {	// wash()메소드
		this.hp += 20;	// this.hp = this.hp + 20
		this.feed += 20;	// this.feed = this.feed + 20
		System.out.println(this.name + "이 씻고 있어요!");	// 씻기기 출력문
		for (int i = 0; i < 3; i++) {	// i는0; i가 3미만동안; i++
			System.out.println("~!");	// "~!"출력
			// 기다리는 문으로 try catch문인데 후에 공부하면서 알려주기로함 지금은 어떻게 생겼는지 보기만 함
			try {
				Thread.sleep(1000);	// ()안에 숫자가 1000 = 1초를 의미함
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println();	// 줄 띄우기
		show();	// show 메소드(스테이터스) 출력
	}
}