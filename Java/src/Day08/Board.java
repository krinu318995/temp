package Day08;

import java.util.Scanner;

public class Board {

	int no;// 게시물 번호
	String title;// 제목
	String wrtier;// 작성자
	String contents;// 내용
	String date;// 직성일
	int count;// 조회수

	public Board() {
		// 기본 생성자
	}

	public Board(int no, String title, String wrtier, String contents, String date, int count) {
		super();
		this.no = no;
		this.title = title;
		this.wrtier = wrtier;
		this.contents = contents;
		this.date = date;
		this.count = count;
	}

	// 게시물 작성 메서드
	public void write() {

		Scanner scanner = new Scanner(System.in);

		System.out.println("게시물 작성 페이지");
		System.out.println("글 제목");
		String title = scanner.nextLine();
		System.out.println("작성자");
		String writer = scanner.next();
		System.out.println("내용");
		String content = scanner.nextLine();

		int board_number = -1;

	}

}
