package com.hello01kuaixue;

public class DDemo1 {
	public static void main(String[] args) {
		RunnaBleDemo runnaBle1 = new RunnaBleDemo("线程-1");
		runnaBle1.start();
		RunnaBleDemo runnaBle2 = new RunnaBleDemo("线程-2");
		runnaBle2.start();
	}
}
