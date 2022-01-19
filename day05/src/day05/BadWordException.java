package day05;

public class BadWordException extends Exception{
	
	// 기본 생성자
	public BadWordException() {}
	
	// 매개변수로 받은 경우
	public BadWordException(String s) {
		super(s);
	}
}
