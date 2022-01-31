package wrapperTest;

public class BoxingUnboxing {
	public static void main(String[] args) {
		// boxing : 기본자료형 --> 랩퍼클래스
		int i = 10;	// int타입의 i객체 정의
		Integer wi = new Integer(i);	// 기본자료형 --> 랩퍼클래스
		
		// unboxing : 랩퍼클래스 --> 기본자료형
		wi.intValue();	// unboxing
		
		// jdk 1.5 이후로 auto를 지원한다
		int i2 = 10;
		Integer wi2 = i2;	// auto boxing
		
		int i3 = wi2;	// auto unboxing
		
		// auto boxing, Object타입으로 up casting까지 자동
		Object[] ar = {10, 20, 3.4, true};	// Object타입 배열의 ar객체
		int[] ar2 = {10};
		
	}
}