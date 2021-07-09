package com.helloworld.test;

import java.util.Scanner;

public class MaYunFeng {

	public static int test(int number){
		System.out.println("Hello World"+number);
		return number + 1;
	}

	public static void main(String[] args) {
        System.out.println("请输入");
		Scanner input = new Scanner(System.in);
		String data = input.nextLine(); 
		int number=Integer.parseInt(data);
		
		int result = test(number);
		System.out.println("Hello World" + result);
		
		result= test(result);
		System.out.println("Hello World" + result);
		
		result = test(result);
		System.out.println("Hello World" + result);
		
		input.close();
	}
}