package com.hello01kuaixue;

import java.util.Iterator;
import java.util.Map;
import java.util.HashMap;

public class UseHashMap {
	public static void main(String[] args) {
		Map<String,String> hashMap = new HashMap<>();
		hashMap.put("1小明","11岁了");
		hashMap.put("2小张","22岁了");
		hashMap.put("3小刘","23岁了");
		hashMap.put("4小五","9岁了");
		System.out.println("通过Map.keySet遍历");
		for(String key : hashMap.keySet()) {
			System.out.println("key = " + key + " and vale = " +hashMap.get(key));
		}
		System.out.println("通过Map.entrySet使用iterator遍历");
		Iterator<Map.Entry<String,String>> it = hashMap.entrySet().iterator();
		while(it.hasNext()) {
			Map.Entry<String,String> entry = it.next();
			System.out.println("key = " + entry.getKey() +" and vale = " + entry.getValue());
		}
		System.out.println("通过Map.entrySet遍历");
		for(Map.Entry<String,String> entry : hashMap.entrySet()) {
			System.out.println("key = " + entry.getKey() +" and vale = " + entry.getValue());
		}
		System.out.println("通过Map.value遍历");
		for(String v : hashMap.values()) {
			System.out.println("value = " + v);
		}
		System.out.println(hashMap);
	}
}
