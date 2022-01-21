package day06;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		ArrayList<User> users = new ArrayList<User>(); // User users = new User();

		boolean isDup = false;

		while (true) {
			System.out.println("1.회원가입\n2.로그인\n3.회원정보\n4.나가기\n");
			System.out.print("입력 >> ");
			int choice = Integer.parseInt(sc.nextLine());

			if (choice == 4) { // 4. 나가기
				System.out.println("종료합니다.");
				break;
			} else if (choice == 1) { // 1. 회원가입
				isDup = false;
				System.out.print("id : ");
				String id = sc.nextLine();
				// id가 만약 중복 되었다면 회원가입 실패
				// id 중복여부 검사
				for (int i = 0; i < users.size(); i++) {
					// users.get(i).id.equals(id)
					if (users.get(i).getId().equals(id)) {
						// 중복된 아이디가 존재할 때 오는 영역
						System.out.println("중복되는 아이디가 존재합니다!");
						isDup = true;
						break;
					}
				}
				if (!isDup/* is Dup == false */) {
					User u = new User();
					u.setId(id); // u.id = sc.nextLine();
					System.out.print("pw : ");
					u.setPw(sc.nextLine()); // u.pw = sc.nextLine();
					System.out.print("이름 : ");
					u.setName(sc.nextLine()); // u.name = sc.nextLine();
					System.out.print("나이 : ");
					u.setAge(Integer.parseInt(sc.nextLine())); // u.age = Integer.parseInt(sc.nextLine());
					users.add(u);
					System.out.println();
				}
			} else if (choice == 2) { // 2. 로그인
				isDup = false;
				// 1. 아이디를 입력받는다
				System.out.print("ID : ");
				String id = sc.nextLine();
				// 비밀번호를 입력 받는다
				System.out.print("PW : ");
				String pw = sc.nextLine();
				// 2. 해당 아이디가 users에서 동일한 id가 있는지 검사합니다

				// 빠른 for문
				for (User u : users) { // User타입의 u에 users 값을 넣어줌
					if (u.getId().equals(id) && u.getPw().equals(pw)) {
						isDup = true;
						System.out.println("로그인 성공~!");
						System.out.println(u.getName() + "님 환영합니다\n");
						break;
					}
				}

				if (!isDup/* == false */) { // isDup이 false라면 로그인이 실패했다는 의미
					System.out.println("로그인 실패!!\n");
				}

				// for문
//				for (int i = 0; i < users.size(); i++) {
//					// 3. 만일 동일한 id를 찾았다면
//					if (users.get(i).getId().equals(id)) {
//						isDup = true;
//						// 해당 비밀번호가 일치하는지 확인한다
//						// 비밀번호가 일치한다면 로그인 성공! 000님 환영합니다
//						if (users.get(i).getPw().equals(pw)) {
//							System.out.println("로그인 성공! 000님 환영합니다!\n");
//							break;
//						} else {
//							// 비밀번호가 일치하지 않는다면 로그인 실패
//							System.out.println("로그인 실패\n");
//							break;
//						}
//					}
//				}
//				
//				if (!isDup) {
//					// 4. 동일한 id가 users에 존재하지 않는다면 로그인 실패
//					System.out.println("동일한 ID가 없습니다!\n");
//				}

			} else if (choice == 3) { // 3. 회원정보
				isDup = false;
				// 1. 아이디를 입력받는다
				System.out.print("ID : ");
				String id = sc.nextLine();
				// 2. 해당 아이디가 users에서 동일한 id가 있다면

				// for문
//				for (int i = 0; i < users.size(); i++) {
//					// 3. 만일 동일한 id를 찾았다면
//					if (users.get(i).getId().equals(id)) {
//						isDup = true;
//						// 해당 회원의 정보를 보여준다
//						users.get(i).show();
//						break;
//					}
//				}

				// 빠른 for문
				// 근데 왜 되었는지는 의문임
				for (User check_id : users) { // User타입 str에 user값을 차례대로 입력
					// 3. 만일 동일한 id를 찾았다면
					if (check_id.getId().equals(id)) { // str의 id값이 입력한 id와 같다면
						isDup = true;
						// 해당 회원의 정보를 보여준다
						check_id.show(); // str의 show()메소드 출력
						break;
					}
				}

				// 동일한 id가 없다면
				// 존재하지 않는 id입니다!
				// 검색 실패!, 해당 아이디가 존재하지 않습니다
				if (!isDup) {
					System.out.println("검색 실패!, 해당 아이디가 존재하지 않습니다\n");
				}
				// 빠른for문 일반 for문
			} else { // 메인메뉴에서 다른 번호 입력시
				System.out.println("잘못 입력 했습니다!\n");
			}
		}
	}
}