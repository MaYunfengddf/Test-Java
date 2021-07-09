package com.hello01kuaixue;

public class ReplaceAllstring {
	public static void main(String[] args) {
		String str = "01dsa0465dsfef4dfgr";
		str = str.replaceAll("[a-zA-Z]+","");
		System.out.println(str);
		String newStr = "9123fegfg零dc456fsdv1vfdv";
		newStr = newStr.replaceAll("[\\da-zA-Z]+","");
		System.out.println(newStr);
	}
}
