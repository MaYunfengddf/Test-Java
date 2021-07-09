package com.hello01kuaixue;
import java.util.*;

public class ArrayListAndlinkedList {
	static final int N = 10000;

	static long countTime(List list) {
		long start = System.currentTimeMillis();
		Object o = new Object();

		for(int i = 0;i<N;i++) {
			list.add(i,o);
		}
		return System.currentTimeMillis() - start;
	}

	static long readList(List list) {
		long start = System.currentTimeMillis();

		for(int i = 0,j =list.size();i < j; i++) {
			list.get(i);
		}
		return System.currentTimeMillis() - start;
	}

	static List addToList(List list) {
		Object o = new Object();

		for(int i = 0;i < N;i++) {
			list.add(i,o);
		}
		return list;
	}

	public static void main(String[] args) {
		System.out.println("ArrayList添加" + N +"条费时:" + countTime(new ArrayList()));
		System.out.println("LinkedList添加" + N +"条费时:" + countTime(new LinkedList()));
		List listA = addToList(new ArrayList<>());
		List listB = addToList(new ArrayList<>());
		System.out.println("ArrayLis查找" + N +"条费时:" + readList(listA));
		System.out.println("LinkedList查找" + N +"条费时:" + readList(listB));
	}

}
