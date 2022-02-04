package day06;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	// Scanner 호출

		ArrayList<User> users = new ArrayList<User>(); // User users = new User();

		boolean isDup = false;	// , boolean타입 isDup은 false로 정의

		while (true) {	// 무한 반복
			System.out.println("1.회원가입\n2.로그인\n3.회원정보\n4.나가기\n");	// 메인메뉴 출력
			System.out.print("입력 >> ");	// 사용자로부터 입력 유도
			int choice = Integer.parseInt(sc.nextLine());	// int타입 choice는 사용자가 입력한 값을 Integer타입으로 변경하여 저장

			if (choice == 4) { // 4. 나가기
				System.out.println("종료합니다.");	//종료 출력
				break;	// 반복문 탈출
			} else if (choice == 1) { // 1. 회원가입
				isDup = false;	// isDup은 false라고 재정의
				System.out.print("id : ");	// id 출력
				String id = sc.nextLine();	// String타입 id는 사용자가 입력한 값
				// id가 만약 중복 되었다면 회원가입 실패
				// id 중복여부 검사
				for (int i = 0; i < users.size(); i++) {	// int타입 i는 0; ,user데이터의 크기 미만동안 반복; i++
					// users.get(i).id.equals(id)
					if (users.get(i).getId().equals(id)) {	// user객체의 i번째 요소의 Id가 사용자가 입력한 id와 같다면
						// 중복된 아이디가 존재할 때 오는 영역
						System.out.println("중복되는 아이디가 존재합니다!");	// 중복되는 아이디가 존재합니다! 출력
						isDup = true;	// isDup은 true라고 재정의
						break;	// 내부 반복문 탈출
					}
				}
				if (!isDup/* isDup == false */) {	// isDup이 false라면 실행
					User u = new User();	// User타입의 객체 u 생성
					u.setId(id); // u.id = sc.nextLine();	// 입력했던 값 대입
					System.out.print("pw : ");	// 사용자로부터 pw 입력 유도
					u.setPw(sc.nextLine()); // u.pw = sc.nextLine();
					System.out.print("이름 : ");	// 사용자로부터 이름 입력 유도
					u.setName(sc.nextLine()); // u.name = sc.nextLine();
					System.out.print("나이 : ");	// 사용자로부터 나이 입력 유도
					u.setAge(Integer.parseInt(sc.nextLine())); // u.age = Integer.parseInt(sc.nextLine());
					users.add(u);	// users객체에 u가 가진 값 추가
					System.out.println();	// 줄바꿈
				}
			} else if (choice == 2) { // 2. 로그인
				isDup = false;	// isDup은 false라고 재정의
				// 1. 아이디를 입력받는다
				System.out.print("ID : ");	// 사용자로부터 ID입력 유도
				String id = sc.nextLine();	// String타입의 id는 사용자가 입력한 값
				// 비밀번호를 입력 받는다
				System.out.print("PW : ");	// 사용자로부터 PW입력 유도
				String pw = sc.nextLine();	// String타입의 pw는 사용자가 입력한 값
				
				// 2. 해당 아이디가 users에서 동일한 id가 있는지 검사합니다

				// 빠른 for문
				for (User u : users) { // User타입의 u에 users 값을 넣어줌
					if (u.getId().equals(id) && u.getPw().equals(pw)) {	// id의 값과 pw의 값이 일치한다면
						isDup = true;	// isDup는 true
						System.out.println("로그인 성공~!");	// 로그인 성공 메세지
						System.out.println(u.getName() + "님 환영합니다\n");	// 유저 환영 메세지
						break;	// 내부 반복문 탈출
					}
				}

				if (!isDup/* == false */) { // isDup이 false라면 로그인이 실패했다는 의미
					System.out.println("로그인 실패!!\n");	// 로그인 실패 메세지
				}

				// for문
//				for (int i = 0; i < users.size(); i++) {	// int i는 0; i가 users의 데이터길이 미만 동안; i++
//					// 3. 만일 동일한 id를 찾았다면
//					if (users.get(i).getId().equals(id)) {	// users의 i번째 데이터에서 Id값이 사용자가 입력한 id값과 일치한다면
//						isDup = true;	// isDup는 true로 재정의
//						// 해당 비밀번호가 일치하는지 확인한다
//						// 비밀번호가 일치한다면 로그인 성공! 000님 환영합니다
//						if (users.get(i).getPw().equals(pw)) {	// users의 i번째 데이터에서 Pw값이 사용자가 입력한 pw값과 일치한다면
//							System.out.println("로그인 성공! 000님 환영합니다!\n");	// 로그인 성공 메세지
//							break;	// 내부 반복문 탈출
//						} else {	// 비밀번호가 일치하지 않는다면
//							System.out.println("로그인 실패\n");	// 로그인 실패 메세지
//							break;	// 내부 반복문 탈출
//						}
//					}
//				}
//				
//				if (!isDup) {	// isDup이 false라면
//					// 4. 동일한 id가 users에 존재하지 않는다면 로그인 실패
//					System.out.println("동일한 ID가 없습니다!\n");	// 동일한 ID가 미존재 메세지 출력
//				}

			} else if (choice == 3) { // 3. 회원정보
				isDup = false;	// isDup은 false라고 재정의
				// 1. 아이디를 입력받는다
				System.out.print("ID : ");	// 사용자로부터 ID값 입력 유도
				String id = sc.nextLine();	// String타입의 id에 사용자가 입력한 값 저장
				// 2. 해당 아이디가 users에서 동일한 id가 있다면

				// for문
//				for (int i = 0; i < users.size(); i++) {	// int i는 0; i가 users의 데이터길이 미만 동안; i++
//					// 3. 만일 동일한 id를 찾았다면
//					if (users.get(i).getId().equals(id)) {	// users의 i번째 데이터에서 Id값이 사용자가 입력한 id값과 일치한다면
//						isDup = true;	// isDup은 true로 재정의
//						// 해당 회원의 정보를 보여준다
//						users.get(i).show();	// users의 i번째에 show메소드 실행
//						break;	// 내부 반복문 탈출
//					}
//				}

				// 빠른 for문
				// 근데 왜 되었는지는 의문임
				for (User check_id : users) { // User타입 str에 user값을 차례대로 입력
					// 3. 만일 동일한 id를 찾았다면
					if (check_id.getId().equals(id)) { // str의 id값이 입력한 id와 같다면
						isDup = true;	// isDup은 true로 재정의
						// 해당 회원의 정보를 보여준다
						check_id.show(); // str의 show()메소드 출력
						break;	// 내부 반복문 탈출
					}
				}

				// 동일한 id가 없다면
				// 존재하지 않는 id입니다!
				// 검색 실패!, 해당 아이디가 존재하지 않습니다
				if (!isDup) {	// isDup이 false라면
					System.out.println("검색 실패!, 해당 아이디가 존재하지 않습니다\n");	// 검색 실패 메세지
				}
				// 빠른for문 일반 for문
			} else { // 메인메뉴에서 다른 번호 입력시
				System.out.println("잘못 입력 했습니다!\n");	// 잘못 입력 했습니다! 출력
			}
		}
	}
}