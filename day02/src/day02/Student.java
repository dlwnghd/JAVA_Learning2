package day02;

public class Student {
	// �������� �������� ���� ������
	// private : ������ ���� Ŭ���� �ȿ����� ��� ����
	private String name;
	int age;
	
	// �޼ҵ� ���� ���� ����Ű
	// alt + shift + s > r > alt + a > alt + r
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