package com.hello01kuaixue;

public class DeleteStringBuilder {
	
	public static void main(String[] args) {
		StringBuilder stringBuilder = new StringBuilder();
		
		stringBuilder.append("零壹快学www.01kuiaxue.com");
		
		System.out.println("删除前内容为:" + stringBuilder);
		
		stringBuilder.delete(0, 4);
		
		System.out.println("删除后内容为：" + stringBuilder);
		
		stringBuilder.delete(2,2);
		
		System.out.println("：" + stringBuilder);
	}
}
