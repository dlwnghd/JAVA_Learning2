package inheritTest;

public class Main {
	public static void main(String[] args) {
		Car momCar = new Car("MOM", 2000, "blue");
		SuperCar myCar = new SuperCar("���",20000,"Red","Sports");
		
//		momCar.color = "blue";
//		momCar.name = "MOM";
//		momCar.price = 2000;
//		momCar.mode = "Sports"; �ڽĿ��� �ִ� �ν��Ͻ� ������ �θ�Ÿ�Կ��� ��� �Ұ�
		
		myCar.color = "red";
		myCar.name = "����ȫ";
		myCar.price = 20000;
		myCar.mode = "Sports";
		
		momCar.show();
		momCar.go();
		momCar.engineOn();	// �θ𿡼� ���ǵ� engineOn() ȣ��
//		momCar.openRoof();	// �ڽ�Ŭ�������� ���Ӱ� ���� �޼ҵ�� �θ�Ŭ�������� ����� �Ұ����ϴ�
		
		myCar.show();
		myCar.go();
		myCar.engineOn();	// �ڽĿ��� �����ǵ� engineOn() ȣ��
		myCar.openRoof();
//		myCar.engineOn2();
		
//		momCar.engineOn();�� myCar.engineOn();�� ���� �������� Ȯ���� �� �ִ�.
		
		// ��ӹ��� �ڽ��� �θ�Ÿ�Ե� �ȴ�.
		System.out.println(myCar instanceof SuperCar);	// true
		System.out.println(momCar instanceof SuperCar);	// false
		System.out.println(myCar instanceof Car);	// true
		System.out.println(momCar instanceof Car);	// true
		
		// up casting(��ĳ����) : �ڽ��� �θ�Ÿ������ �ְڴ�
		Car c = myCar;
//		c.mode			// ��ĳ���� �ȴٸ� �ڽĿ��� ���Ӱ� ���� ������� ����� �Ұ����ϴ�
//		c.openRoof();
		c.engineOn();	// �����ǵ� �޼ҵ尡 �״�� ȣ��ȴ�
		c.go();			// �θ𿡸� ���ǵ� �޼ҵ嵵 ��� ����
		
		// down casting(�ٿ�ĳ����) : �θ� �ڽ�Ÿ������ �ְڴ�
//		SuperCar s = (SuperCar) momCar;
//		s.go();		// ���� ���� �߻�
		// �ٿ�ĳ������ �θ�Ÿ������ ��ĳ���� �� �ڽ��� �ٽ� �ڽ�Ÿ������ �ٲٴ� ��
		SuperCar s = (SuperCar) c;
		s.go();
		s.mode = "normal";
		s.openRoof();
		
		
		
		
		
	}
}