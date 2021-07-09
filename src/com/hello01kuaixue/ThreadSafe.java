package com.hello01kuaixue;

public class ThreadSafe extends Thread{
	public Integer count = 0;
	public void run() {
		synchronized (ThreadSafe.class) {
			for(int i = 0;i < 100;i++) {
				count++;
			}
			System.out.println(Thread.currentThread().getName() + "线程当前count值为:" + count);
		}
	}
	public static void main(String[] args) {
		for(int i = 0;i < 5; i++) {
			ThreadSafe threadSafe = new ThreadSafe();
			threadSafe.start();
		}
	}
}
