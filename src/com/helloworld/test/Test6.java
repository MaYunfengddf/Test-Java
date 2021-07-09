package com.helloworld.test;

public class Test6 {
	public static void main(String[] args) {
		//byte 
		int x = Byte.MAX_VALUE + 1;
		int y = Byte.MIN_VALUE - 1;
		byte x1 = (byte)x;
		byte y1 = (byte)y;
		System.out.println(" byte最大值 +1等于:" + x1);
		System.out.println("    byte最大值等于:" + Byte.MAX_VALUE);
		System.out.println("byte最小值 - 1等于:" +y1);
		System.out.println("    byte最小值等于:" + Byte.MIN_VALUE);
		//short
		int a = (Short.MAX_VALUE + 1);
		int b = (Short.MIN_VALUE - 1);
		short a1 = (short)a;
		short b1 = (short)b;
		System.out.println("short最大值+1等于:" + a1);
		System.out.println("  short最大值等于:" + Short.MAX_VALUE);
		System.out.println("short最小值-1等于:" + b1);
		System.out.println("  short最小值等于:" + Short.MIN_VALUE);
		//int
		System.out.println("int最大值+1等于:" + (Integer.MAX_VALUE + 1));
		System.out.println("  int最大值等于:" + Integer.MAX_VALUE);
		System.out.println("int最小值-1等于:" + (Integer.MIN_VALUE - 1));
		System.out.println("  int最小值等于:" + Integer.MIN_VALUE);
		//long
		System.out.println("long最大值 + 1等于:" + (Long.MAX_VALUE + 1L));
		System.out.println("    long最大值等于:" + Long.MAX_VALUE);
		System.out.println("long最小值 - 1等于:" + (Long.MIN_VALUE - 1L));
		System.out.println("        long最小值:" + Long.MIN_VALUE);
		//char
		char c = 79;
		char r = '2'+'2';
		System.out.println(c);
		System.out.println((int)r);
		System.out.println(c== r);
	}
	/*
	 * byte最大值127 即2^7-1
	 * 二进制为0111 1111
	 * 加1
	 * 0111 1111 + 0000 0001
	 * =1000 0000
	 * 即(-2)^7
	 * 
	 * 
	 * 最小值-128 即(-2)^7
	 * 二进制为 1000 0000
	 * 减1
	 * 1000 0000 + 1000 0001
	 * 1000 0000 + 1111 1111
	 * 0111 1111
	 * 即127
	 */
}
