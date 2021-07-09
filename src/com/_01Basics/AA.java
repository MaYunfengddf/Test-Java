package com._01Basics;

public class AA {
	public String name = "some hero"; 

	public AA(){
		name = "one hero";
		System.out.println("3" + name);
	}
	static{
		 String name = "sds";
		System.out.println("4" + name);
	}
	{
		name = "the hero";
		System.out.println("2" + name);
	}
	
	public static void main(String[] args) {
		AA a = new AA();  
		System.out.println("1" + a.name);
		
	}
}
