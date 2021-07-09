package com.helloworld.test;
import java.util.Arrays;

public class Test57 {
	public static void main(String[] args) {
		int[][] x = new int[2][2];
		for(int i = 0;i < 2;i++) {
			for(int a = 0;a <2;a++) {
				for(int c = 0;c < 4;c ++) {
					x[i][a] =c;
					System.out.println(Arrays.deepToString(x));
				}
			}
		}

	}
}
