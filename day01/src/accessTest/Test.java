package accessTest;

public class Test {
	private int a;		// privated ����
	protected int b;	// protected ����
	int c;				// default ����
	public int d;		// public ����

	public void f() {	// f �޼ҵ�
		System.out.println("���� Ŭ�������� ��밡������ Ȯ�ο� �޼ҵ�");
		System.out.println(a);	// private ����
		System.out.println(b);	// protected ����
		System.out.println(c);	// default ����
		System.out.println(d);	// public ����
		f1();	// private ����
		f2();	// protected ����
		f3();	// default ����
		f4();	// public ����
	}

	private void f1() {
		System.out.println("private �޼ҵ�"); // ��¹�
	}

	protected void f2() {
		System.out.println("protected �޼ҵ�"); // ��¹�
	}

	void f3() {
		System.out.println("default �޼ҵ�"); // ��¹�
	}

	public void f4() {
		System.out.println("public �޼ҵ�"); // ��¹�
	}
}
