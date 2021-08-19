package Day03;

import java.util.Scanner;

public class Practice02 {
//숫자 4개 오름차순
	public static void main(String[] args) {
		System.out.println("정수 4개 입력");

		Scanner scanner = new Scanner(System.in);

		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		int d = scanner.nextInt();

		int mod = 0;

		if (a > b) {
			mod = b;
			b = a;
			a = mod;

			if (b > c) {
				mod = c;
				c = b;
				b = mod;
			}
			if (c > d) {
				mod = c;
				c = d;
				d = mod;
			}
		} else {
			if (b > c) {
				mod = c;
				c = b;
				b = mod;
			}
			if (c > d) {
				mod = c;
				c = d;
				d = mod;
			}
		}

		if (a > b) {
			mod = b;
			b = a;
			a = mod;

			if (b > c) {
				mod = c;
				c = b;
				b = mod;
			}
			if (c > d) {
				mod = c;
				c = d;
				d = mod;
			}
		} else {
			if (b > c) {
				mod = c;
				c = b;
				b = mod;
			}
			if (c > d) {
				mod = c;
				c = d;
				d = mod;
			}
		}
		if (a > b) {
			mod = b;
			b = a;
			a = mod;

			if (b > c) {
				mod = c;
				c = b;
				b = mod;
			}
			if (c > d) {
				mod = c;
				c = d;
				d = mod;
			}
		}

		if (a > b) {
			mod = b;
			b = a;
			a = mod;

			if (b > c) {
				mod = c;
				c = b;
				b = mod;
			}
			if (c > d) {
				mod = c;
				c = d;
				d = mod;
			}
		}

		System.out.println(a + ", " + b + ", " + c + ", " + d);
	}
}
