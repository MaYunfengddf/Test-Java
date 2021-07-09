package com.hello01kuaixue;

public class StringHashCode {
	public static void main(String [] args) {
		String str = "零壹快学";
		System.out.println(str + "的哈希值为:" + str.hashCode());
		str = "";
		System.out.println("空字符串哈希值为：" + str.hashCode());
	}
}
