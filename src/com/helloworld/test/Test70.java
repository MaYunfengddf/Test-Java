package com.helloworld.test;

public class Test70 extends Thread{
	private String name;

	public Test70(String name) {
		this.name = name;
		System.out.println("同学名字:" + name);
	}

	public void run() {
		System.out.println("运行 ‘" + name + "’ 线程");
		try {
			for(int i = 0;i < 10; i++) {
				Thread.sleep(200);
				if(name == "小明") {
					if(i < 5) 
						System.out.println(name + "在看书A");
					if(i == 5)
						System.out.println(name + "在发呆B");
					if(i >5)
						
					System.out.println(name + "在记笔记C");
				}
				if(name != "小明") {
					if(i < 5)
						System.out.println(name + "在吃零食D");
					if(i >= 5)
						System.out.println(name + "在看历史书E");
				}
			}
		}catch (InterruptedException e) {
			System.out.println("线程" + name + "中断");
		}
		System.out.println("线程--" + name + "--中断退出...");
	}
}
