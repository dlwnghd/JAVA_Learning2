package day01;

import java.util.Scanner;

// 실무에서는 공동작업이 중요하기 때문에
// Class를 하나의 파일에 모든 것을 만들어 두지 않음

public class ClassTest {	// ClassTest 클래스
	public static void main(String[] args) {	// main 클래스
//		Student kim = new Student("김철수", 90, 70);		// Student타입의 kim 객체 생성, 값은 Student타입 저장
//		Student park = new Student("박영희", 100, 80);	// Student타입의 park 객체 생성, 값은 Student타입 저장
		
		// 새로운 학생이 옴(전학생) : 이름, 국어점수, 영어점수 모름
		// 기본 생성자 사용
//		Student s = new Student();	// Student타입의 s객체 = 연산자 new Student()로 매모리 위치를 알려줌
		
		int[] ar = {10, 20, 30};	// 아래 코드 이해시키기 용도(위와 비슷한 느낌이다)
		Student[] students = {new Student("김철수", 90, 70),	// Student배열 student라는 이름으로 [0] = {"김철수", 90, 70}을 가짐
								new Student("박영희", 100, 80),	// Student배열 student라는 이름으로 [1] = {"박영희", 100, 80}을 가짐
								new Student("홍길동", 50, 60)};	// Student배열 student라는 이름으로 [2] = {"홍길동", 50, 60}을 가짐
		
		// 학생 이름을 입력 받아서
		// 해당 학생의 성적 정보를 출력하는 프로그램
		// 이 학교에는 3 명의 학생이 있고, 정보는 students라는 배열에 저장되어있다
		Scanner sc = new Scanner(System.in);	// Scanner를 scan으로 사용한다고 컴퓨터에게 알려줌
		System.out.print("학생 이름 입력 >>");		// "학생 이름 입력 >>" 출력
		String Searchname = sc.nextLine();		// String타입 Searchname을 사용자로부터 입력값을 받아서 저장
		boolean check = false;	// flag 변수 : 어디까지 왔는지 확인하기 위한 변수
		
		// 배열안에 클래스
		for (Student st : students) {	// 빠른 for문으로, Student타입의 st를 선언함과 동시에 st의 값을 students안의 값 전체를 반복하는 동안
			if(st.name.equals(Searchname)) {	// st.name값이 Searchname값이 같다면
				check = true;	// 찾는 이름이 있다면 check = true값이 됨
				st.show();		// Student타입 내부에 show메소드가 있기 때문에, st.show();를 통해 배열의 값마다 show메소드를 사용
			}
		}
		if(check == false) {	// 찾는 이름이 없다면 check값이 변경되지 않았으므로
			System.out.println("해당 학생은 찾을 수 없습니다.");	// "해당 학생은 찾을 수 없습니다." 출력
		}
		
		// 빠른 for문으로 출력
		for(Student st : students) {	// Student타입으로 st를 students데이터 길이동안
			st.show();	// Student타입 내부에 show메소드가 있기 때문에, st.show();를 통해 배열의 값마다 show메소드를 사용
		}
		
		
		// ↑에 더 쉽게 표현함
//		Student kim = new Student();	// 객체 생성
//		Student park = new Student();	// 객체 생성
		
//		kim.name = "김철수";	// Student타입 kim객체의 name에 "김철수" 저장
//		kim.kor = 90;		// Student타입 kim객체의 kor에 90 저장
//		kim.eng = 70;		// Student타입 kim객체의 eng에 70 저장
//		
//		park.name = "박영희";	// Student타입 park객체의 name에 "박영희" 저장
//		park.kor = 100;		// Student타입 park객체의 kor에 100 저장
//		park.eng = 80;		// Student타입 park객체의 eng에 80 저장
//		
//		kim.show();		// Student 클래스 내의 kim내부에 show메소드 사용
//		park.show();	// Student 클래스 내의 park내부에 show메소드 사용
		
		// 클래스 타입이 요소로 들어있는 배열
//		students[0].show(); // studetns배열의 0번째의 show메소드 사용
//		students[1].show(); // studetns배열의 1번째의 show메소드 사용
//		students[2].show();	// studetns배열의 2번째의 show메소드 사용
	}
}