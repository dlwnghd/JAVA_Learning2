package day02;

public class Main {
	public static void main(String[] args) {
		Student kim = new Student();	// StudentŸ���� kim��ü = ���ο� StudentŸ���� �޾ƿ�
		kim.setName("��ö��");	// kim��ü�� setName�޼ҵ�� "��ö��"��� ���� ����
		System.out.println(kim.getName());	// kim.getName()�޼ҵ� ���
		
//		kim.name = "��ö��";	// kim��ü�� name�ν��Ͻ��� "��ö��" ����
//		kim.age = 10;	// kim��ü�� age�ν��Ͻ��� 10 ����
//		kim.age = -2000;	// kim��ü�� age�ν��Ͻ��� -2000 ����
		// private ������ ���� �����Ҷ��� setter��, ������ ����� ���� �����ö��� getter�� ����Ѵ�
	}
}