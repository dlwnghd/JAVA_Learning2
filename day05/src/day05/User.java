package day05;

public class User {
	public void wash() throws InterruptedExceptionp{
		Thread.sleep(1000);
	}
	
	public void setNickName(String nick) throws BadWordException{
		if (nick.equals("바보")) {
			throw new BadWordException("바보라고 입력됨");
		}else if(nick.equals("멍청이")) {
			throw new BadWordException("멍청이라고 입력됨");
		}
		System.out.println("닉네임이" + nick + "으로 설정되었습니다.");
	}
}
