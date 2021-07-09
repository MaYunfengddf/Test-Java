package com.hello01kuaixue;
import java.util.Arrays;

public class ArrayToString {
	public static void main(String[] args) {
		char charArray[][] = new char[][] {{'零','壹','快','学'},{'a','b','c'}};
		System.out.println(Arrays.toString(charArray));
		System.out.println(Arrays.deepToString(charArray));
	}
}
