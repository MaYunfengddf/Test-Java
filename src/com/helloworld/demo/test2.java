package com.helloworld.demo;

public class test2 {
	public static void main(String[] args) {
		String str = "";
		for(int i = 0 ; i <= 127 ; i++) {
			System.out.println("当前i的值为"+i);
			char number = (char)i;
			str = str + number;
			System.out.println(str);
		}
		
	}
}
