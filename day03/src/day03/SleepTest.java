package day03;

public class SleepTest {
	public static void main(String[] args) {
		// 잠시동안 실행을 멈추는 메소드
		// sleep(밀리초) --> Thread클래스, static 메소드임
		System.out.println("시작");	// "시작" 출력
		for (int i = 0; i < 10; i++) {	// i는0; i가 10미만동안; i++
			System.out.print("~");	// "~" 출력
			try {
				Thread.sleep(1000);	// 1초
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}			
		}
		
		System.out.println("종료");	// "종료" 출력
	}
}
