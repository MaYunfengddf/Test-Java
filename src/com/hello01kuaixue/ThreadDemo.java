package com.hello01kuaixue;

public class ThreadDemo extends Thread{
	private Thread t;
	private String threadName;
	public ThreadDemo(String name) {
		threadName = name;
		System.out.println("创建线程，命名为:" + threadName);
	}
	
	public void run() {
		System.out.println("运行线程" + threadName);
		try {
			for(int i = 4;i > 0;i--) {
				System.out.println("线程名称为：" + threadName + "," + i);
				Thread.sleep(1000);
				System.out.println("线程休息，时间为:1000ms" + threadName);
				
			}
		}catch(InterruptedException e) {
			System.out.println("线程" + threadName +"中断");
		}
		System.out.println("线程" + threadName + "退出，终止");
	}
	
	public void start() {
		System.out.println("启动线程" + threadName);
		if(t == null) {
			t = new Thread(this,threadName);
			t.start();
			return;
		}
		super.start();
	}
}
