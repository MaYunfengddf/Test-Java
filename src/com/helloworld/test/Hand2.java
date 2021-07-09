package com.helloworld.test;

public class Hand2<T extends Object> {
	
	private T item;

	public T getItem() {
		return item;
	}

	public void setItem(T item) {
		this.item = item;
	}
}
