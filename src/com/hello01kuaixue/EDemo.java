package com.hello01kuaixue;


public class EDemo {
	public static void main(String[] args) {
		try {
			Class.forName("className");
		}catch(IllegalArgumentException e) {
			System.out.println("捕获异常:" + e.getClass().getName());
			System.out.println("异常内容为:" + e.getMessage());
		}catch(Exception e) {
			System.out.println("捕获异常:" + e.getClass().getName());
			System.out.println("异常内容为:" + e.getMessage());
		}
	}
}
