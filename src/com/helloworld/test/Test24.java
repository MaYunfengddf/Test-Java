package com.helloworld.test;
import java.util.ArrayList;
import java.util.List;

public class Test24 {
	
	public static void main(String[] args) {
		List<String>strList = new ArrayList<>();
		
		for(int i = 0;i <= 10;i ++ ) {
			strList.add("'"+ i +"'" );
			System.out.println(strList.toString());
			
		}
		//查询字符串第0位和最后一位的char
		System.out.println(strList.toString().charAt(0) + "  " + strList.toString().charAt(strList.toString().length() - 1));
		
		String str = strList.toString().replace(strList.toString().charAt(0),'(');//把字符串第一位改为“（”
		System.out.println(str);//输出改变第一位后的字符串
		
		str = str.replace(strList.toString().charAt(strList.toString().length() - 1), ')');//把字符串最后一位改为“）”
		System.out.println(str);//输出
	}
}
