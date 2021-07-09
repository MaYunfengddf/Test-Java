package com.hello01kuaixue;

import java.text.DateFormat;
import java.util.Date;

public class DateFormatDamo {
	public static void main(String[] args) {
		Date now = new Date();
		DateFormat dateFormat = DateFormat.getDateInstance();
		System.out.println(dateFormat.format(now));
		
		dateFormat = DateFormat.getDateInstance(DateFormat.MEDIUM);
		System.out.println(dateFormat.format(now));
		
		
		dateFormat = DateFormat.getDateInstance(DateFormat.LONG);
		System.out.println(dateFormat.format(now));
		
		dateFormat = DateFormat.getDateInstance(DateFormat.SHORT);
		System.out.println(dateFormat.format(now));
		
		dateFormat = DateFormat.getDateInstance(DateFormat.FULL);
		System.out.println(dateFormat.format(now));
		
		try {
			Date date = dateFormat.parse("2021年4月23日星期五");
			System.out.println(date.toString());
		}catch (Exception e){
			e.printStackTrace();
		}
		
		
		try {
			Date date = new Date();
			System.out.println(dateFormat.format(date));
		}catch (Exception e){
			e.printStackTrace();
		}
	}
}
