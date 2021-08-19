package Day03;

import java.util.Scanner;

public class Practice01 {
	public static void main(String[] args) {
		System.out.println("중간고사 - 30%, 기말고사 - 30%, 수행평가 - 40% ");
		Scanner sc = new Scanner(System.in);

		System.out.println("중간고사 점수 ->");
		int midterm_exam =sc.nextInt();
		System.out.println("기말고사 점수 ->");
		int final_exam = sc.nextInt();
		System.out.println("수행평가 점수 ->");
		int performance =sc.nextInt();
		
		System.out.println("중간고사 - "+midterm_exam*0.3);
		System.out.println("기말고사 - "+final_exam*0.3);
		System.out.println("수행평가 - "+performance*0.4);
	}
}
