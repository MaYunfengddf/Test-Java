package com.hello01kuaixue;

public class CaptureString {
	public static String captureString(String str) {
		char[] cs = str.toCharArray();
		cs[0] -= 32;
		return String.valueOf(cs);
	}
	public static void main(String[] args) {
		String str = "java工程师";
		str = captureString(str);
		System.out.println("将首字母大写，结果为：" + str);
	}
}
