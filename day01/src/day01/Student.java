package day01;

public class Student {
	String name;	// String Ÿ���� name
	int kor;		// intŸ���� kor
	int eng;		// intŸ���� eng
	
	
	// ���� ���ǵ� ������(���⼱ Student())�� ���ٸ� ��ǻ��(�����Ϸ�)�� �˾Ƽ� �����ڸ� �߰����ش� --> �⺻������
	// ���ǵ� �����ڰ� �ִٸ� �⺻�����ڸ� �߰������� �ʴ´�
	// �⺻ �����ڸ� ��������� ���������ν� �޼ҵ� �����ε�ó�� ���� ������� �����ڸ� Ȱ���� �� �ִ�.
	public Student() {;}	// �⺻ ������, ;�� �ǵ������� ��� ���� �ٸ� �����ڿ��� �˷��ֱ� ���� ���⵵ ��
	
	public Student(String name, int kor, int eng) {	// �ʱ�ȭ ������, ������ ���� ����, �����ڴ� �޼ҵ�� �޸� ����� ������ �ֱ� ������ returnŸ���� ���� 
		// �޸��� ��Ͻ�Ű�� ������ ��������� ����
		// �Ʒ��� �߰������� ������ ����� ���� �� ����
//		System.out.println("������ �ȿ� ���� ����");
		this.name = name;	// this ���� �Ұ���, ���� �� ������ ������ name == null ���� ��
		this.kor = kor;		// this�� ����ڰ� �θ����� �ϴ� ���� ��ġ�� ã��.kor���� Student�� �Է��� kor���� �־���
		this.eng = eng;		// this�� ����ڰ� �θ����� �ϴ� ���� ��ġ�� ã��.eng���� Student�� �Է��� eng���� �־���
	}
	
	
	public void show() {	// show �޼ҵ�
		System.out.println("---�л�����---");		// "---�л�����---" ���
		System.out.println("�̸� : " + this.name);	// this ���� ����
		System.out.println("���� : " + this.kor);		// this ���� ����
		System.out.println("���� : " + this.eng);		// this ���� ����
	}
}