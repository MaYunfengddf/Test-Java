package com._01Basics;

public class A {
	static{
		System.out.println("父类静态代码块");
	}
	
	public A() {
		System.out.println("父类构造函数");
	}
	public static void main(String[] args) {
		System.out.println("父类main方法");
	}
	{
		System.out.println("非父类静态方法");
	}
}
