package com.hello01kuaixue;

public class SearchString {
	public static void main(String[] args) {
		//	String str = "零壹快学abc";
			//for(int i =0;i<str.length();i++){
			//System.out.println("以此查询str字符串，第"+ i +"索引字符为"+str.length());
			//System.out.println("“壹”在str对象中出现的索引位置为："+str.indexOf("b"));
			//零的索引为0，从1开始无法找到该字符串
			//System.out.println("从引索1开始查询，“零”在str对象中出现的引索位置为："+str.indexOf("零",1));
		
			//int ascii = (int)'a';//获取‘a’字符啊ASCII码值
			//System.out.println("'a'在str对象中出现的引索位置为"+str.indexOf(ascii));
			//System.out.println("从引索1开始查询，‘a’在str对象中出现引索的位置为："+str.indexOf(ascii,1));
		String str = "零壹快学abc零壹快学abc";
			//int ascii = (int)'a';//获取a字符的ASCII码值
			//int i = 0;
			//int count = 0;
			//while(i<str.length()) {
				//int index = str.indexOf(ascii,i);
				//System.out.println("从引索开始查询，'a'在str对象中出现的引索位置为："+ index);
				//if(index>0) {
					//i = index + 1;
				//count++;
				//}else {
				//break;
				//}	
			//}
			//System.out.println("'a'字符在str对象中共出现次数"+ count);
		System.out.println("“壹”在str对象中最后一次出现的索引位置为："+ str.lastIndexOf("壹"));
		System.out.println("从索引1开始查询，“零”在str对象中最后一次出现的索引位置为:"+ str.lastIndexOf("零",1));
		int ascii = (int)'a';
		System.out.println(str.lastIndexOf(ascii));
			System.out.println(str.lastIndexOf(ascii,1));
	}
		
}
