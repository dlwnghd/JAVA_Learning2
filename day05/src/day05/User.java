package day05;

public class User {
	public void wash() throws InterruptedException{
		Thread.sleep(1000);
	}
	
	// 닉네임을 정의해주는 메소드
	public void setNickName(String nick) throws BadWordException{
		if (nick.equals("바보")) {	// nick이 "바보"와 같다면
			throw new BadWordException("바보라고 입력됨");
		}else if(nick.equals("멍청이")) {	// nick이 "멍청이"와 같다면
			throw new BadWordException("멍청이라고 입력됨");
		}
		System.out.println("닉네임이" + nick + "으로 설정되었습니다.");
	}
}
