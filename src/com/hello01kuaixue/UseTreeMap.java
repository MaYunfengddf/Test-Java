package com.hello01kuaixue;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.TreeMap;

public class UseTreeMap {
	public static void main(String[] args) {
		TreeMap<Person,String> treeMap = new TreeMap<>();
		treeMap.put(new Person(22,"小刘"),"上大学");
		treeMap.put(new Person(11,"小王"),"上小学");
		treeMap.put(new Person(32,"老刘"),"已工作");

		Iterator<Person> personIterator = treeMap.keySet().iterator();
		while(personIterator.hasNext()) {
			Person person = personIterator.next();
			System.out.println(person.toString());
		}
		System.out.println("=-----------------");
		System.out.println(treeMap);
		System.out.println("=-----------------");
		for(Person key : treeMap.keySet()) {
			System.out.println(key + " " + treeMap.get(key));
		}
		System.out.println("=-----------------");
		for(Entry<Person, String> entry : treeMap.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}
}
