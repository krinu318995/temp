package ConsoleBoard;

import java.util.ArrayList;
import java.util.Scanner;

public class ConsoleProgram {

	static Scanner scanner = new Scanner(System.in);
	static ArrayList<Member> memberlist = new ArrayList<Member>();

	void programStart() {

		while (true) {
			System.out.println("회원제 커뮤니티");

			System.out.println("1. 회원가입 2. 로그인 3. 아이디 찾기 4. 비밀번호 찾기");

			int ch = scanner.nextInt();
			Member temp = new Member();
			try {
			if (ch == 1) {
				temp.signUp();
					
			}
			if (ch == 2) {
				temp.login();
			}
			if (ch == 3) {
				temp.findId();
			}
			if (ch == 4) {

			}
			else {
				System.out.println("1-4 사이의 숫자만 입력해주세요");
			}
			}
			catch (Exception e) {
			System.out.println("올바른 메뉴를 선택해주세요");
			}

		}

	}
}
