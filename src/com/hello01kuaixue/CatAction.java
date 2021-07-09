package com.hello01kuaixue;

public class CatAction implements Cloneable{
	private String eat;
	
	public void setEat(String eat) {
		this.eat = eat;;
	}
	
	public String getEat() {
		return eat;
	}
	
	public String toString() {
		return "   爱好【" + eat + "】";
	}
	
}
