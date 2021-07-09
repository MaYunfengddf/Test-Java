package com.helloworld.test;

//StringBuilder

public class Test25 {
	public static void main(String[] args) {
		String str = " "; 
		Test25 test = new Test25();
		test.stringBuilder(str);
		test.stringBuffer(str);
	}

	public void stringBuilder(String str) {
		StringBuilder stringBuilder = new StringBuilder();
		for(int i = 0;i <= 10;i ++ ) {
			stringBuilder.append("'");
			stringBuilder.append(i);
			stringBuilder.append( "'");
			stringBuilder.append(",");
			System.out.println(stringBuilder);
		}
		stringBuilder.delete(stringBuilder.length() - 1 , stringBuilder.length());
		stringBuilder.insert(0, "(");
		stringBuilder.insert(stringBuilder.length(), ")");
		System.out.println(stringBuilder);
		System.out.println("----------------------------------------------------");
	}

	public void stringBuffer(String str) {
		StringBuffer stringBuffer = new StringBuffer();
		for(int i = 0;i <= 10;i ++ ) {
			stringBuffer.append("'");
			stringBuffer.append(i);
			stringBuffer.append( "'");
			stringBuffer.append(",");
			System.out.println(stringBuffer);
		}
		stringBuffer.delete(stringBuffer.length() - 1 , stringBuffer.length());
		stringBuffer.insert(0, "(");
		stringBuffer.insert(stringBuffer.length(), ")");
		System.out.println(stringBuffer);
	}
}
