package com.hello01kuaixue;
import java.util.ArrayList;
import java.util.List;

public class ToString {
	public static void main(String[] args) {
		String str = "零壹快学";
		System.out.println("转化为字符串:" + str.toString());
		List<String>strList = new ArrayList<>();
		strList.add("我");
		strList.add("爱");
		strList.add("编程");
		System.out.println("集合类转换为字符串：" + strList.toString());
	}
}