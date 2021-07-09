package com.hello01kuaixue;

public class VariableMethod {
	//固定参数被优先调用
	public static void test(int number,String...args) {
		System.out.println("2");
	}
	public static void test(int number,String arg) {
	System.out.println("1");
	}
	public static void main(String[] args) {
		test(1,"2");
		test(3,"4","3");
	}
}
