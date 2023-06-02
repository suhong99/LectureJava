package sample38;

import java.util.Calendar;

public class sample38 {

	public static void main(String[] args) {
		/*
		  		날짜 + 시간
		  		Calendar라는 클래스가 있음
		  		Date
		  		
		  		
		 */
		Calendar cal = Calendar.getInstance();
		
		//오늘 날짜
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH)+1;
		int day = cal.get(Calendar.DATE);
		int hour = cal.get(Calendar.HOUR);
		int minute =cal.get(Calendar.MINUTE);
		
		System.out.println(year+ "/"+month+ "/"+day+ " "+hour+":"+minute);
		
		//날자 셋팅(set)
		cal.set(Calendar.YEAR,2023);
		cal.set(Calendar.MONTH, 7-1);
		cal.set(Calendar.DATE, 14);
		
		year = cal.get(Calendar.YEAR);
		month = cal.get(Calendar.MONTH)+1;
		day = cal.get(Calendar.DATE);
		System.out.println(year+ "/"+two(month+"")+ "/"+two(day+"")+ " "+hour+":"+minute);
		
		//오전/오후
		String ampm= cal.get(Calendar.AM_PM)==0?"오전":"오후";
		System.out.println(ampm);
		
		//요일
		int weekday = cal.get(Calendar.DAY_OF_WEEK); //1(일)~7(토)
		System.out.println(weekday);
		
		int lastday = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println(lastday);
	}
	//utility 함수
	//1 ->01  11->11
	public static String two(String s) {
		return s.length()>1?s : "0" + s;
	}

}
