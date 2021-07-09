package com.hello01kuaixue;

import java.util.Calendar;

public class CalendarDemo {
	public static void main(String[] aegs){
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.toString());

		System.out.println("=========");
		
		
		Calendar cal1 = Calendar.getInstance();
		System.out.println(cal1.getTime());
		cal1.set(2008, 12 - 1 , 31);
		System.out.println(cal1.getTime());
		
		System.out.println("=========");
		
		Calendar cal2 = Calendar.getInstance();
		System.out.println(cal2.getTime());
		System.out.println(cal2.get(Calendar.YEAR));
		System.out.println(cal2.get(Calendar.MONTH) + 1);
		System.out.println(cal2.get(Calendar.DATE));
		System.out.println(cal2.get(Calendar.HOUR_OF_DAY));
		System.out.println(cal2.get(Calendar.MINUTE));
		System.out.println(cal2.get(Calendar.SECOND));
		System.out.println(cal2.get(Calendar.DAY_OF_WEEK));
	}
}
