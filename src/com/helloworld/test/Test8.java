package com.helloworld.test;

public class Test8 {
	public static void main(String[] args) {
		int num = 5;
		double s = 3.1;
		number(num,s);
		number(s,num,5546);
	}
	public static void number(int num,double s) {
		System.out.println( num + s);
		int x = ~num;
		int c = (int)s;
		int s1 = ~c;
		System.out.println( x +"."+  s1);
	}
	public static void number(double s,int ...num) {
		System.out.println(s-0.5);
		for(int nu:num) {
			Integer a = ~nu;
			System.out.println(a);
			System.out.println(a instanceof Integer);
		}
		
	}
}
