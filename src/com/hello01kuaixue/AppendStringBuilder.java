package com.hello01kuaixue;

public class AppendStringBuilder {
	public static void main(String[] args) {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("添加boolean值:");
		stringBuilder.append(true);
		stringBuilder.append("\n");
		
		stringBuilder.append("添加字符值：");
		stringBuilder.append('c');
		stringBuilder.append("\n");
		
		stringBuilder.append("添加整形值：");
		stringBuilder.append(1010);
		stringBuilder.append("\n");
		
		stringBuilder.append("添加浮点值:");
		stringBuilder.append(10.12f);
		stringBuilder.append("\n");
		
		stringBuilder.append("添加StringBuilder对象值:");
		stringBuilder.append(new StringBuilder("零壹快学"));
		System.out.println(stringBuilder);
	}
}
