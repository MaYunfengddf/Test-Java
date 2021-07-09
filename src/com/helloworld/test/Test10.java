package com.helloworld.test;
import com.helloworld.test.Test10;

public class Test10 {
	public static void main(String[] args) {
		int num = 0;
		Test10 test = new Test10();
		int a = test.number(num);
		System.out.println(a+"kkkj");
		int nu = 0;
		int n = nu;
		int x = test.number(nu,n);
		System.out.println(x+"jjjk");
	}
	public int number(int num) {
		int x = num;
		for(int i = 0;i < 10;i++) {
			x = x + i;
		}
		return x;
	}
	public int number(int nu,int n) {
		return number(nu);
		
	}
}
