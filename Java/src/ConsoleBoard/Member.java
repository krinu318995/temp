package ConsoleBoard;

import java.util.Scanner;

public class Member {

	private int userNumber;
	private String id;
	private String password;
	private String name;
	private String email;
	private int point;

	public static int totalNumber = 0;

	// getter, setter
	public int getUserNumber() {
		return userNumber;
	}

	public void setUserNumber(int userNumber) {
		this.userNumber = userNumber;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	// 생성자

	public Member() {
		// 빈 생성자
	}

	// 모든 필드를 받는 생성자
	public Member(int userNumber, String id, String password, String name, String email, int point) {
		super();
		this.userNumber = userNumber;
		this.id = id;
		this.password = password;
		this.name = name;
		this.email = email;
		this.point = point;
	}

	// method

	// 회원가입
	public void signUp() {

		System.out.println("아이디");
		String id = ConsoleProgram.scanner.next();
		System.out.println("비밀번호");
		String password = ConsoleProgram.scanner.next();
		System.out.println("비밀번호 확인");
		String passwordConfirm = ConsoleProgram.scanner.next();
		System.out.println("이메일");
		String email = ConsoleProgram.scanner.next();
		System.out.println("이름");
		String name = ConsoleProgram.scanner.next();

		// 유효성 검사
		for (Member member : ConsoleProgram.memberlist) {
			if (member.id.equals(id)) {
				System.out.println("이미 사용중인 아이디 입니다.");
				return;
			}
		}
		// 아이디 제약조건
		if (id.length() < 3 || id.length() > 12) {
			System.out.println("아이디 길이는 5-10로 생성해주세요");
			return;
		}
		// 비밀번호 제약조건
		if (password.length() < 8 || password.length() > 15) {
			System.out.println("비밀번호는 반드시 8-15글자로 생성해주세요");
			return;
		}
		if (password.contains("!") || password.contains("#") || password.contains("@") || password.contains("$")) {
			System.out.println("비밀번호는 특수문자를 반드시 포함해야 합니다.");
			System.out.println("특수문자는 ‘!, @, #, $’만 사용 가능합니다.");
		}

		// 비밀번호 확인
		if (password.equals(passwordConfirm)) {
			System.out.println("비밀번호를 확인해주세요");
			return;
		}
		// 이메일
		if (!email.contains("@")) {
			System.out.println("이메일 형식에 맞지 않습니다.");
			return;
		}

		// 파일처리

	}

	// 로그인
	public Member login() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("아이디");
		String id = scanner.next();
		String password = scanner.next();

		for (Member member : ConsoleProgram.memberlist) {
			if (member.id.equals(id) && member.password.equals(password)) {
				System.out.println("안녕하세요 " + id + "님");
				return member;
			}
		} // end of for
			// for문이 끝나도 찾을 수 없으면 입력한 정보가 틀린것임
		System.out.println("일치하는 회원 정보가 존재하지 않습니다");
		return null;
	}

	// 아이디 찾기
	public void findId() {
		System.out.println("이름");
		String name = scanner();
		System.out.println("이메일");
		String email = scanner();

		for (Member member : ConsoleProgram.memberlist) {
			if (member.name.equals(name) || member.email.equals(email)) {
				System.out.println("회원님의 아이디는 " + member.id + "입니다");
			}
		}
		System.out.println("일치하는 회원 정보가 존재하지 않습니다");

	}

	// 비밀번호 찾기
	public void findPassword() {

	}

	public String scanner() {
		Scanner scanner = new Scanner(System.in);
		return scanner.next();
	}

}
