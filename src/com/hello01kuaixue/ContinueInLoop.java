package com.hello01kuaixue;
import java.util.Arrays;

public class ContinueInLoop {
	public static void main(String []args) {
		int[] srrsyd = {5,45,56,21,3256,545,78,3};
		for(int i =1;i < srrsyd.length;i ++) {
			for(int j = 0;j < srrsyd.length - i;j ++) {
				if(srrsyd[j] > srrsyd[j + 1]) {
					int x = srrsyd[j];
					srrsyd[j] = srrsyd[j + 1];
					srrsyd[j + 1] = x;
					System.out.println(Arrays.toString(srrsyd));
				}
			}
		}
	}
}
