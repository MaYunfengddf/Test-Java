package com.helloworld.test;

public abstract class Test43 {
	public String name;//名字
	public int age;//年龄
	public String hobby;//爱好

	public void getName() {
		System.out.println(name+"属于动物类");
	}
	public abstract void getAge(int age);
	public abstract void getHobby( String hobby);
}
