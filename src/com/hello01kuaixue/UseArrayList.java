package com.hello01kuaixue;
import java.util.*;

public class UseArrayList {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("第一个元素");
		list.add("第二个元素");
		list.add("第三个元素");
		list.add("第四个元素");
		list.add("第五个元素");
		
		list.remove(4);
		list.remove(2);
		
		for(String element : list) {
			System.out.println(element);
		}
		Iterator<String> iterator = list.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
