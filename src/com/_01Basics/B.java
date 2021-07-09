package com._01Basics;

import java.util.Calendar;
import java.util.Date;

public class B extends A {
	static {
		System.out.println("子类静态代码块");
	}
	public B(){
		System.out.println("子类构造函数");
	}
	
	public static void main(String[] args) {
		System.out.println("子类main方法");
		Date d = new Date();
		System.out.println(d.getTime());
		Calendar c = Calendar.getInstance();
		System.out.println(c.getTime());
	} 
	{
		System.out.println("非子类静态方法");
	}
}
