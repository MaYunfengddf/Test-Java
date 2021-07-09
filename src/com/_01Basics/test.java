package com._01Basics;

public class test {
	public static void main(String[] args) {
		int w;
		int[] i = new int[] {1,2,5,6,3,5,8,6,3,4,55,33};
		for(int element :i) {
			System.out.print(element);
		} 
		System.out.print("\n");
		for(int x = 0;x < i.length - 1;x++) {
			for(int y = 0;y < i.length - 1;y++) {
				if(i[y] > i[y + 1]) {
					w = i[y];
					i[y] = i[y + 1];
					i[y + 1] = w;
				}
			}
		}
		for(int element : i) {
		System.out.print(element);
		}
	}
}
