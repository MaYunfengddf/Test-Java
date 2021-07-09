package com.hello01kuaixue;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class UnixTimeFormat {
	public static void main(String[] args) {
		long time = System.currentTimeMillis();
		String nowUnixTimeStamp = String.valueOf(time/1000);
		System.out.println("当前操作系统时间戳为:" + nowUnixTimeStamp);
		
		String formats = "yyyy-MM-dd hh:mm:ss";
		String date = new SimpleDateFormat(formats,Locale.CHINA).format(new Date(time));
		System.out.println("当前操作系统时间戳为:" + date);
	}
}
