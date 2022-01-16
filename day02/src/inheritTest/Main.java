package inheritTest;

public class Main {
	public static void main(String[] args) {
		Car momCar = new Car("MOM", 2000, "blue");
		SuperCar myCar = new SuperCar("���",20000,"Red","Sports");
		
//		momCar.color = "blue";
//		momCar.name = "MOM";
//		momCar.price = 2000;
//		momCar.mode = "Sports"; �ڽĿ��� �ִ� �ν��Ͻ� ������ �θ�Ÿ�Կ��� ��� �Ұ�
		
		myCar.color = "red"; // myCar��ü�� color�ν��Ͻ��� "red" ����
		myCar.name = "����ȫ"; // myCar��ü�� name�ν��Ͻ��� "����ȫ" ����
		myCar.price = 20000; // myCar��ü�� price�ν��Ͻ��� 20000 ����
		myCar.mode = "Sports";	// myCar��ü�� mode�ν��Ͻ��� "Sports" ����
		
		momCar.show();	// momCar��ü�� show() �޼ҵ�
		momCar.go();	// momCar��ü�� go() �޼ҵ�
		momCar.engineOn();	// �θ𿡼� ���ǵ� engineOn() ȣ��
//		momCar.openRoof();	// �ڽ�Ŭ�������� ���Ӱ� ���� �޼ҵ�� �θ�Ŭ�������� ����� �Ұ����ϴ�
		
		myCar.show();	// myCar��ü�� show() �޼ҵ�
		myCar.go();		// myCar��ü�� go() �޼ҵ�
		myCar.engineOn();	// myCar��ü�� �����ǵ� engineOn() ȣ��
		myCar.openRoof();	// myCar��ü�� ���ǵ� openRoof() ȣ��
//		myCar.engineOn2();
		
//		momCar.engineOn();�� myCar.engineOn();�� ���� �������� Ȯ���� �� �ִ�.
		
		// ��ӹ��� �ڽ��� �θ�Ÿ�Ե� �ȴ�.
		System.out.println(myCar instanceof SuperCar);	// true
		System.out.println(momCar instanceof SuperCar);	// false
		System.out.println(myCar instanceof Car);	// true
		System.out.println(momCar instanceof Car);	// true
		
		// up casting(��ĳ����) : �ڽ��� �θ�Ÿ������ �ְڴ�
		Car c = myCar;
//		c.mode();		// ��ĳ���� �ȴٸ� �ڽĿ��� ���Ӱ� ���� ������� ����� �Ұ����ϴ�
//		c.openRoof();	// �ڽĸ޼ҵ忡�� �ִ� �޼ҵ� �̱� ������ �۵����� ����
		c.engineOn();	// �����ǵ� �޼ҵ尡 �״�� ȣ��ȴ�
		c.go();			// �θ𿡸� ���ǵ� �޼ҵ嵵 ��� ����
		
		// down casting(�ٿ�ĳ����) : �θ� �ڽ�Ÿ������ �ְڴ�
//		SuperCar s = (SuperCar) momCar;
//		s.go();		// ���� ���� �߻�, �θ�Ŭ������ �� �۱� ������ �θ� �� ���� �޼ҵ�
		// �ٿ�ĳ������ �θ�Ÿ������ ��ĳ���� �� �ڽ��� �ٽ� �ڽ�Ÿ������ �ٲٴ� ��
		SuperCar s = (SuperCar) c;	// SuperCarŬ���� s��ü = c�� (SuperCar)Ÿ������ �ٲ�
		s.go();	// s��ü�� go�޼ҵ� ���
		s.mode = "normal";	// s��ü�� mode�� = "normal"�̴�
		s.openRoof();	// s��ü�� openRoof�޼ҵ� ���
	}
}