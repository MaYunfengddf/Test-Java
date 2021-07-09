package com.hello01kuaixue;

public class UpperCaseString {
	public static void main(String [] args) {
		String str = "java工程师";
		str = str.substring(0,1).toUpperCase() + str.substring(1,str.length());
		System.out.println("将首字母大写，结果为:"+ str);
	}
}