package com.helloworld.test;
import java.util.Arrays;

public class Test59 {
	public static void main(String[] args) {
		int[] x = {45,6,456,65,1,213,13,456,235,543,15};
		System.out.println(Arrays.toString(x));

		int[] x2 = Arrays.copyOf(x,x.length);
		Arrays.sort(x2);
		System.out.println(Arrays.toString(x2));

		int[] x1 = Arrays.copyOf(x,x.length);
		for(int i = 0;i < x1.length -1;i++){
			for(int j= 0; j < x1.length -1 -i;j ++) {
				if(x1[j] > x1[j +1]) {
					int d = x1[j];
					x1[j] = x1[j + 1];
					x1[j + 1] = d;
				}
			}
		}
		System.out.println(Arrays.toString(x1));
		System.out.println(Arrays.toString(x));
		System.out.println("--------------------");

		int[] x4 = Arrays.copyOf(x1,x1.length);
		
		System.out.println(Arrays.toString(x1) +"\n");
		
		for(int i = 0; i < x4.length / 2;i ++) {
			int a = x4[i];
			x4[i]= x4[x4.length -1 - i];
			x4[x4.length -1 - i] = a;
			System.out.println(Arrays.toString(x4));
		}
	}
}
