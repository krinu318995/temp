package Day03;

import java.util.Scanner;

public class Practice03 {
	// 내림차순
	public static void main(String[] args) {// starting point of main

		System.out.println("정수 4개 입력");
		Scanner scanner = new Scanner(System.in);

		int arr[] = new int[4];

		int index;

		int j;

		int swap;

		for (index = 0; index < arr.length; index++) {
			arr[index] = scanner.nextInt();

		}
		System.out.println("arr : ");

		for (index = 0; index < arr.length; index++) {
			System.out.print(arr[index]);
			if (index < arr.length - 1) {
				System.out.print(", ");
			}
		}

		System.out.println("\n오름차순");
		for (index = 0; index < arr.length; index++) {
			for (j = index + 1; j < arr.length; j++) {
				if (arr[index] > arr[j]) {
					swap = arr[index];
					arr[index] = arr[j];
					arr[j] = swap;
				}
			}

			System.out.print(arr[index]);
			if (index < arr.length - 1) {
				System.out.print(", ");
			}
		}

		System.out.println("\n내림차순");

		for (int i = arr.length - 1; i >= 0; i--) {
			for (j = i + 1; j <= i; j--) {
				if (arr[j] < arr[i]) {
					swap = arr[i];
					arr[i] = arr[j];
					arr[j] = swap;
				}
			}
			System.out.print(arr[i]);
			if (i > 0 && i < arr.length) {
				System.out.print(", ");
			}
		}

	}// endpoint of main
}
