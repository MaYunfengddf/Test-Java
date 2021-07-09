package com.hello01kuaixue;

public class RunnaBleDemo implements Runnable {
	private Thread t;
	private String threadName;
	public RunnaBleDemo(String name) {
		threadName = name;
		System.out.println("创建线程，命名为:" + threadName);
	}

	public void run() {
		System.out.println("运行线程" + threadName);
		try {
			for(int i = 4;i > 0;i--) {
				System.out.println("线程名称为：" + threadName + "," + i);
				System.out.println("线程休息，时间为:100ms");
				Thread.sleep(100);
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
		this.start();
	}
}
