package com.hello01kuaixue;

public class EDemo1 {
	public static void main(String[] args) {
		try {
			Class.forName("className");
		}catch(Exception e) {
			System.out.println("捕获异常:" + e.getClass().getName());
			System.out.println("异常内容为:" + e.getMessage());
		}finally {
			System.out.println("finally语句最后执行");
		}
	}
}
