package com.hello01kuaixue;

public class InsertStringBuilder {
	public static void main(String[] args) {
		StringBuilder stringBuilder = new StringBuilder("零壹快学");
		stringBuilder.insert(0,true);
		stringBuilder.insert(1,1010);
		stringBuilder.insert(11,"Javag工程师");
		stringBuilder.insert(16, 40002213);
		System.out.println(stringBuilder);
	}
}