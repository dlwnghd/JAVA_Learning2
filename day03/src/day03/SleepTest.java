package day03;

public class SleepTest {
	public static void main(String[] args) {
		// 잠시동안 실행을 멈추는 메소드
		// sleep(밀리초) --> Thread클래스, static 메소드임
		System.out.println("시작");	// "시작" 출력
		for (int i = 0; i < 10; i++) {	// i는0; i가 10미만동안; i++
			System.out.print("~");	// "~" 출력
			try {	// {}안에 있는 코드를 실행하는데 오류가 발생하면 catch문 안에 있는 코드를 실행
				Thread.sleep(1000);	// Thread클래스 의 sleep메소드, 1000 => 1초
			} catch (InterruptedException e) {	// 오류 : InterruptedException타입 오류 객체 e가 발생하면 {} 실행
				// TODO Auto-generated catch block
				e.printStackTrace();	// 객체e.의 printStackTrace메소드 실행
			}			
		}
		
		System.out.println("종료");	// "종료" 출력
	}
}