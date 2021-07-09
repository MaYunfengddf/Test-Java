package com.helloworld.test;

public  class Test41 implements Cloneable{
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

	public void setCatAction(CatAction catAction) {
		this.catAction = catAction;
	}

	public String toString() {
		return "名字:" + name + " 年龄:" +age + catAction.toString();
	}

	public Object clone() throws CloneNotSupportedException{
		Test41 newCat = (Test41)super.clone();
		newCat.catAction = (CatAction)catAction.clone();
		return newCat;
	}
}

