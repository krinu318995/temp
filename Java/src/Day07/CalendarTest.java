package Day07;

import java.util.Calendar;
import java.util.Scanner;

public class CalendarTest {
	public static void main(String[] args) {
		calendarTest();
	}

	public static void calendarTest() {

		Scanner scanner = new Scanner(System.in);

		Calendar calendar = Calendar.getInstance();

		System.out.println("연도 입력");
		int year = scanner.nextInt();
		System.out.println("월 입력");
		int month = scanner.nextInt();
		int day = calendar.get(calendar.DAY_OF_MONTH);

		calendar.set(year, month-1, 1);

		int startDay = calendar.get(calendar.DAY_OF_WEEK);// 시작 요일
		int endDay = calendar.getActualMaximum(calendar.DAY_OF_MONTH);// 마지막 요일

		System.out.println("======================" + year + "년" + month + "월 =====================");
		System.out.println(" 일\t월\t화\t수\t목\t금\t토");

		int sDay = startDay;

		for (int i = 1; i < startDay; i++) {
			System.out.print(" \t");
		}

		int sday = startDay; // 요일 시작 변수 [ 토요일마다 줄바꿈 ]

		// 5. 각 요일에 날짜 표시
		for (int i = 1; i <= endDay; i++) {

			System.out.print(+i + "\t");

			// 6. 토요일 뒤로 줄바꿈 처리 [ 7의배수마다 ]
			if (sday % 7 == 0)
				System.out.println();
			// 요일이 토요일이면

			sday++; // 요일 증가
		}
	}
}