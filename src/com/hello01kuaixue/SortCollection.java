package com.hello01kuaixue;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class SortCollection {
	public static void main(String[] args) {
		List<Double> list = new ArrayList<>();
		double array[] = {3,101,345,987,1};
		for(int i = 0; i < array.length;i++) {
			list.add(new Double(array[i]));
			System.out.println(list.get(i));
		}
		Collections.sort(list);
		System.out.println("排列后的数字集合顺序为");
		for(int i = 0; i < array.length;i++) {
			System.out.println(list.get(i));
		}
		Collections.reverse(list);
		System.out.println("排列后的数字集合顺序为");
		for(int i = 0; i < array.length;i++) {
			System.out.println(list.get(i));
		}
	}
}
