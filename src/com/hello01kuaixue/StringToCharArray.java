package com.hello01kuaixue;

public class StringToCharArray {
	public static void main(String[] args) {
		String str = "零壹快学";
		char[] strChars = str.toCharArray();
		System.out.println("将字符串转换为字符数组：");
		for(char c : strChars) {
			System.out.println(c);
		}
	}
}
