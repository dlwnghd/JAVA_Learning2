package day08;

import java.util.HashMap;
import java.util.Scanner;

public class MapTask {
	
	// 메뉴 추가, 수정, 삭제 시 HaspMap에 같은 이름의 메뉴가 있는지 확인을 반복하기에 메소드 하나로 호출하기로 함
	// existKey(해시맵, 검사하고싶은문자열) 만약 해시맵안에 문자열이 key값으로 존재한다면 true, 아니면 false
	public static boolean existKey(HashMap<String, Integer> m, String key) {
		for (String k : m.keySet()) {	// String타입 k가 m에 있는 배열의 key값을 받아와 전체 반복
			if (k.equals(key)) {	// k가 key와 동일하다면
				return true;	// true값을 return
			}
		}
		return false;	// false값을 return
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	// Scanner 호출
		
		// 음식 이름과 가격을 저장할 저장공간
		HashMap<String, Integer> menus = new HashMap<>(); // Key는 String, Value는 Integer타입을 가지는 menus라는 이름의 비어있는 Map 정의
		boolean check = false;	// boolean타입 check는 false(0)
		
		// 카페 주문판 프로그램
		// 사장님이 이용하는 프로그램
		// 1. 메뉴 추가하기
		// 2. 메뉴가격 수정하기
		// 3. 메뉴 삭제하기
		// 4. 전체 메뉴보기
		// 5. 종료

		while (true) {	// 무한 반복
			// 메뉴 창
			System.out.println("1. 메뉴 추가하기");
			System.out.println("2. 가격 수정하기");
			System.out.println("3. 메뉴 삭제하기");
			System.out.println("4. 전체 메뉴보기");
			System.out.println("5. 종료");
			System.out.print("입력 >> ");
			int choice = Integer.parseInt(sc.nextLine());	// int타입 choice는 입력한 값은 Integer값으로 받음

			if (choice == 5) {	// 만약 choice가 5라면
				System.out.println("종료!");	// 종료 출력
				break;	// 반복문 탈출
			} else if (choice == 1) {	// 만약 choice가 1이라면
				// 메뉴 추가
				check = false; // check는 false 라고 재정의
				
				// 버그 수정, 이미 존재하는 메뉴를 추가하려고 한다면 추가 못하게 막아주기
				System.out.print("추가할 메뉴 >> ");	// 추가할 메뉴의 이름을 사용자로부터 입력 유도
				String name = sc.nextLine(); // 사용자로부터 입력받은 값을 String타입의 name에 대입
				for (String key : menus.keySet()) { // String타입 key에 menus에 있는 배열의 key값을 받아와 전체 반복
					// ↓내가 추가하고자 하는 메뉴가 이미 menus안에 존재한다는 의미
					if (key.equals(name)) { // key와 name이 일치한다면
						check = true;	// check는 true
						break;	// 반복문 탈출
					}
				}
				// 이미 menus 안에 내가 추가하고자 하는 메뉴가 존재한다면 check에는 true가 담겨있다
				// 만일 존재하지 않는다면 check에는 false가 담겨있다

				if (check == false) {	// 만약 check가 false라면 -> 같은 이름의 메뉴가 없다면
					System.out.print("가격 입력 >> ");	//  사용자로부터 가격 입력 유도
					int price = Integer.parseInt(sc.nextLine());	// 입력받은 값을 Integer타입으로 변환하여 int타입 price에 저장

					menus.put(name, price);	// menus의 put메소드 실행

					System.out.println("메뉴 추가 완료!");	// 메뉴 추가 완료 메세지 출력
				} else {	// check가 false가 아니라면
					System.out.println("이미 같은 이름의 메뉴가 존재합니다");	// 이미 같은 이름의 메뉴가 존재합니다 출력
				}

			} else if (choice == 2) {	// 2번
				// 가격 수정하기
				check = false; // check는 false 라고 재정의
				// 수정할 메뉴 이름을 입력받고 수정할 가격을 입력 받은 뒤
				// HashMap안의 값을 수정하기
				// 없는 메뉴를 수정하려고 할 때 막아주기
				System.out.print("수정할 메뉴 >> ");	//  수정할 메뉴 입력 유도
				String name = sc.nextLine(); // 사용자로부터 메뉴 입력 받음
				for (String key : menus.keySet()) { // menus에 있는 key만큼 반복
					if (key.equals(name)) { // 같은 이름의 메뉴가 있다면
						// 내가 수정하고자 하는 메뉴가 이미 menus안에 존재한다는 의미
						System.out.print("수정 가격 >> ");	// 수정 가격 입력 유도
						int price = Integer.parseInt(sc.nextLine());	// 입력받은 값을 Integer타입으로 변환하며 int타입 price에 정의
						menus.put(name, price);	// menus의 put메소드 실행, menus에 [key는 name, value는 price] 추가
						System.out.println("가격 수정 완료!");	// 가격 수정 완료 출력
						check = true;	// check는 true -> 찾는 메뉴가 존재하기 때문에 찾는 메뉴가 존재하지 않는 조건문은 실행 X
						break;	// 내부 반복문 탈출
					}
				}
				// 찾는 메뉴가 존재하지 않는다면
				if (check == false) {	// check가 false라면
					System.out.println("찾으시는 메뉴가 존재하지 않습니다");	// 사용자가 찾는 메뉴가 없다는 메세지 출력
				}
			} else if (choice == 3) {	// 3번
				// 메뉴 삭제하기
				// 삭제할 메뉴 이름을 입력받은 뒤
				// HashMap안의 값을 삭제하기
				// 없는 메뉴를 삭제하려고 할 때 막아주기
				System.out.print("삭제할 메뉴 >> ");
				String name = sc.nextLine(); // 사용자로부터 메뉴 입력 받음

				if (MapTask.existKey(menus, name)) { // menus에 name이라는 값이 있다면
					// 삭제
					menus.remove(name);	// menus의 remove메소드 실행, menus에 name이라는 key 삭제
					System.out.println("삭제 완료!");	// 삭제 완료 출력
				} else {	// menus에 name이라는 값이 없다면
					// 삭제 실패
					System.out.println("해당 메뉴는 존재하지 않습니다");	// 해당 메뉴는 존재하지 않습니다 출력
				}
			} else if (choice == 4) {	// 4번
				// 전체 메뉴보기
				System.out.println("--------메뉴--------");	// 메뉴
				// 아메리카노 : 1500원
				// 카페테라 : 2000원
				for (String key : menus.keySet()) {	// String타입 key에 menus에 있는 배열의 key값을 받아와 전체 반복
					System.out.println("|" + key + " : " + menus.get(key) + "원 |");	// key와 menus의 key의 value값을 출력
				}
				System.out.println("-------------------");	// 메뉴 닫기
			} else {	// 1,2,3,4,5 외의 다른 값 입력 시
				System.out.println("잘못 입력했습니다");	// 잘못 입력했습니다 출력
			}
		}

	}
}
