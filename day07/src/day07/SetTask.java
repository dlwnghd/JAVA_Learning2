package day07;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class SetTask {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	// Scanner 호출
		/*Hash*/Set<String> names = new HashSet<>();	// 이름을 저장할 저장공간
		// 반에 존재하는 학생 이름의 종류와 갯수를 출력하는 프로그램
		// 프로그램을 시작하면 학생 이름을 입력받기 시작한다.
		// 이때 "종료"를 입력하면 학생 이름을 그만 입력 받는다
		
		while(true) {	// 무한 반복
			System.out.print("이름(종료를 입력하면 멈춥니다) 입력 >> ");	// 사용자에게 이름 입력 혹은 종료 입력 유도
			String name = sc.nextLine();	// 입력한 값 String타입 name에 정의
			if(name.equals("종료")) {	// name의 값이 "종료"라면
				System.out.println("프로그램을 종료합니다.");	// 프로그램 종료 출력
				break;	// /반복문 탈출
			}
			names.add(name);	// names에 name값 추가
			System.out.println("이름 추가됨!");	// 이름 추가됨 출력
		}
		
		// 입력이 끝나고 나면 해당 반 학생 이름들과 이름의 갯수를 출력한다.
		Iterator<String> iter = names.iterator();	// Iterator의 String타입 iter은 names에 순서를 만듬
		int num = 0;	// int타입 num은 0이라 정의
		while(iter.hasNext()) {	// iter에 요소나 값이 있는 동안 반복
			num++;	// num에 1을 더해줌
			System.out.println("이름" + num + ":" + iter.next());	// 이름에 번호를 추가해서 출력
		}
		System.out.println("총 " + names.size() + "개의 이름이 존재합니다");	// 이름의 총 갯수를 출력
		
	}
}
