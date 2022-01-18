package codingTest;

public class Test {
	public static void main(String[] args) {
        // TODO Auto-generated method stub
        StringBuffer sb = new StringBuffer();
        
        sb.append("Mozi Tistory Is Best. :)");
        sb.replace(0, sb.length()-10, "*");
        
        System.out.println(sb);
    }
}
