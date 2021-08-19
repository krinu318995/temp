package Day10;

public class Shinhan extends Account {

	public final String bankCode = "101"; // 은행 식별 코드

	public Shinhan() {
		// 기본생성자
	}

	public Shinhan(String accountNumber, int accountPassword, int credit) {
		super(accountNumber, accountPassword, credit);
		// Account 에서 상속받음
	}

	@Override
	public void createAccount() {
		System.out.println("신한은행");
		
		super.createAccount();
	}

	@Override
	public int findAccount(String accountNumber) {
		// TODO Auto-generated method stub
		return super.findAccount(accountNumber);
	}

	@Override
	public void deposit() {
		System.out.println("신한은행");
		super.deposit();
	}

	@Override
	public void withdraw() {
		System.out.println("신한은행");
		super.withdraw();
	}

}
