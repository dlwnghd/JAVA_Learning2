package day08;

import java.util.HashMap;
import java.util.Scanner;

public class MapTask {

	// existKey(해시맵, 검사하고싶은문자열) 만약 해시맵안에 문자열이 key값으로 존재한다면 true, 아니면 false
	public static boolean existKey(HashMap<String, Integer> m, String key) {
		for (String k : m.keySet()) {
			if (k.equals(key)) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		HashMap<String, Integer> menus = new HashMap<>(); // menus라는 이름의 비어있는 Map

		boolean check = false;
		// 카페 주문판 프로그램
		// 1. 메뉴 추가하기
		// 2. 메뉴가격 수정하기
		// 3. 메뉴 삭제하기
		// 4. 전체 메뉴보기
		// 5. 종료

		while (true) {
			System.out.println("1. 메뉴 추가하기");
			System.out.println("2. 가격 수정하기");
			System.out.println("3. 메뉴 삭제하기");
			System.out.println("4. 전체 메뉴보기");
			System.out.println("5. 종료");
			System.out.print("입력 >> ");
			int choice = Integer.parseInt(sc.nextLine());

			if (choice == 5) {
				System.out.println("종료!");
				break;
			} else if (choice == 1) {
				check = false; // 체크용
				// 메뉴 추가
				// 버그 수정, 이미 존재하는 메뉴를 추가하려고 한다면 추가 못하게 막아주기
				System.out.print("추가할 메뉴 >> ");
				String name = sc.nextLine(); // 사용자로부터 메뉴 입력 받음
				for (String key : menus.keySet()) { // menus에 있는 배열만큼 반복
					if (key.equals(name)) { // 같은 이름의 메뉴가 있다면
						// 내가 추가하고자 하는 메뉴가 이미 menus안에 존재한다는 의미
						check = true;
						break;
					}
				}
				// 이미 menus 안에 내가 추가하고자 하는 메뉴가 존재한다면 check에는 true가 담겨있다
				// 만일 존재하지 않는다면 check에는 false가 담겨있다

				if (check == false) {
					System.out.print("가격 입력 >> ");
					int price = Integer.parseInt(sc.nextLine());

					menus.put(name, price);

					System.out.println("메뉴 추가 완료!");
				} else {
					System.out.println("이미 같은 이름의 메뉴가 존재합니다");
				}

			} else if (choice == 2) {
				check = false; // 체크용
				// 가격 수정하기
				// 수정할 메뉴 이름을 입력받고 수정할 가격을 입력 받은 뒤
				// HashMap안의 값을 수정하기
				// 없는 메뉴를 수정하려고 할 때 막아주기
				System.out.print("수정할 메뉴 >> ");
				String name = sc.nextLine(); // 사용자로부터 메뉴 입력 받음
				for (String key : menus.keySet()) { // menus에 있는 key만큼 반복
					if (key.equals(name)) { // 같은 이름의 메뉴가 있다면
						// 내가 수정하고자 하는 메뉴가 이미 menus안에 존재한다는 의미
						System.out.print("수정 가격 >> ");
						int price = Integer.parseInt(sc.nextLine());
						menus.put(name, price);
						System.out.println("가격 수정 완료!");
						check = true;
						break;
					}
				}

				if (check == false) {
					System.out.println("찾으시는 메뉴가 존재하지 않습니다");
				}
			} else if (choice == 3) {
				// 메뉴 삭제하기
				// 삭제할 메뉴 이름을 입력받은 뒤
				// HashMap안의 값을 삭제하기
				// 없는 메뉴를 삭제하려고 할 때 막아주기
				System.out.print("삭제할 메뉴 >> ");
				String name = sc.nextLine(); // 사용자로부터 메뉴 입력 받음

				if (MapTask.existKey(menus, name)) {	// 메소드 사용
					// 삭제
					menus.remove(name);
					System.out.println("삭제 완료!");
				} else {
					// 삭제 실패
					System.out.println("해당 메뉴는 존재하지 않습니다");
				}
			} else if (choice == 4) {
				System.out.println("--------메뉴--------");
				// 아메리카노 : 1500원
				// 카페테라 : 2000원
				for (String key : menus.keySet()) {
					System.out.println("|" + key + " : " + menus.get(key) + "원 |");
				}
				System.out.println("-------------------");
			} else {
				System.out.println("잘못 입력했습니다");
			}
		}

	}
}
