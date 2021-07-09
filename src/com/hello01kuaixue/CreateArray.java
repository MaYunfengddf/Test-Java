package com.hello01kuaixue;

public class CreateArray {
	public static void main(String[] args) {
		char charArray[] = new char[] {'零','壹','快','学'};
		char anotherArray[] = charArray;
		boolean compareResult = charArray == anotherArray;
		System.out.println(compareResult);
	}
}
