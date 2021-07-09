package com.hello01kuaixue;

public class CatView {
	public void privateCatInfo(CatModel cat) {
		System.out.println("视图输出数据");
		System.out.println("Cat名字为:" + cat.getName() + ", 年龄为:" + cat.getAge());
	}
}
