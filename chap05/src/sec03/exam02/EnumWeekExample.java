package sec03.exam02;

import java.util.Calendar;

import java.util.Scanner;

import sec03.exam01.Week;

public class EnumWeekExample {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		//Scanner scanner = Scanner.getInstance(System.in);
		Calendar today = Calendar.getInstance();
		//Calendar today = new Calendar();
		//System.out.println(today);
		
		int year = today.get(Calendar.YEAR); // 년
		int month = today.get(Calendar.MONTH); // 월
		int day = today.get(Calendar.DAY_OF_MONTH); // 일
		int week = today.get(Calendar.DAY_OF_WEEK); // 요일
		int hour = today.get(Calendar.HOUR); // 시
		int minute = today.get(Calendar.MINUTE); // 분
		int second = today.get(Calendar.SECOND); // 초
		int amPm = today.get(Calendar.AM_PM); // 오전 or 오후
		
		String[] weekArray = {"일요일", "월요일", "화요일", "수요일", "목요일", "금요일", "토요일"};
		String strDate = year + "년 ";
		strDate += (month + 1) + "월 ";
		strDate += day + "일 ";
		strDate += weekArray[week - 1] + " ";
		strDate += (amPm == Calendar.AM) ? "오전 " : "오후 ";
		strDate += hour + "시 ";
		strDate += minute + "분 ";
		strDate += second + "초 ";
		System.out.println(strDate);
		
		Week todayWeek = null;
		switch(week) {
			case 1 : todayWeek = Week.SUNDAY;
				break;
			case 2 : todayWeek = Week.MONDAY;
				break;
			case 3 : todayWeek = Week.TUESDAY;
				break;
			case 4 : todayWeek = Week.WEDNESDAY;
				break;
			case 5 : todayWeek = Week.THURSDAY;
				break;
			case 6 : todayWeek = Week.FRIDAY;
				break;
			case 7 : todayWeek = Week.SATURDAY;
				break;
		}
	}

}
