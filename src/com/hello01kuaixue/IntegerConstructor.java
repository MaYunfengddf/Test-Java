package com.hello01kuaixue;

public class IntegerConstructor {
	public static void main(String[] args) {
		int a = 10;
		Integer i1 = 10;
		Integer i2 = Integer.valueOf(10);
		Integer i3 = Integer.valueOf("10");
		
		System.out.println("以int类型为入参构造Intesger对象:" + i1);
		System.out.println("以String类型为入参构造Intesger对象:" + i2);
	}
}
