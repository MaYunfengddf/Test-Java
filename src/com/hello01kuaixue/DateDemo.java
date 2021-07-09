package com.hello01kuaixue;

import java.util.Date;

public class DateDemo {
	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date.toString());
		System.out.println(date.getTime());
		
		Date date1 = new Date(date.getTime() - 1000);
		System.out.println(date.toString() +"是否在" + date1.toString() + "之前" + date.before(date1));
	}
}
