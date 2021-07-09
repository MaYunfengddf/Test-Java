package com.hello01kuaixue;
import java.util.*;

public class ArraysListGetSet {
	public static void main(String[] args) {
		List<String> arayList = new ArrayList<String>();
		arayList.add(0,"A");
		arayList.add(1,"B");
		arayList.set(1, "C");
		System.out.println(arayList.get(0));
		System.out.println(arayList.get(1));
	}
}
