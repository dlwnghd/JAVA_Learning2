package inheritTest;

public class SuperCar extends Car{
	String mode;
	
	// alt + shift + s > o > enter
	// ��ӹ��� �ڽ� Ŭ������ �����ڸ� ȣ���ϱ� ������ �θ� �����ڸ� ���� ȣ���Ѵ�
	public SuperCar(String name, int price, String color, String mode) {
		super(name, price, color);	// super() --> �θ�����ڸ� �ǹ� Car()
		this.mode = mode;	// myCar.mode�� String mode�� ����
	}
	
	// �޼ҵ� �������̵�
	// ������
//	public void engineOn() {
//		System.out.println("��ư���� �õ��� �׽��ϴ�");
//	}
	
	@Override // ������̼� �ּ�
			// ��ǻ�Ϳ��� �˷��ִ� �ּ�
			// engine0n���� �Է����� ��� �������̵��� �ƴϱ� ������
			// �̷��� ����Ȯ���� ���� �ʿ���
	public void engineOn() {
		System.out.println("��ư���� �õ��� �׽��ϴ�");
	}
	// �ܼ� �߰�
	public void engineOn2() {
		System.out.println("��ư���� �õ��� �׽��ϴ�");
	}
	
	public void openRoof() {
		System.out.println("������ ���Ƚ��ϴ�.");
	}
	
	@Override
	public void show() {
		super.show();	// super <- �θ� Ŭ����, �θ� Ŭ�����ȿ� �ִ� show ���
//		��ݺ��Ǵ� ���� �ּ�ó��
//		System.out.println("---�ڵ��� ����---");
//		System.out.println("���� : " + this.name);
//		System.out.println("���� : " + this.color);
//		System.out.println("���� : " + this.price + "����");
		System.out.println("��� : " + this.color);
	}
}
