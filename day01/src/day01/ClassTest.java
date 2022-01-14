package day01;

import java.util.Scanner;

// �ǹ������� �����۾��� �߿��ϱ� ������
// Class�� �ϳ��� ���Ͽ� ��� ���� ����� ���� ����

public class ClassTest {
	public static void main(String[] args) {
		Student kim = new Student("��ö��", 90, 70);	// ��ü ����
		Student park = new Student("�ڿ���", 100, 80);	// ��ü ����
		// ���ο� �л��� ��
		Student s = new Student();	// StudentŸ���� s��ü = ������ new Student()�� �Ÿ� ��ġ�� �˷���
		
		int[] ar = {10, 20, 30};	// �Ʒ� �ڵ� ���ؽ�Ű�� �뵵
		Student[] students = {new Student("��ö��", 90, 70),	// Student�迭 student��� �̸����� [0] = {"��ö��", 90, 70}�� ����
								new Student("�ڿ���", 100, 80),	// Student�迭 student��� �̸����� [1] = {"��ö��", 90, 70}�� ����
								new Student("ȫ�浿", 50, 60)};	// Student�迭 student��� �̸����� [1] = {"��ö��", 90, 70}�� ����
		
		// �л� �̸��� �Է� �޾Ƽ�
		// �ش� �л��� ���� ������ ����ϴ� ���α׷�
		// �� �б����� 3 ���� �л��� �ְ�, ������ students��� �迭�� ����Ǿ��ִ�
		Scanner sc = new Scanner(System.in);	// Scanner�� scan���� ����Ѵٰ� ��ǻ�Ϳ��� �˷���
		System.out.print("�л� �̸� �Է� >>");		// "�л� �̸� �Է� >>" ���
		String Searchname = sc.nextLine();		// StringŸ�� Searchname�� ����ڷκ��� �Է°��� �޾Ƽ� ����
		boolean check = false;	// flag ���� : ������ �Դ��� Ȯ���ϱ� ���� ����
		
		for (Student st : students) {	// ���� for������, StudentŸ���� st�� �����԰� ���ÿ� st�� ���� students���� �� ��ü�� �ݺ��ϴ� ����
			if(st.name.equals(Searchname)) {	// st.name���� Searchname���� ���ٸ�
				check = true;	// ã�� �̸��� �ִٸ� check = true���� ��
				st.show();		// StudentŸ�� ���ο� show�޼ҵ尡 �ֱ� ������, st.show();�� ���� �迭�� ������ show�޼ҵ带 ���
			}
		}
		if(check == false) {	// ã�� �̸��� ���ٸ� check���� ������� �ʾ����Ƿ�
			System.out.println("�ش� �л��� ã�� �� �����ϴ�.");	// "�ش� �л��� ã�� �� �����ϴ�." ���
		}
		
//		students[0].show(); // kim.show();
//		students[1].show(); // park.show();
//		students[2].show();	// s.show();
		
		// ���� for������ ���
		for(Student st : students) {	// StudentŸ������ st�� students������ ���̵���
			st.show();	// StudentŸ�� ���ο� show�޼ҵ尡 �ֱ� ������, st.show();�� ���� �迭�� ������ show�޼ҵ带 ���
		}
		
		
//		kim.name = "��ö��";	// StudentŸ�� kim�� name�� "��ö��" ����
//		kim.kor = 90;		// StudentŸ�� kim�� kor�� 90 ����
//		kim.eng = 70;		// StudentŸ�� kim�� eng�� 70 ����
//		
//		park.name = "�ڿ���";	// StudentŸ�� park�� name�� "�ڿ���" ����
//		park.kor = 100;		// StudentŸ�� park�� kor�� 100 ����
//		park.eng = 80;		// StudentŸ�� park�� eng�� 80 ����
//		
//		kim.show();		// kim���ο� show�޼ҵ� ���
//		park.show();	// park���ο� show�޼ҵ� ���
	}
}
