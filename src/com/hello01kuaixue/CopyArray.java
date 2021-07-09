package com.hello01kuaixue;
import java.util.Arrays;
//复制数组

public class CopyArray {
	public static void main(String[] args) {
		char[] charArray = new char[] {'零','壹','快','学'};
		System.out.println(Arrays.toString(charArray));
		
		char[] copyArray1 = Arrays.copyOf(charArray,4);
		System.out.println(Arrays.toString(copyArray1));
		
		char[] copyArray2 = Arrays.copyOf(charArray,3);
		System.out.println(Arrays.toString(copyArray2));
		
		char[] copyArray3 = Arrays.copyOf(charArray,8);
		System.out.println(Arrays.toString(copyArray3));
		
		System.out.println((copyArray1 == charArray));
		
		System.out.println(Arrays.equals(charArray,copyArray1));
		System.out.println(Arrays.equals(charArray,copyArray2));
		System.out.println(Arrays.equals(charArray,copyArray3));
	}
}
