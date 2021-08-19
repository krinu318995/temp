package Day10;

import java.util.Scanner;

public class Account {

	private String accountNumber;
	private int accountPassword;
	private int credit;

	public Account() {
		// 기본 생성자
	}

	public Account(String accountNumber, int accountPassword, int credit) {
		this.accountNumber = accountNumber;
		this.accountPassword = accountPassword;
		this.credit = credit;
	}

	// -----------------------getter, setter----------------------------------
	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public int getAccountPassword() {
		return accountPassword;
	}

	public void setAccountPassword(int accountPassword) {
		this.accountPassword = accountPassword;
	}

	public int getCredit() {
		return credit;
	}

	public void setCredit(int credit) {
		this.credit = credit;
	}

	// --------------------------------------------------------------------------
	public void createAccount() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("계좌번호 -> ");
		String accountNumber = scanner.next();
		System.out.println("계좌 비밀번호->");
		int accountPassword = scanner.nextInt();
		System.out.println("초기 예금액->");
		int money = scanner.nextInt();

		// Account 객체 생성
		Account account = new Account(accountNumber, accountPassword, money);

		for (int i = 0; i < Day10_1.accounts.length; i++) {
			if (Day10_1.accounts[i] == null) {
				Day10_1.accounts[i] = account;
				System.out.println("계좌 생성 완료");
				return;

			}
		}
		System.out.println("계좌 생성 불가, 관리자에게 문의 바랍니다.");

	}// end of create

	// 계좌 조회
	public int findAccount(String accountNumber) {
		for (int i = 0; i < Day10_1.accounts.length; i++) {
			// 계좌번호가 존재할 경우
			if (Day10_1.accounts[i] != null && Day10_1.accounts[i].accountNumber.equals(accountNumber)) {
				return i;
			}
		}
		System.out.println("입력한 계좌번호가 존재하지 않습니다.");
		return -1;
	}

	// 입금
	public void deposit() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("계좌번호->");
		String accountNumber = scanner.next();
		System.out.println("예금액->");
		int money = scanner.nextInt();

		int result = findAccount(accountNumber);
		if (result == -1) {
			return;
		}
		Day10_1.accounts[result].credit += money;
		System.out.println("입금 완료");
		System.out.println(Day10_1.accounts[result].credit);
	}

	// 출금
	public void withdraw() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("계좌번호->");
		String accountNumber = scanner.next();
		System.out.println("출금할 금액 ->");
		int money = scanner.nextInt();

		int result = findAccount(accountNumber);
		if (result == -1) {
			System.out.println("계좌번호를 확인해주세요");
			return;
		} // 계좌번호가 일치하지 않을 경우 밖으로

		if (Day10_1.accounts[result].credit < money) {
			System.out.println("잔액이 부족합니다.");
			return;
		}

		Day10_1.accounts[result].credit -= money;
		System.out.println("출금 완료");
		System.out.println("출금 후 잔액 -> " + Day10_1.accounts[result].credit);

	}
}
