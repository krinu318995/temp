package Day07;

import java.util.Calendar;
import java.util.Scanner;

public class CalendarTest2 {
	public static void main(String[] args) {
		calendarTest();
	}

	
	public static void calendarTest() {
		Calendar calendar = Calendar.getInstance();
		System.out.println("dddd");
		Scanner scanner = new Scanner(System.in);
		int year = scanner.nextInt();
		int day[][][] = new int[12][6][7];// 월, 주, 요일
		String[] week = { "일", "월", "화", "수", "목", "금", "토" };
		calendar.set(Calendar.YEAR, year);
		for (int month = 0; month < 12; month++) {

			calendar.set(Calendar.MONTH, month);
		}


	}// end of method
}
