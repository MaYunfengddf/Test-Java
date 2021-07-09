package com.helloworld.test;
//0到100中间加逗号，
public class ConcatenateString {

	public static void main(String[] args) {
		String str = "";
		for(int i=0; i <= 100; i++) {
			str +=  i +",";
		}
		str = str.substring(0, str.length() - 1);
		str = str.replace(",",":");
		str = str.replace(":"," : ");
		String st = str.substring(0,  str.indexOf("50")+2);//截取str字符串0到字符串50位置
		System.out.println(st);
		str = str.substring(str.indexOf("51") );//截取str字符串里51开始到最后
		System.out.println(str);
	}
}
