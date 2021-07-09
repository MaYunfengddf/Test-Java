package com.hello01kuaixue;
import java.util.*;

public class UseTreeSetMethod {
	public static void main(String[] args) {
		TreeSet<Integer> treeSet = new TreeSet<>();
		treeSet.add(5);
		treeSet.add(2);
		treeSet.add(3);
		Iterator<Integer> iterator = treeSet.iterator();
		System.out.println(treeSet.last());
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		TreeSet<Person> personSet = new TreeSet();
		personSet.add(new Person(26,"王一"));
		personSet.add(new Person(22,"张二"));
		personSet.add(new Person(23,"刘禅"));
		Iterator<Person> personIterator = personSet.iterator();
		System.out.println("按年龄排序");
		while(personIterator.hasNext()) {
			Person person = personIterator.next();
			System.out.println("姓名:" + person.name + " 年龄:"+ person.age);
		}	
		List<String> test = new ArrayList<>();
		test.add(0,"w");
		test.add(1,"s");
		test.add(2,"p");
		test.add(3,"j");
		System.out.println(test.get(3));
		System.out.println(test.get(1));
		System.out.println(test.get(2));
		System.out.println(test.get(0));
		
	}
}
