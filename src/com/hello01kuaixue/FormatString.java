package com.hello01kuaixue;

public class FormatString {
	public static void main(String[] args) {
		int i = 10;
		String str = "零壹快学";
		System.out.println(String.format("整型转化：%d",i));
		System.out.println(String.format("字符串转换:%s+%d",str,i));
	}
}