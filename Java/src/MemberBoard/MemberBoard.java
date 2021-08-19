package MemberBoard;

import java.util.Scanner;

public class MemberBoard {

	public static Member[] member = new Member[100];
	public static Board[] boards = new Board[100];

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Member member = new Member();
		Board board = new Board();
		while (true) {
			System.out.println("1.회원가입 2.로그인 3. 종료");
			int menu = scanner.nextInt();

			// 회원가입
			if (menu == 1) {
				member.signUp();

			}

			// 로그인
			if (menu == 2) {

				member.login();

				while (true) {
					board.list();
					System.out.println("1. 글 작성 2. 글 보기 3. 종료");
					System.out.println();

					int select = scanner.nextInt();

					if (select == 1) {

						if (member.confirm == 1) {
							board.write();
						}

					}
					if (select == 2) {
						board.read();
						System.out.println("1. 삭제");
						select = scanner.nextInt();

						if (select == 1) {
							board.delete(null);
						}
					}

				}

			}

			// 종료
			if (menu == 3) {
				System.out.println("종료합니다.");
				break;
			}

		}
	}
}