package com.helloworld.test;
//猫类

public class Cat extends Animal implements interfaceAnimal{
	private String eat;//吃
	private String sleep;//睡觉
	
	public Cat(int weight,String colour) {
		super(weight,colour);
	}
	public String getEat(){
		return eat;
	}
	public void setEat(String eat) {
		this.eat = eat;
	}
	public String getSleep(){
		return sleep;
	}
	public void setSleep(String sleep) {
		this.sleep = sleep;
	}
	public static void main(String[] args) {
		Cat cat = new Cat(12,"白色");
		System.out.println("体重:" +cat.getWeight()+"\n颜色: "+  cat.getColour());
		cat.setEat("吃骨头");
		cat.setSleep("睡在床上");
		System.out.println("吃:"+cat.getEat() + "\n睡: "+ cat.getSleep());
	}
	
	public String toString() {
		StringBuffer result = new StringBuffer();
		
		result.append("{")
		.append("\"weight\":")
		.append("\"").append(this.getWeight()).append("\"")
		.append(",")
		.append("\"weight\":")
		.append("\"").append(this.getColour()).append("\"")
		.append("}");
		
		return result.toString();
	}
}
