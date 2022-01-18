package day03;

public class SleepTest {
	public static void main(String[] args) {
		// 잠시동안 실행을 멈추는 메소드
		// sleep(밀리초) --> Thread(클래스)안에 만들어짐, static 메소드임
		System.out.println("시작");
		for (int i = 0; i < 10; i++) {
			System.out.print("~");
			try {
				Thread.sleep(1000);	// 5초
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}			
		}
		System.out.println("종료");
	}
}
