package com.hello01kuaixue;

import java.util.concurrent.*;

public class DDemo2 implements Callable<Integer>{
	public static void main(String[] args) {
		DDemo2 demo = new DDemo2();
		FutureTask<Integer> ft = new FutureTask<>(demo);
		for(int i = 0;i < 5; i++) {
			System.out.println(Thread.currentThread().getName() + "的循环变量" + i);
			if(i == 2) {
				new Thread(ft,"有返回值的线程").start();
			}
		}
		try {
			System.out.println("子线程的返回值:" + ft.get());
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public Integer call() throws Exception{
		int i = 0;
		for(;i < 5;i++) {
			System.out.println(Thread.currentThread().getName() + " "  + i);
		}
		return i;
	}
}
