package com.helloworld.test;

public class Test74 extends Thread{
	private int x;
	public Test74(int x) {
		this.x = x;
		System.out.println("创建线程:" + x);
	}

	public void run() {
		System.out.println("运行线程:" + x);
		synchronized (Test74.class) {

			for(int i = 1; i <= 9; i++) {
				for(int y = 1; y <= i;y++) {
					System.out.print(y + "*" + i  + " = " + (i * y) + "   ");
				}
				System.out.print("\n");
			}
		}
	}
	public static void main(String[] args) {
		Test74 test = new Test74(1);
		test.start();
		Test74 test1 = new Test74(2);
		test1.start();
		Test74 test2 = new Test74(3);
		test2.start();
		Test74 test3 = new Test74(4);
		test3.start();
	}
}
