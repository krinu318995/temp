package Board;

import java.util.Scanner;

public class Board {
	private int number = -1;
	private String writer;
	private String title;
	private String content;

	Scanner scanner = new Scanner(System.in);

	public Board() {
		// TODO Auto-generated constructor stub
	}

	public Board(int number, String writer, String title, String content) {
		super();
		this.number = number;
		this.writer = writer;
		this.title = title;
		this.content = content;
	}

	public void write() {
		System.out.println("제목");
		String title = scanner.nextLine();
		System.out.println("내용");
		String content = scanner.nextLine();
		String writer = Main.loginUser.getId();
		int number = setBoardIndex();
		Board board = new Board(number, writer, title, content);
		for (int i = 0; i < Main.boards.length; i++) {
			if (Main.boards[i] == null) {
				Main.boards[i] = board;
				break;
			}
		}
	}// end of write

	public int setBoardIndex() {
		int number = 0;
		for (int i = 0; i < Main.boards.length; i++) {
			if (Main.boards[i] == null) {
				if (i == 0) {
					number = 1;
					break;
				} else {
					number = Main.boards[i - 1].number + 1;
					break;
				}
			}
		}
		return number;
	}

	public void list() {
		System.out.println("no\t제목\t작성자");
		for (int i = 0; i < Main.boards.length; i++) {

			if (Main.boards[i] != null) {
				System.out.print(Main.boards[i].number + "\t");
				System.out.print(Main.boards[i].title + "\t");
				System.out.print(Main.boards[i].writer + "\n");
			}
		}
	}// end of list

	public void detail() {
		System.out.println("상세보기 할 게시물 번호");
		int no = scanner.nextInt();

		for (int i = 0; i < Main.boards.length; i++) {
			if (Main.boards[i].number == no) {

				System.out.println("번호\t" + Main.boards[i].number);
				System.out.println("제목\t" + Main.boards[i].title);
				System.out.println("작성자\t" + Main.boards[i].writer);
				System.out.println("내용\t" + Main.boards[i].content);
				System.out.println();
				break;
			} else {
				System.out.println("해당 게시물이 존재하지 않습니다.");
				return;

			}
		} // end of for
	}// end of detail

	public void delete() {
		for (int i = 0; i < Main.boards.length; i++) {
			if (Main.boards[i].writer.equals(Main.loginUser.getId())) {
				System.out.println("삭제하시겠습니까?");
				System.out.println("y/n");
				String confirm = scanner.next();

				Main.boards[i] = null;

			} else {
				System.out.println("자신이 작성한 게시물만 삭제 가능합니다.");
			}
			break;
		}
	}

}
