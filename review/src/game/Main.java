package game;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
//		Dog test = new Dog("춘식이", 20, 20);	// Dog클래스 test객체 = 새로운 값은 Dog타입으로("춘식이", 20, 20)을 저장
//		test.eat();		// test객체의 eat메소드 출력
//		test.walk();	// test객체의 walk메소드 출력
//		test.wash();	// test객체의 wash메소드 출력
		Scanner sc = new Scanner(System.in);	// 입력을 위한 Scanner 호출
		Animal avatar = null;	// Animal타입의 avatar = null값 정의
		
		// 메인화면 출력문
		System.out.println("★☆★☆모여라 동물친구들★☆★☆");
		System.out.println("게임 캐릭터를 선택하세요!");
		System.out.println("1. 강아지");
		System.out.println("2. 고양이");
		System.out.println("나머지숫자. 양");
		System.out.print("입력 >> ");
		int choice = Integer.parseInt(sc.nextLine());	// int값 choice는 사용자로부터 입력 받은 값을 int값으로 저장
		
		System.out.print("캐릭터 이름을 입력하시오 >> ");	// 사용자로부터 캐릭터 이름 입력 유도
		String name = sc.nextLine();	// String타입 name은 사용자로부터 입력받은 값을 String값으로 저장
		
		if(choice == 1) {	// 1. 강아지 선택
			avatar = new Dog(name, 20, 20);	// up캐스팅, Dog타입의 (name, 20, 20) 저장
		}else if(choice == 2) {	// 2. 고양이 선택
			avatar = new Cat(name, 20, 20);	// up캐스팅, Cat타입의 (name, 20, 20) 저장
		}else {	// 나머지숫자. 양 선택
			avatar = new Sheep(name, 20, 20);	// up캐스팅, Sheep타입의 (name, 20, 20) 저장
		}
		
		while(true) {
			// 캐릭터 메뉴 출력문
			System.out.println("1. 먹이주기");
			System.out.println("2. 산책가기");
			System.out.println("3. 씻기기");
			System.out.println("4. 나가기");
			System.out.print("입력 >> ");
			choice = Integer.parseInt(sc.nextLine());	// choice는 사용자로부터 입력 받은 값을 int값으로 저장
			
			if (choice == 4) {	// "4. 나가기" 선택
				System.out.println("게임을 종료합니다.");	// 게임 종료 출력문
				break;	// 반복문 탈출
			}else if(choice == 1){	// "1. 먹이주기" 선택
				avatar.eat();	// avatar객체.eat메소드 출력
			}else if(choice == 2){	// "2. 산책가기" 선택
				avatar.walk();	// avatar객체.walk메소드 출력
			}else if(choice == 3){	// "3. 씻기기" 선택
				avatar.wash();	// avatar객체.wash메소드 출력
			}else {	// 그 외의 번호 입력
				System.out.println("잘못 입력했습니다");	// "잘못 입력했습니다" 출력
			}
		}
		
		// [추가] 고양이 이스터에그
		// 사용자가 선택한 캐릭터가 고양이였다면 고양이에만 존재하는 메소드를 실행시키고
		// 종료한다
		// onlyCat은 Cat 클래스에서 새롭게 정의한 메소드이기 때문에
		// 사용하려면 다시 Cat 타입으로 다운캐스팅 해야 한다
		if (avatar instanceof Cat) {	// avatar의 타입이 Cat타입이니?
			Cat c = (Cat)avatar;	// 다운캐스팅
			c.onlyCat();			// c(객체).onlyCat()메소드 출력
		}
	}
}