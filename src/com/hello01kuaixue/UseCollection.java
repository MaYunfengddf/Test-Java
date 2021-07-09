package com.hello01kuaixue;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class UseCollection {
	public static void main(String[] args) {
		Collection<String> collection = new ArrayList<String>();
		collection.add("第一个元素");
		collection.add("第二个元素");
		Iterator<String> i = collection.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());

		}	
		String s1 = "runoob";
		String s2 = "runoob";
		System.out.println("s1 == s2 is:" + s1 == s2);



	}
}
