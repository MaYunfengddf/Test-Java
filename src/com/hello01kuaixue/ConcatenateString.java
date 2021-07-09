package com.hello01kuaixue;

public class ConcatenateString {
	public static void main(String[] args) {
		//String str = "零一"+"快学";
		//str = str+"零一"+"快学";
		//str += "学习编程知识";
		//System.out.println("使用+号连接字符串:"+str);
		//String segment = str+"学习编程知识";
		//System.out.println("变量连接字符串常量"+segment);
		//System.out.println(str+",一起在"+segment);
		//String str = "零一快学"+101;//整形会被强制转换为String
		//System.out.println("连接字符串与整形:"+str);
		//str = "零一快学"+10.01;
		//System.out.println("连接字符串与浮点型"+str);
		//str = "零一快学"+true;
		//System.out.println("连接字符串与布尔型"+str);
		String str = "零一快学";
		//System.out.println("连接字符串和整型的结果为："+str);
		str = str.concat("天天向上");
		System.out.println("将字符串“天天向上”连接到指定字符串末尾结果为："+str);
		str.concat("这不会改变str对象内容");
		System.out.println("str对象内容不会被上面语句更改，为"+str);
		str = str.concat("这会改变str对象内容");
		System.out.println("str对象内容会被上面语句更改，为"+str);
	}
}
