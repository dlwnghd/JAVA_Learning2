package inheritTest;

public class Car {
	String name;	// StringŸ���� name(��ü ����)
	int price;		// intŸ���� price(��ü ����)
	String color;	// StringŸ���� color(��ü ����
	
	// �ʱ�ȭ ������
	public Car(String name, int price, String color) {	// Car�޼ҵ� �ܺηκ��� StringŸ���� name, intŸ���� price, StringŸ���� color�� ����
		this.name = name;	// this.name == ������ ����� String name�� �ǹ��ϰ� name�� Main���� �޼ҵ带 �θ� �� ����� name��
		this.price = price;	// this.price == ������ ����� int price�� �ǹ��ϰ� price�� Main���� �޼ҵ带 �θ� �� ����� price��
		this.color = color;	// this.color == ������ ����� String color�� �ǹ��ϰ� color�� Main���� �޼ҵ带 �θ� �� ����� color��
	}
	
	public void go() {	// go �޼ҵ�
		System.out.println("������ ���ϴ�");	// "������ ���ϴ�" ���
	}
	public void engineOn() {	// engineOn �޼ҵ�
		System.out.println("����� �õ��� �׽��ϴ�");	// "����� �õ��� �׽��ϴ�" ���
	}
	public void show() {	// show �޼ҵ�
		System.out.println("---�ڵ��� ����---");	// "---�ڵ��� ����---" ���
		System.out.println("���� : " + this.name);	// "���� : " CarŸ�� name
		System.out.println("���� : " + this.color);	// "���� : " CarŸ�� color
		System.out.println("���� : " + this.price + "����");	// "���� : " CarŸ�� price
	}
}