package com.helloworld.test;
import com.helloworld.test.Test13;

public class Test13 {
	public int number(int n) {
		if(n == 1)
			return 1;
		else
			return n + number(n - 1);
	}

	public static void main(String[] args) {
		Test13 test = new Test13();
		int a = test.number(10);
		System.out.println(a);
	}
}
