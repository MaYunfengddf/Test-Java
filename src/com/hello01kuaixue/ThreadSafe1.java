package com.hello01kuaixue;

public class ThreadSafe1 implements Runnable{
	private Integer key = 0;
	@Override
	public void run() {
		synchronized (ThreadSafe1.class) {
			key++;
			System.out.println(Thread.currentThread().getName() + ":" + key);
//			try {
//				Thread.sleep(100);
//			}catch(InterruptedException e) {
//			}
		}
	}
	public static void main(String[] args) {
		ThreadSafe1 threadSafe = new ThreadSafe1();
		for(int i = 0;i < 10;i++) {
			new Thread(threadSafe,"线程-" + i).start();
		}
	}
}
