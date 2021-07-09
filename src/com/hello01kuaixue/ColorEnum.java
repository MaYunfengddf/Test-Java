package com.hello01kuaixue;
//枚举

public enum ColorEnum {
	RED("红色"),GREEN("绿色"),YELLOW("黄色"),BLUE("蓝色"),vh("kkl");
	public String color;
	private ColorEnum() {
		
	}
	private ColorEnum(String color) {
		this.color = color;
	}
}
