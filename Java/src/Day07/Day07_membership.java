package Day07;

import java.util.Scanner;

public class Day07_membership {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String[][] memberList = new String[100][2];

		while (true) {
			System.out.println("회원제 프로그램");
			System.out.println("1. 회원가입 2.로그인 3.종료");

			int control = scanner.nextInt();

			// 회원가입
			if (control == 1) {
				System.out.println("회원가입 페이지");
				System.out.println("아이디");
				String id = scanner.next();
				System.out.println("비밀번호");
				String password = scanner.next();

				boolean check = true;
				for (int i = 0; i < memberList.length; i++) {
					if (memberList[i][0] != null && memberList[i][0].equals(id)) {
						System.out.println("이미 존재하는 아이디 입니다.");
						check = false;
						break;
					}

				} // end of for....아이디 중복검사

				// 회원가입 처리
				if (check) {
					for (int i = 0; i < memberList.length; i++) {
						memberList[i][0] = id;
						memberList[i][1] = password;
						System.out.println("회원가입이 완료됐습니다.");
						break;
					}
				}
			}

			// 로그인
			else if (control == 2) {
				System.out.println("로그인 페이지");
				System.out.println("아이디->");
				String id = scanner.next();

				System.out.println("비밀번호->");
				String password = scanner.next();

				boolean loginCheck = true;

				for (int i = 0; i < memberList.length; i++) {
					if (memberList[i][0] != null && memberList[i][0].equals(id) && memberList[i][1] != null
							&& memberList[i][1].equals(password)) {
						System.out.println(id + "로그인 성공");
						System.out.println("회원 메뉴");
						System.out.println("1. 회원 탈퇴 2.비밀번호 변경 3.로그아웃 4.글쓰기 5.글목록");

						int ch = scanner.nextInt();

						// 회원탈퇴
						if (ch == 1) {
							// 로그인 상태의 회원 정보 지우기
							memberList[i][0] = null;
							memberList[i][1] = null;
							// 탈퇴한 회원의 인덱스 뒤의 데이터 한칸씩 앞으로 이동
							for (int j = i; j < memberList.length; j++) {
								if (memberList[j + 1][0] != null) {// 탈퇴한 회원의 인덱스가 마지막 인덱스가 아닐 경우
									memberList[j][0] = memberList[j + 1][0];// 현재 인덱스에 다음 인덱스 데이터 옮김
									memberList[j][1] = memberList[j + 1][1];

								} else {// 탈퇴한 회원의 인덱스 뒤로 데이터가 없는 경우
									memberList[j][0] = null;
									memberList[j][1] = null;// null값으로 변경만
									break;
								}
							}
							System.out.println("회원탈퇴 되었습니다.");
							break;
						}

						// 비밀번호 변경
						else if (ch == 2) {
							for (int j = 0; j < memberList.length; j++) {
								System.out.println("비밀번호 입력");
								String newPassword = scanner.next();
								memberList[j][1] = newPassword;
								System.out.println("비밀번호 변경 완료");
								break;
							}
						}

						// 로그아웃
						else if (ch == 3) {
							break;
						}

						// 글쓰기
						else if (ch == 4) {

						}

						// 글목록
						else if (ch == 5) {

						}
					}
				} // end of for
			}

			if (control == 3) {
				System.out.println("종료합니다.");
				break;

			}

		}

	}
}
