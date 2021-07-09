package com.hello01kuaixue;

public class ConstructString {
	public static void main(String[] args) {
		String str = new String();//创建了一个空字符串对象
		System.out.println("创建一个空字符串对象:"+str);
		str = new String("零一快学");
		System.out.println("使用构造方法创建字符串对象："+str);
		str = String.valueOf( 4525262.13153556);
		System.out.println("将整形数值1转化为字符串："+str);
		str = String.valueOf(Boolean.FALSE);
		System.out.println("将布尔数值true转化为字符串："+str);
	}
}
