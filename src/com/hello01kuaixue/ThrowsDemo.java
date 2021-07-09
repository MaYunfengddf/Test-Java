package com.hello01kuaixue;

public class ThrowsDemo {
	public static void main(String[] args) {
		try {
			num();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void test() throws Exception{
		throw new IllegalArgumentException("方法内抛出异常");
	}
	public static void num() {
		try {
			test();
		}catch(Exception q) {
			q.printStackTrace();
		}
	}
}
