package com.hello01kuaixue;

public class EqualString {
	
	public static void main(String[] args) {
		String str1 = new String("01kuaixue");
		String str2 = str1;
		String str3 = new String("01uaixue");
		
		boolean retVal;
		
		retVal = str1.equals(str2);
		System.out.println("str1与str2比较结果:" + retVal);
		
		retVal = str1.equals(str3);
		System.out.println("str1与str3比较结果:" + retVal);
		
		retVal = str1.equals(null);
		System.out.println("str1与null比较结果:" + retVal);//使用==与equals区别
		
		retVal = str1 == str2;//str1和str2都指向同一个内存地址
		System.out.println("str1与str2使用==比较结果:" + retVal);
		
		str2 = new String("01kuaixue");//str2指向一个内容相同但内存地址不同的字符串
		retVal = str1 == str2;
		System.out.println("str1与str2使用==比较结果:" + retVal);
		
		str1 = "www.01kuaixue.com";
		str2 = "www.01kuaixue.com";
		
		retVal = str1 == str2;
		retVal = str1 == str2;//str1与str2指定同一个字符串常量
		System.out.println("str1与str2使用==比较结果：" + retVal);
	}
}
