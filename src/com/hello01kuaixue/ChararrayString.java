package com.hello01kuaixue;

public class ChararrayString {
	public static void main(String[] args) {
		char[] charArray = {'零','一','快','学'};
		String str = String.valueOf(charArray);//从数组2开始提取地1个数字
		System.out.println("由字符数组初始化为字符串"+str);
	}
}