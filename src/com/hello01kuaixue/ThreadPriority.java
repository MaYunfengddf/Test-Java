package com.hello01kuaixue;

public class ThreadPriority implements Runnable{
	public void run() {
		for(int i = 0;i < 5;i++) {
			System.out.println(Thread.currentThread().getName() + "输出" + i);
		}
	}
	
	public static void main(String[] aegs) {
		Thread maxPriority = new Thread(new ThreadPriority(),"高优先级线程");
		Thread minPriority = new Thread(new ThreadPriority(),"底优先级线程");
		maxPriority.setPriority(Thread.MAX_PRIORITY);
		minPriority.setPriority(Thread.MIN_PRIORITY);
		maxPriority.start();
		minPriority.start();
	}
}
