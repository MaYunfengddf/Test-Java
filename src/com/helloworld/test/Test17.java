package com.helloworld.test;
import java.util.Arrays;
public class Test17 {
	public static void main(String[] args) {
		int count = 1;
		int[] arrays = {5, 6, 87, 1, 64, 34, 45};
		for(int a = 1; a < arrays.length; a ++) {
			
			for(int j = 0 ; j < arrays.length - a; j ++) {
				if(arrays[j]> arrays[j + 1]) {
					int b = arrays[j];
					arrays[j] = arrays[j + 1];
					arrays[j + 1] = b;
					System.out.println(Arrays.toString(arrays));
				}
				System.out.println(count++);
			}
			
		}
	}
}
