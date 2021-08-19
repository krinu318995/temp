package Board;

import java.util.Scanner;

public class Main {
	public static Member[] members = new Member[100];// 회원 정보 저장 배열s

	public static Board[] boards = new Board[100];
	static Member loginUser = null;

	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		Member member = new Member();
		Board board = new Board();
		while (true) {
			System.out.println("1. 회원가입 2. 로그인 3.종료");
			int menu = scanner.nextInt();
			if (menu == 1) {
				member.signUp();

			} // end of signUp
			if (menu == 2) {
				member.login();
				if (loginUser != null) {

					System.out.println("1. 글 작성  2. 글 보기  3. 로그아웃  4. 종료");
					board.list();
					int select = scanner.nextInt();
					if (select == 1) {
						board.write();
					}
					if (select == 2) {
						board.detail();
						
					}
					if (select == 3) {
						member.logout();
					}
					if (select == 4) {
						break;
					}

				}

			} // end of login

			if (menu == 3) {
				break;
			}

		}
	}
}
