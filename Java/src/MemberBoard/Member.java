package MemberBoard;

import java.util.Scanner;

public class Member {

	private String id;
	private String password;
	private String name;
	private int idIndex;
	int confirm = 0;

	public Member() {
	}

	public Member(String id, String password, String name, int idIndex) {
		super();
		this.id = id;
		this.password = password;
		this.name = name;
		this.idIndex = idIndex;
	}

	public void signUp() {

		Scanner scanner = new Scanner(System.in);
		boolean idCheck = true;
		System.out.println("아이디 ->");
		String id = scanner.next();
		System.out.println("비밀번호->");
		String password = scanner.next();
		System.out.println("이름->");
		String name = scanner.next();

		Member member = new Member(id, password, name, idIndex);

		for (int i = 0; i < MemberBoard.member.length; i++) {

			if (MemberBoard.member[i] != null && MemberBoard.member[i].id.equals(id)) {
				System.err.println("중복된 아이디가 존재합니다.");
				idCheck = false;

				break;
			}
		}
		if (idCheck) {
			for (int i = 0; i < MemberBoard.member.length; i++) {
				if (MemberBoard.member[i] == null) {
					MemberBoard.member[i] = member;
					System.out.println("회원가입 완료");
					break;
				}
			}
		}
	}// end of sign up

	public void login() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("아이디 -> ");
		String id = scanner.next();
		System.out.println("비밀번호 -> ");
		String password = scanner.next();
		boolean loginCheck = true;

		for (int i = 0; i < MemberBoard.member.length; i++) {
			if (MemberBoard.member[i].id.equals(id) && MemberBoard.member[i].password.equals(password)) {
				System.out.println("로그인 성공");
				confirm = 1;
				loginCheck = false;
				break;
			} // end of if

			if (loginCheck) {
				System.err.println("로그인 실패\n비밀번호를 확인해주세요");

				return;
			}
		} // end of for
		return;

	}// end of login

	public String getId() {
		// TODO Auto-generated method stub
		return id;
	}

}
