package com.hello01kuaixue;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class SimpleDateFormatDamo {
	public static void main(String[] args) {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		String str = "2018-11-12";
		long time = 0L; 
		try {
			time = format.parse(str).getTime();
		}catch (Exception e){
			e.printStackTrace();
		}
		System.out.println(str + "转化为毫秒" + time);
		format = new SimpleDateFormat("dd/MM/yyyy/ HH:mm:ss");
		System.out.println(time + "毫秒转化为时间" + format.format(time));
	}
}
