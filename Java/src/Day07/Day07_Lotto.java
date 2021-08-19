package Day07;

import java.util.Random;
import java.util.Scanner;

public class Day07_Lotto {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		// 로또 판별기

		int lotto[] = new int[6];
		int winning[] = new int[6];

		Random random = new Random();

		System.out.println("게임 횟수");
		int game = scanner.nextInt();

		for (int g = 1; g <= game; g++) {

			System.out.println(g + "번째 게임");
			for (int i = 0; i < lotto.length; i++) {// 로또

				System.out.println("1-45 중 6개");
				int userNumber = scanner.nextInt();

				boolean duplicateCheck = true;

				if (userNumber >= 1 && userNumber <= 45) {

					for (int temp : lotto) {
						if (temp == userNumber) {
							System.out.println("중복 선택은 불가능합니다.");
							duplicateCheck = false;
							i--;
							break;
						}
					}
					if (duplicateCheck) {
						lotto[i] = userNumber;
					}
				} else {
					System.out.println("올바른 번호를 입력하세요");
					i--;
				}

			} // end of lotto

			for (int result : lotto) {
				System.out.print(result + " ");
			}
			// 선택한 로또 번호 출력

			// 당첨번호 랜덤 생성
			System.out.println("\n당첨번호");
			for (int i = 0; i < winning.length; i++) {

				int winningNumber = random.nextInt(45) + 1; // 1-45
				boolean duplicateCheck = true;

				for (int temp : winning) {
					if (temp == winningNumber) {
						i--;
						duplicateCheck = false;
						break;
					}

				}
				if (duplicateCheck) {
					winning[i] = winningNumber;
				}

			}

			for (int result : winning) {
				System.out.print(result + " ");
			}

			int count = 0;
			for (int i = 0; i < lotto.length; i++) {
				if (lotto.equals(winning)) {
					count++;

				}
			}
			System.out.println("당첨 개수 : " + count);
		}
	}

}
