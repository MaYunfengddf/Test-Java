package com.hello01kuaixue;

import com.hello01kuaixue.joinDemo.ThreadA;

public class SleepDemo {
	public static void main(String[] args) {
		try {
			ThreadA t1 = new ThreadA("t-1");
			t1.start();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	static class ThreadA extends Thread{
		public ThreadA(String name) {
			super(name);
		}
		public void run() {
			try {
				System.out.printf("%s线程开始\n",this.getName());
				for(int i = 0;i < 1000000;i++) {
					if(i == 10000) {
						System.out.println("i循环到10000时线程休眠100毫秒");
						this.sleep(1000);
					}
				}
				System.out.printf("%s线程结束\n",this.getName());
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}
