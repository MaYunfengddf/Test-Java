package com.hello01kuaixue;

public class Demo2<T> {
	private T name;
	private List<T> desc;
	public void setName() {
		this.name = name;
	}
	public  T getName() {
		return name;
	}
	public void setDesc(List<T> desc) {
		this.desc = desc;
	}
	public List<T>getDesc(){
		return desc;
	}
}
