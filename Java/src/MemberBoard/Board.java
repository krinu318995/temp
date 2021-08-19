package MemberBoard;

import java.util.Scanner;

public class Board extends Member{
	int number;
	String title;
	String content;
	String writer;

	public Board() {
	}

	public Board(int number, String title, String content, String writer) {

		super();
		this.number = number;
		this.title = title;
		this.content = content;
		this.writer = writer;
	}
	
	

	public void write() {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("제목->");
		String title = scanner.nextLine();
		System.out.println("내용->");
		String content = scanner.nextLine();
		int number = -1;
		//number
		for (int i = 0; i < MemberBoard.boards.length; i++) {

			if (MemberBoard.boards[i] == null) {
				if (i == 0) {
					number = 1;
					break;

				} else {
					number = MemberBoard.boards[i - 1].number + 1;
					break;

				}
			}
		} // end of for

		Board board = new Board(number, title, content, writer);
		for (int i = 0; i < MemberBoard.boards.length; i++) {
			if (MemberBoard.boards[i] == null) {
				
				MemberBoard.boards[i] = board;
				board.writer  = MemberBoard.member[i].getId();
				break;
			}
		}
		System.out.println("작성 완료");

	}// end of write

	public void list() {
		System.out.println("게시물 목록");
		System.out.println("번호\t제목\t내용\t작성자");
		for (int i = 0; i < MemberBoard.boards.length; i++) {
			if (MemberBoard.boards[i] == null) {
				return;
			}

			System.out.print(MemberBoard.boards[i].number + "\t");
			System.out.print(MemberBoard.boards[i].title + "\t");
			System.out.print(MemberBoard.boards[i].content + "\t");
			System.out.print(MemberBoard.boards[i].writer + "\n");
			System.out.println();
		}
	}

	public void read() {

		Scanner scanner = new Scanner(System.in);
		System.out.println("게시물 번호 ->");

		int number = scanner.nextInt();

		for (int i = 0; i < MemberBoard.boards.length; i++) {
			if (number == MemberBoard.boards[i].number) {
				System.out.println("번호\t|\t" + MemberBoard.boards[i].number);
				System.out.println("-----------------------------------------------------------");
				System.out.println("제목\t|\t" + MemberBoard.boards[i].title);
				System.out.println("-----------------------------------------------------------");
				System.out.println("작성자\t|\t" + MemberBoard.boards[i].writer);
				System.out.println("-----------------------------------------------------------");
				System.out.println("내용\t|\t" + MemberBoard.boards[i].content);
			} else {
				System.out.println("검색한 번호의 게시물이 존재하지 않습니다.");
			}
			break;
		}
	}

	public void delete(String id) {

		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < MemberBoard.boards.length; i++) {
			if (MemberBoard.boards[i].writer == MemberBoard.member[i].getId()) {
				MemberBoard.boards[i]=null;
				System.out.println("삭제됐습니다.");
				break;
				
			}else {
				System.out.println("삭제불가능");
			}
		}
	}
}
