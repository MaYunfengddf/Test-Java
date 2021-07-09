package com.hello01kuaixue;

public class StringConverter {
	public static void main(String[] args) {
		String str = String.valueOf("c");
		System.out.println("字符转为字符串"+str);
		str = String.valueOf(223.12);
		System.out.println("double类型转化为字符串:"+str);
		str = String.valueOf(str);
		System.out.println("将对象转换为字符串"+str);
	}
}
