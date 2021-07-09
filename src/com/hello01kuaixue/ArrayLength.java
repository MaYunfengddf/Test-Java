package com.hello01kuaixue;

public class ArrayLength {
	public static void main(String []args) {
		char charArray[][] = new char[][] {{'零','壹','快','学'},{'a','b','c'},{'0','1'}};
		System.out.println(charArray.length);
		System.out.println(charArray[0].length);
		System.out.println(charArray[1].length);
	}
}/*
零						学
壹						快
快   a   b   c			壹	 a  b  c
学   0   1				零   1  0
   第一种					第二种2
   
   a[0][0] = 零 a[0][1]=壹 a[0][2]=快 a[0][3]=学 a[1][0]=a a[1][2]=b a[1][3]=c a[2][0]=0 a[2][1]=1
   
*/