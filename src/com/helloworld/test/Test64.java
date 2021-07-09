package com.helloworld.test;
/*
 * 设计出物品这种类
类名：Item物品有如下属性:名字 name 类型是字符串String价格 price 类型是整型 int创建(实例化)3件具体物品名称 价格血瓶 50草鞋 300长剑 350
 */
public class Test64 {
	private String name;
	private int price;
	public Test64() {
		
	}
	
	public Test64(String name,int price) {
		this.name = name;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String number() {
		return "名字:" + getName() + "\n价格:" + getPrice();
	}
	
}
