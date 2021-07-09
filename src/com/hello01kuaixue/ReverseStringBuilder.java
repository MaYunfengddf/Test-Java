package com.hello01kuaixue;

public class ReverseStringBuilder {
	public static void main(String[] args) {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("零壹快学");
		stringBuilder.append("avaj");
		System.out.println("反转前：" + stringBuilder);
		stringBuilder.reverse();
		System.out.println("反转后：" + stringBuilder);
	}
}
