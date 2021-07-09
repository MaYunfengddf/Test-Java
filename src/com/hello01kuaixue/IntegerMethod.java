package com.hello01kuaixue;

public class IntegerMethod {
	public static void main(String[] args) {
		
		String str = new Integer(10).toString();
		
		Integer i1 = Integer.parseInt(str);
		Integer i2 = Integer.valueOf("1");
		
		int compareResult = Integer.compare(i1, i2);
		
		System.out.println("String对象" + str);
		System.out.println("返回10的Integer对象" + i1);
		System.out.println("返回1的Integer对象" + i2);
		System.out.println("i1和i2比较的结果" + compareResult);
	}
}
