package movieDTO;

public class MovieDTO {	// Data Tranfer Object(데이터를 옮기는데 사용되는 객체)
	private int rank;	// 순위
	private String title;	// 제목
	private String date;	// 개봉일
	private String revenue;	// 수익
	private String view;	// 관객수
	private String screen;	// 스크린수
	
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getRevenue() {
		return revenue;
	}
	public void setRevenue(String revenue) {
		this.revenue = revenue;
	}
	public String getView() {
		return view;
	}
	public void setView(String view) {
		this.view = view;
	}
	public String getScreen() {
		return screen;
	}
	public void setScreen(String screen) {
		this.screen = screen;
	}
	
}
