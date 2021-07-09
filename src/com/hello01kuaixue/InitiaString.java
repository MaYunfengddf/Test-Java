package com.hello01kuaixue;

public class InitiaString {
	public static void main(String[] args) {
		String str = "零一快学";//这是引用赋值
		String name = str;//这也是引用赋值，将str地址赋值给name
		String number = name;
		String address1,address2,address3;//先声明变量类型，然后再引用赋值
		address1 = new String("www.01kuaixue");
		address2 = new String("www.01kuaixue");
		address3 = new String("www.01kuaixue");
		System.out.println("address1值为"+address1);
		System.out.println("address2值为"+address2);
		System.out.println("address3值为"+address3);
		System.out.println("address1和address2是否相同"+address1==address2);
		System.out.println("address2和address3是否相同"+address2==address3);
		System.out.println(address1==address3);
	}
}
