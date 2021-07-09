package com.hello01kuaixue;

public class ThreadSaf implements Runnable{
	private Integer key = 0;

	public synchronized Integer getKey(){
		key++;
		return key;
	}
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + ":" + getKey());
		try {
			Thread.sleep(100);
		}catch(InterruptedException e) {
		}
	}
	public static void main(String[] args) {
		ThreadSafe1 threadSafe = new ThreadSafe1();
		for(int i = 0;i < 10;i++) {
			new Thread(threadSafe,"线程-" + i).start();
		}
	}
}
