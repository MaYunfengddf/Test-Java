package com.hello01kuaixue;
import java.util.Arrays;
//数组排序

public class SortArray {
	public static void main(String[] args) {
		Integer[] intArray = new Integer[] {10,5,12,99,50,55555555};
		System.out.println(Arrays.toString(intArray));
		
		Arrays.sort(intArray);
		System.out.println(Arrays.toString(intArray));
		
		Character[] charArray = new Character[] {'a','A','z','m','L','O'};
		System.out.println(Arrays.toString(charArray));
		
		Arrays.sort(charArray);
		System.out.println(Arrays.toString(charArray));
	}
}
