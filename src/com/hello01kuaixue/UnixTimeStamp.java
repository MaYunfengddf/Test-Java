package com.hello01kuaixue;

public class UnixTimeStamp {
	public static void main(String[] args) {
		long time = System.currentTimeMillis();
		String nowUnixTimeStamp = String.valueOf(time/1000);
		System.out.println("当前操作系统时间戳为:" + nowUnixTimeStamp);
	}
}
