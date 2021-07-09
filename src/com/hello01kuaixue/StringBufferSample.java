package com.hello01kuaixue;

public class StringBufferSample {
	public static void main(String[] args) {
		StringBuffer stringBuffer = new StringBuffer("零壹快学");
		stringBuffer.append("www.01kuaixue.com");
		System.out.println("创建stroingbuffer对象:" + stringBuffer);
		System.out.println("stroingbuffer的容量:" + stringBuffer.capacity());
		System.out.println("stroingbuffer的长度为:" + stringBuffer.length());
		stringBuffer.replace(0,4,"java学习");
		System.out.println("replace替换后为：" + stringBuffer);
		stringBuffer.insert(6, "工程师");
		System.out.println("inset方法插入后为:" + stringBuffer);
	}
}
