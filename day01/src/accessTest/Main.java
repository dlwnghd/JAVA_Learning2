package accessTest;

public class Main {
	public static void main(String[] args) {
		Test t = new Test();	// TestŸ���� t��ü = ������ new Student()�� �Ÿ� ��ġ�� �˷���
//		System.out.println(t.a); private ��� �Ұ�
		System.out.println(t.b);	// protected ��� ����
		System.out.println(t.c);	// default ��� ����
		System.out.println(t.d);	// public ��� ����
//		t.f1(); private�� ��� �Ұ�
		t.f2();	// protected �޼ҵ� ��� ����
		t.f3();	// default �޼ҵ� ��� ����
		t.f4();	// public �޼ҵ� ��� ����
	}
}
