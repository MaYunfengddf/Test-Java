package com.hello01kuaixue;

public class DDemo4 {
	public static void main(String[] args) {
		final Object object = new Object();
		Thread t1 = new Thread() {
			public void run() {
				synchronized(object) {
					System.out.println("线程1开始...");
					try {
						System.out.println("线程1暂停...");
						object.wait();
					}catch(InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println("线程1结束...");
				}
			}
		};
		Thread t2 = new Thread() {
			public void run() {
				synchronized(object) {
					System.out.println("线程2开始...");
					System.out.println("线程1恢复...");
					object.notify();
					System.out.println("线程2结束...");
				}
			}
		};
		t1.start();
		t2.start();
	}
}
