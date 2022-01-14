package staticTest;

import accessTest.Test;

public class Main {
	public static void main(String[] args) {
		Test t = new Test();	// TestŸ���� t��ü = ������ new Student()�� �Ÿ� ��ġ�� �˷���
		System.out.println(t.d); // public�� ��� ����
		t.f4(); //public�� ��� ����
		
		Korean kim = new Korean("��ö��", 10);	// KoreanŸ���� kim��ü = KoreanŸ��("��ö��", 10)�� ����
		Korean park = new Korean("�ڿ���", 20);	// KoreanŸ���� park��ü = KoreanŸ��("�ڿ���", 20)�� ����
		
		kim.name = "�������";		// KoreanŸ�� kim�� name�� "�������" ����
		System.out.println(kim.name);	// kim��ü�� name ���
		System.out.println(park.name);	// park��ü�� name ���
		
		// �� �ڵ�� ��� ���ظ� ���� �ۼ� ���� �� �ùٸ� �����
		// Korean.country = "USA"; �� �ؾ� �Ѵ�.
		kim.country = "USA";	// kim��ü�� country������ "USA" ����
		// kim��ü ���� country���� "USA"�� �ٲ۴ٰ� ������ 
		// country�� static ������(modifier)�� �ҷ���
		// ���� ������ ������, kim�̳� park ��ü �ȿ� �����ϴ� ���� �ƴϴ�.
		
		Korean.country = "USA";	// Korean��ü�� country������ "USA" ����
		System.out.println(kim.country);	// kim��ü�� country���� ���
		System.out.println(park.country);	// park��ü�� country���� ���
		// ����ƽ ������ ��� �ν��Ͻ�(��ü)�� ���� �����ϱ� ������
		// �ν��Ͻ��� �߿����� �ʴ� ���� Ŭ������.������ ���� ����� �� �ִ�
		System.out.println(Korean.country);	// Korean��ü�� country���� ���
		
		kim.show();	// kim��ü�� show�޼ҵ� ���
		park.show();	// park��ü�� show�޼ҵ� ���
		
		Korean.show();	// Ŭ������.�޼ҵ��();
		//
	}
}