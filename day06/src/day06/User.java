package day06;

public class User {
	// alt + shift + a : 그리드 모드
	private String id;
	private String pw;
	private String name;
	private int age;
	
	// .getId() --> .id
	// .setId("값") --> .id = "값"
	// 단축키 : alt+shift+s > alt + a > alt + r
	// 회원 정보를 보여주는 메소드
	public void show() {
		System.out.println("------"+/*this.*/id+"정보------");	// id
		System.out.println("|이름 : " + /*this.*/name);			// name
		System.out.println("|비밀번호 : " + /*this.*/pw);			// pw
		System.out.println("|나이 : " + /*this.*/age);			// age
		System.out.println("------------------");
	}
	
	// id를 받아오는 메소드
	public String getId() {
		return id;	// id값을 돌려줌
	}
	// String타입의 id를 객체로 받는 메소드
	public void setId(String id) {
		this.id = id;	// 부모 클래스의 id값은 객체로 받은 id값
	}
	// String값을 돌려주는 메소드
	public String getPw() {
		return pw;	// pw값을 돌려줌
	}
	// String타입의 pw를 객체로 받는 메소드
	public void setPw(String pw) {
		this.pw = pw;	// 부모 클래스의 pw값은 객체로 받은 pw값
	}
	// String값을 돌려주는 메소드
	public String getName() {
		return name;	// name값을 돌려줌
	}
	// String타입의 name을 객체로 받는 메소드
	public void setName(String name) {
		this.name = name;	// 부모 클래스의 name값은 객체로 받은 name값
	}
	// int값을 돌려주는 메소드
	public int getAge() {
		return age;	// age값을 돌려줌
	}
	// int타입의 age를 객체로 받는 메소드
	public void setAge(int age) {
		this.age = age;	// 부모 클래스의 age값은 객체로 받은 age값
	}
	
}
