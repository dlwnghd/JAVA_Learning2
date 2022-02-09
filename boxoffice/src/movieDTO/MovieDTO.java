package movieDTO;

public class MovieDTO {	// Data Tranfer Object(데이터를 옮기는데 사용되는 객체)	-> Model
	private int rank;	// 순위,	int타입의 rank
	private String title;	// 제목, String타입의 title
	private String date;	// 개봉일, String타입의 date
	private String revenue;	// 수익, String탕비의 revenue
	private String view;	// 관객수, String탕비의 view
	private String screen;	// 스크린수, String탕비의 screen
	
	
	// getter, setter 생성
	
	public int getRank() {	// 기본 생성자
		return rank;
	}
	public void setRank(int rank) {	// int타입 rank를 받은 setRank메소드
		this.rank = rank;	// 입력받은 rank값을 부모의 rank로 정의
	}
	public String getTitle() {	// 기본 생성자
		return title;
	}
	public void setTitle(String title) {	// String타입 title을 받은 setTitle메소드
		this.title = title;	// 입력받은 title을 부모의 title로 정의
	}
	public String getDate() {	// 기본 생성자
		return date;
	}
	public void setDate(String date) {	// String타입 date를 받은 setDate메소드
		this.date = date;	// 입력받은 date를 부모의 date로 정의
	}
	public String getRevenue() {	// 기본 생성자
		return revenue;
	}
	public void setRevenue(String revenue) {	// String타입 revenue를 받은 setRevenue메소드
		this.revenue = revenue;	// 입력받은 revenue를 부모의 revenue로 정의
	}
	public String getView() {	// 기본 생성자
		return view;
	}
	public void setView(String view) {	// String타입 view를 받은 setView메소드
		this.view = view;	// 입력받은 view를 부모의 view로 정의
	}
	public String getScreen() {	// 기본 생성자
		return screen;
	}
	public void setScreen(String screen) {	// String타입 screen을 받은 setScreen메소드
		this.screen = screen;	// 입력받은 screen를 부모의 screen으로 정의
	}
	
}
