package wrapperTest;

public class StringTest {
	public static void main(String[] args) {
		String msg = "안녕 하세요 반갑 습니다";
		// length() : 해당문자열 길이를 int값으로 return
		System.out.println("msg.length() : " + msg.length());
		// charAt() : 해당 인덱스의 문자를 return
		System.out.println("msg.charAt(0) : " + msg.charAt(0));
		// indexOf() : 특정 문자열의 인덱스를 return
		System.out.println("msg.indexOf(\"반갑\") : " + msg.indexOf("반갑"));
		System.out.println("msg.indexOf(\"a\") : " + msg.indexOf("a"));	// 없다면 -1 return
		String msg2 = "apple apple";
		System.out.println("msg2.indexOf(\"p\", 3) : " + msg2.indexOf("p", 3));	// 찾기 시작하는 숫자 설정 가능
		
		// substring() --> 문자열 자르기 String[] return됨
		System.out.println("msg2.substring(3) : " + msg2.substring(3));
		
//		String msg = "안녕 하세요 반갑 습니다";
		String[] res = msg.split(" ");	// " " 별로 분리하여 res배열 안에 입력
		for (int i = 0; i < res.length; i++) {
			System.out.println("res["+i+"] : " + res[i]);
		}
		
		// join(연결문자열, 연결시킬배열)
		System.out.println("String.join(\"-\", res) : " + String.join("-", res));
		
		
	}
}
