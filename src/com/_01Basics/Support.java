package com._01Basics;

//兔子问题

public class Support{
	public static void main(String[] args){
		int x = 10;
		System.out.println(heal(x));
	}
	public static int heal(int x){
		if(x <= 2) {
			return 1;
		}
		return heal(x - 1) + heal(x - 2);
	}
}
