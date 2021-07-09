package com.hello01kuaixue;

public class DDemo {
	public static void main(String[] args) {
		ThreadDemo thread1 = new ThreadDemo("线程-1");
		thread1.start();
		ThreadDemo thread2 = new ThreadDemo("线程-2");
		thread2.start();
		
	}
}
