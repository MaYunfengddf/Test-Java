package com.hello01kuaixue;
import java.util.*;

public class UseHashSet {
	public static void main(String[] args) {
		Set<String> hashSet = new HashSet<String>();
		hashSet.add("A");
		hashSet.add("B");
		hashSet.add("C");
		hashSet.add("D");
		hashSet.add("B");
		hashSet.remove("D");
		System.out.println(hashSet.size());
		for(String element : hashSet) {
			System.out.println(element);
		}
		Iterator<String> iterator = hashSet.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
