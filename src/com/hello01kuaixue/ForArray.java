package com.hello01kuaixue;

public class ForArray {
	public static void main(String[] args) {
		char charArray[][] = new char[][]{ {'零','壹','快','学'},{'7','w'},{'1','4','6'},{'a','b','c','d','e'}};
		for(int i = 0 ; i < charArray.length ; i++) {
			for(int j = 0 ; j < charArray[i].length ; j++) {
			System.out.println(charArray[i][j]);
				
			}
		}
	}
}
