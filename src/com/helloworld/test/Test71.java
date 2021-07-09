package com.helloworld.test;


public class Test71 {
	public static void main(String[] args) {
		try {
			Test70 test = new Test70("小明");
			test.start();
			
			test.join();
			Test70 test1 = new Test70("小红");
			test1.start();
			
			Thread.sleep(3000);
			test1.join();
			
			Test70 test2 = new Test70("小王");
			test2.start();
			
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
