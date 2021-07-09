package com.hello01kuaixue;
import java.util.Arrays;
public class FillArray {
	public static void main(String[] args) {
		int[] intArray = new int[7];
		Arrays.fill(intArray,0,2,14);
		System.out.println(Arrays.toString(intArray));
	}
}
