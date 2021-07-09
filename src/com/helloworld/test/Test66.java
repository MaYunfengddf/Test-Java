package com.helloworld.test;

import java.util.List;
import java.util.Set;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Map;

public class Test66 {
	public static void main(String[] args) {
		List<Integer> testA = new ArrayList<>();
		testA.add(0,56);
		testA.add(1,5);
		testA.add(2,53);
		testA.add(3,58);
		testA.add(4,556);
		System.out.println("直接输出:"+ testA);

		System.out.println("集合元素个数:" + testA.size());
		System.out.println("get方法获取下标0位:"+testA.get(0));
		for(int element : testA) {
			System.out.println("foreach循环遍历:" + element);
		}
		Iterator<Integer> x = testA.iterator();
		while(x.hasNext()) {
			System.out.println("迭代器遍历:" + x.next());
		}

		System.out.println("---------------------------");
		Set<String> testB = new HashSet<>();
		testB.add("xxa");
		testB.add("ass");
		testB.add("eww");
		testB.add("kks");

		System.out.println("直接输出:"+ testB);
		System.out.println("集合元素个数:" + testB.size());
		for(String element : testB) {
			System.out.println("foreach循环遍历:" + element);
		}
		Iterator<String> y = testB.iterator();
		while(y.hasNext()) {
			System.out.println("迭代器遍历:" + y.next());
		}
		System.out.println("---------------------------");

		Map<Integer,String> testC = new HashMap<>();
		testC.put(5,"dds");
		testC.put(null,"eew");
		testC.put(4,null);
		testC.put(9,"ppg");
		testC.put(7,null);
		testC.put(66,"wwq");

		System.out.println("直接输出:"+ testC);
		System.out.println("集合元素个数:" + testC.size());
		
		for(Integer key: testC.keySet()) {
			System.out.println("使用Map.keySet遍历: key = "+key + " 对值: value = " + testC.get(key));
		}
		
		Iterator<Map.Entry<Integer, String>> d = testC.entrySet().iterator();
		while(d.hasNext()) {
			System.out.println("迭代器遍历:" + d.next());
		}
		
		System.out.println("---------------------------");
		Map<Integer,Map<String,String>> testD = new HashMap<Integer,Map<String,String>>();
		
		Map<String,String> test=new HashMap<String,String>();
		test.put("kks", "kka");
		System.out.println("直接输出:"+ test);
		System.out.println("集合元素个数:" + test.size());
		for(String key: test.keySet()) {
			System.out.println("使用Map.keySet遍历: key ="+key + " 对值 :  value =" + test.get(key));
		}
		
		System.out.println("---------------------------");
		Map<String,String> testZ=new HashMap<String,String>();
		testZ.put("kss", "kaa");
		System.out.println("直接输出:"+ testZ);
		System.out.println("集合元素个数:" + testZ.size());
		for(String key: testZ.keySet()) {
			System.out.println("使用Map.keySet遍历: key ="+key + " 对值 :  value =" + testZ.get(key));
		}
		
		System.out.println("---------------------------");
		testD.put(5,test);
		testD.put(8,testZ);
		System.out.println("直接输出:"+ testD);
		System.out.println("集合元素个数:" + testD.size());
		
		for(Integer key: testD.keySet()) {
			System.out.println("使用Map.keySet遍历: key ="+key + " 对值 :  value =" + testD.get(key));
		}
		
		Iterator<Map.Entry<Integer,Map<String,String>>> e = testD.entrySet().iterator();
		while(e.hasNext()) {
			System.out.println("迭代器遍历:" + e.next());
		}
	}
}
