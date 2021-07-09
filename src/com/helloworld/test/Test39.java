package com.helloworld.test;
import com.hello01kuaixue.CatAction;

public class Test39 implements Cloneable{
	private String name;
	private int age ;
	private CatAction catAction;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age){
		this.age = age;
	}

	public CatAction getCatAction() {
		return catAction;
	}

	public void setcatAction(CatAction catAction) {
		this.catAction = catAction;
	}

	public String toString() {
		return "名字:" + name + " 年龄:" +age + catAction.toString();
	}

	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
}
