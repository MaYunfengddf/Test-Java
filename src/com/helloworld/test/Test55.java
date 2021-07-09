package com.helloworld.test;

public class Test55<T,U> extends Test54<T,U>{
	private T eat;
	private U sleep;
	public T getEat() {
		return eat;
	}
	public void setEat(T eat) {
		this.eat = eat;
	}
	public U getSleep() {
		return sleep;
	}
	public void setSleep(U sleep) {
		this.sleep = sleep;
	}
	public void toStringB () {
		System.out.printf( "\n午餐吃的:%s\n睡在:%s", getEat(),getSleep()); 
		System.out.print("\n---------------------\n");
	}
	
}
