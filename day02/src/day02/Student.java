package day02;

public class Student {
	// �������� �������� ���� ������
	// private : ������ ���� Ŭ���� �ȿ����� ��� ����
	private String name;	// private ���� �������� StringŸ���� name(�ν��Ͻ�(��ü) ����)
	int age;	// intŸ���� age(�ν��Ͻ�(��ü) ����)
	
	// �޼ҵ� ���� ���� ����Ű
	// alt + shift + s > r > alt + a > alt + r
	public String getName() {	// public StringŸ������ ���� ��ȯ���ִ� getName�޼ҵ�
		return name;	// name���� ��ȯ�� �ְ�, �޼ҵ� ����
	}
	public void setName(String name) {	// setName�޼ҵ� �ܺηκ��� StringŸ���� name���� ����
		this.name = name;	// this.name == ������ ����� private String name�� �ǹ��ϰ� name�� Main���� �޼ҵ带 �θ� �� ����� name��
	}
	public int getAge() {	// intŸ������ ���� ��ȯ���ִ� getAge�޼ҵ�
		return age;	// age���� ��ȯ�� �ְ�, �޼ҵ� ����
	}
	public void setAge(int age) {	// setAge�޼ҵ� �ܺηκ��� intŸ���� age���� ����
		this.age = age;	// this.name == 7��°���� int age;�� ���� age�� �ܺηκ��� ���� ��
	}
	
}