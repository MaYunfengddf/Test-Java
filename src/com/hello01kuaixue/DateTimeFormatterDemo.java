package com.hello01kuaixue;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class DateTimeFormatterDemo {
	
	public static void main(String[] args) {
		
		DateTimeFormatter formatter=  DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		
		LocalDateTime time = LocalDateTime.parse("2018-07-25 10:00:00",formatter);
		
		System.out.println(formatter.format(time));
		
		Date date = new Date();
		System.out.println(date.getTime());
		System.out.println(date.getTime()  - 1000);
		System.out.println(Long.MAX_VALUE);
		
		Date date1 = new Date(Long.MAX_VALUE);
		System.out.println("最大时间"+date1.toString());
		System.out.println("当前时间"+date.toString());
		
		
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.getTime());
		cal.set(2021,11-1,30);
		System.out.println(cal.getTime());
	}
}
