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
	public void setRank(int rank) {
		this.rank = rank;
	}
	public String getTitle() {	// 기본 생성자
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDate() {	// 기본 생성자
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getRevenue() {	// 기본 생성자
		return revenue;
	}
	public void setRevenue(String revenue) {
		this.revenue = revenue;
	}
	public String getView() {	// 기본 생성자
		return view;
	}
	public void setView(String view) {
		this.view = view;
	}
	public String getScreen() {	// 기본 생성자
		return screen;
	}
	public void setScreen(String screen) {
		this.screen = screen;
	}
	
}
