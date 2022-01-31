package wrapperTest;

public class WrapperTest {
	public static void main(String[] args) {
		int num1 = 10;	// int타입의 num1
		Integer num2 = new Integer(10);	// Integer타입의 num2, Integer는 클래스
		Integer num3 = new Integer(10);	// Integer타입의 num3, Integer는 클래스
		System.out.println("num1 : "+ num1);	// num1출력
		System.out.println("num2 : "+ num2);	// num2출력
		System.out.println("num3 : "+ num3);	// num3출력
		System.out.println("num2 == num3 : "+ (num2 == num3));	// 주소값을 비교한다 false
		// ==은 주소값을 비교함
		// Integer, Double, Character, Boolean 등의 클래스는 비교할 때 .equals를 사용 
		System.out.println(num2.equals(num3));	// 내용이 같은지 비교할떄는 .equals() 사용
		System.out.println("-------------------");
		
		// num2가 auto unboxing
		System.out.println(num1 == num2);	// num1의 주소값이 num2의 주소값과 같니?
		System.out.println("-------------------");
		
		// num1이 auto boxing
		System.out.println(num2.equals(num3));	// num2의 내용이 num3의 내용과 같니?
		System.out.println("-------------------");
		
		String str1 = "안녕";	// String타입 str1객체
		String str2 = "안녕";	// String타입 str2객체
		String str3 = new String("안녕");	// heap이라는 영역의 객체에 String타입 str3객체
		String str4 = new String("안녕");	// heap이라는 영역의 객체에 String타입 str4객체
		System.out.println(str1 == str2);	// str1의 주소값이 str2와 같니?
		System.out.println(str3 == str4);	// str3의 주소값이 str4와 같니?, 둘 다 wrapper클래스 이기에 false
		
	}
}
