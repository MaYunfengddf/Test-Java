package com.hello01kuaixue;

public class StopDemo {
	public static void main(String[] args) {
		try {
			ThreadA t1 = new ThreadA("t-3");
			t1.start();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	static class ThreadA extends Thread{
		public ThreadA(String name) {
			super(name);
		}
		private boolean isContinue = true;
		public void run() {
			try {
				System.out.printf("%s线程开始\n",this.getName());
				for(int i = 0;i < 1000000;i++) {
					if(i == 10000) {
						isContinue = false;
						System.out.printf("%s中断线程\n",this.getName());
						break;
					}
				}
				System.out.printf("%s线程结束\n",this.getName());
			}catch(Exception e) {
				e.printStackTrace();
			}
		}

	}
}
