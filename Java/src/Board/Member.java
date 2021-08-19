package Board;

import java.util.Scanner;

public class Member {

	private String id;
	private String name;
	private String password;

	public String getId() {
		return id;
	}

	Scanner scanner = new Scanner(System.in);

	public Member() {
		// TODO Auto-generated constructor stub
	}

	// 모든 필드를 받는 생성자
	public Member(String id, String name, String password) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
	}

	public void signUp() {

		System.out.println("아이디");
		String id = scanner.next();
		for (int i = 0; i < Main.members.length; i++) {
			if (Main.members[i] != null && Main.members[i].id.equals(id)) {

				System.out.println("이미 존재하는 아이디 입니다.");
				i--;
				return;
			}
		}
		System.out.println("비밀번호");
		String password = scanner.next();
		System.out.println("이름");
		String name = scanner.next();
		Member member = new Member(id, name, password);
		for (int i = 0; i < Main.members.length; i++) {
			if (Main.members[i] == null) {
				Main.members[i] = member;
				System.out.println("회원가입 완료");
				break;
			}
		}

	}// end of signUp

	public void login() {
		System.out.println("아이디");
		String id = scanner.next();
		System.out.println("비밀번호");
		String password = scanner.next();

		for (int i = 0; i < Main.members.length; i++) {
			if (Main.members[i].id.equals(id) && Main.members[i].password.equals(password)) {
				System.out.println("로그인 성공");

				Main.loginUser = Main.members[i];
				System.out.println(Main.loginUser.id);// 로그인 유저 객체 저장

				break;

			} else {
				System.out.println("비밀번호를 확인해주세요");
				return;

			}
		}
		return;
	}// end of login

	public void logout() {
		System.out.println("로그아웃 하시겠습니까?");
		System.out.println("y/n");
		String select = scanner.next();

		if (select == "y") {

			Main.loginUser = null;
			System.out.println("로그아웃 되었습니다.");
		}
		if (select == "n") {
			return;
		}
	}

}
