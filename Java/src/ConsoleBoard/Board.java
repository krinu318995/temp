package ConsoleBoard;

public class Board {

	private int number;
	private String title;
	private String contents;
	private String writer;
	private String date;
	private int count;
	
	public static int totalNumber = 0;//전체 게시물 개수
	
	public Board() {
		// TODO Auto-generated constructor stub
	}

	public Board(int number, String title, String contents, String writer, String date, int count) {
		super();
		this.number = number;
		this.title = title;
		this.contents = contents;
		this.writer = writer;
		this.date = date;
		this.count = count;
	}
	
	public void view() {
		
	}
	
	public void write() {
		
	}
	
	
}
