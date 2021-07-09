package com.hello01kuaixue;

public class FinalVariable {
	
	private final int id = 1010;
	private final Person person = new Person();
	
	public static void main(String[] args) {
		
		FinalVariable finalVariable = new FinalVariable();
		
		System.out.println("id=" + finalVariable.id);
		
		System.out.println(finalVariable.person.name);
		
		finalVariable.person.name = "更改名字";
		System.out.println(finalVariable.person.name);
	}
}

