package Day01;

import java.util.Scanner;

public class No13 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("정수 3개 입력");

		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();

		if (a > b) {
			if (a > c) {
				System.out.println("max : " + a);
			}
		} else if (b > c) {
			if (b > a) {
				System.out.println("max : " + b);
			}
		} else if (c > a) {
			if (c > b) {
				System.out.println("max : " + c);
			}
		}
	}
}
