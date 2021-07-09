package com.helloworld.test;

public class Test5 {
	public static void main(String[] args) {
		byte a,b;//a为byte最大值 b为最小值
				//2^7
		a = (2 * 2 * 2 * 2 * 2 * 2 * 2) - 1;
				//(-2)^7
		b = (-2) * (-2) * (-2) * (-2) * (-2) * (-2) * (-2);
		
		if(a == Byte.MAX_VALUE  + 1 ) {
			System.out.println("byte类型最大相同2^7");
		}else {
			System.out.println("a不等于Byte.MAX_VALUE + 1");
		}
		if(b == Byte.MIN_VALUE + 1) {
			System.out.println("byte类型最小值相同(-2)^7");
		}else {
			System.out.println("b不等于Byte.MIN_VALUE + 1");
		}
		
		short c,d;//c为short最大值,b为short最小值
				//2^15
		c = (2 * 2 * 2 * 2 * 2 * 2 * 2 * 2 * 2 * 2 * 2 * 2 * 2 * 2 * 2) - 1;
				//(-2)^15
		d = (-2) * (-2) * (-2) * (-2) * (-2) * (-2) * (-2) * (-2) * (-2) * (-2) * (-2) * (-2) * (-2) * (-2) * (-2);
		if(c == Short.MAX_VALUE) {
			System.out.println("short最大值相同 2^15");
		}
		if(d == Short.MIN_VALUE) {
			System.out.println("short最小值相同(-2)^15");
		}
		
		int e,f;//e为int最大值 f为int最小值
				//2^31
		e = (2 * 2 * 2 * 2 * 2 * 2 * 2 * 2 * 2 * 2 * 2 * 2 * 2 * 2 * 2 * 2 * 2 * 2 * 2 * 2 * 2 * 2 * 2 * 2 * 2 * 2 * 2 * 2 * 2 * 2 * 2) - 1;
				//(-2)^31
		f = (-2) * (-2) * (-2) * (-2) * (-2) * (-2) * (-2) * (-2) * (-2) * (-2) * (-2) * (-2) * (-2) * (-2) * (-2) * (-2) * (-2) * (-2) * (-2) * (-2) * (-2) * (-2) * (-2) * (-2) * (-2) * (-2) * (-2) * (-2) * (-2) * (-2) * (-2);
		if(e == Integer.MAX_VALUE) {
			System.out.println("int最大值相同 2^31");
		}
		if(f == Integer.MIN_VALUE) {
			System.out.println("int最小值相同 (-2)^31");
		}
		
		long g,h;//g为long最大值,h为long最小值
				//2L^63
		g = (2L * 2L * 2L * 2L * 2L * 2L * 2L * 2L * 2L * 2L * 2L * 2L * 2L * 2L * 2L * 2L * 2L * 2L * 2L * 2L * 2L * 2L * 2L * 2L * 2L * 2L * 2L * 2L * 2L * 2L * 2L * 2L * 2L * 2L * 2L * 2L * 2L * 2L * 2L * 2L * 2L * 2L * 2L * 2L * 2L * 2L * 2L * 2L * 2L * 2L * 2L * 2L * 2L * 2L * 2L * 2L * 2L * 2L * 2L * 2L * 2L * 2L * 2L) - 1L;
				//(-2L)^63
		h = (-2L) * (-2L) * (-2L) * (-2L) * (-2L) * (-2L) * (-2L) * (-2L) * (-2L) * (-2L) * (-2L) * (-2L) * (-2L) * (-2L) * (-2L) * (-2L) * (-2L) * (-2L) * (-2L) * (-2L) * (-2L) * (-2L) * (-2L) * (-2L) * (-2L) * (-2L) * (-2L) * (-2L) * (-2L) * (-2L) * (-2L) * (-2L) * (-2L) * (-2L) * (-2L) * (-2L) * (-2L) * (-2L) * (-2L) * (-2L) * (-2L) * (-2L) * (-2L) * (-2L) * (-2L) * (-2L) * (-2L) * (-2L) * (-2L) * (-2L) * (-2L) * (-2L) * (-2L) * (-2L) * (-2L) * (-2L) * (-2L) * (-2L) * (-2L) * (-2L) * (-2L) * (-2L) * (-2L);
		if(g == Long.MAX_VALUE) {
			System.out.println("long最大值相同 2^63");
		}
		if(h == Long.MIN_VALUE) {
			System.out.println("long最小值相同 (-2)^63");
		}
		//i最大值  j最小值
			System.out.println("float最大值相同 " +(Float.MAX_VALUE+1));
			System.out.println("float最小值相同"+(Float.MIN_NORMAL +1));
		
	}
}
