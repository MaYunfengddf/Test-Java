package com.hello01kuaixue;

public class joinDemo {
	public static void main(String[] args) {
		try {
			ThreadA t1 = new ThreadA("y-1");
			t1.start();
			t1.join();
			System.out.printf("%s线程完成\n",Thread.currentThread().getName());
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	static class ThreadA extends Thread{
		public ThreadA(String name) {
			super(name);
		}
		public void run(){
			System.out.printf("%s线程开始\n",this.getName());
			for(int i = 0; i < 1000000;i++);
			System.out.printf("%s线程结束\n",this.getName());
		}
	}
}
