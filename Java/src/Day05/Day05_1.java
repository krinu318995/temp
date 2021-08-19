package Day05;

import java.util.Scanner;

public class Day05_1 {

	public static void main(String[] args) {

		System.out.println("줄 수 입력");
		Scanner scanner = new Scanner(System.in);

		int layer = scanner.nextInt();

		for (int i = 1; i <= layer; i++) {
			// 별
			for (int star = 1; star <= i - 1; star++) {
				System.out.print("*");
			}
			for (int b = 1; b <= layer * 2 - (i * 2 - 1); b++) {
				System.out.print(" ");
			}
			System.out.println();
		}

	}
}
