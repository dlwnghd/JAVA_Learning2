package staticTest;

public class Korean {
	String name; // �ν��Ͻ�(��ü) ����, StringŸ�� name
	int age;	// �ν��Ͻ�(��ü) ����, intŸ�� age
	static String country = "KOREA"; // Ŭ���� ����

	// �ʱ�ȭ ������ ����Ű : Alt + shift + s > o > enter

	public Korean(String name, int age/*, String country*/) { // Korean �޼ҵ�(String name, int age)�� 
		this.name = name;	// this�� ����ڰ� �θ����� �ϴ� ���� ��ġ�� ã��.name���� Korean�� �Է��� name���� �־���
		this.age = age;		// this�� ����ڰ� �θ����� �ϴ� ���� ��ġ�� ã��.age���� Korean�� �Է��� age���� �־���
//		this.country;	// static���� ���ǵ� Ÿ���� �������� ó�� �ٸ� �޼ҵ忡�� ����ϰų� �θ� �� ����
	}

	
	// ����ƽ �޼ҵ� / ���� �޼ҵ�
	public static void show() { // ��� �ν��Ͻ�(��ü)���� �����ϰ� �����ϴ� �޼ҵ�
		System.out.println("static �޼ҵ� ȣ���");	// "static �޼ҵ� ȣ���" ���
		System.out.println(country); // �ν��Ͻ����� �޶����� �ʴ� ����ƽ ������ ��밡��
		// �ν��Ͻ�(��ü)���� �޶����� �ν��Ͻ�(��ü)������ ����� �� ����
//		System.out.println(this.name); // this.name�� ���
	}

}