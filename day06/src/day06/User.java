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
		System.out.println("------"+/*this.*/id+"정보------");
		System.out.println("|이름 : " + /*this.*/name);
		System.out.println("|비밀번호 : " + /*this.*/pw);
		System.out.println("|나이 : " + /*this.*/age);
		System.out.println("------------------");
	}
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
