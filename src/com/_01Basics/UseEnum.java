package com._01Basics;

public class UseEnum {
	public static void main(String[] args) {
		Enum e[] = Enum.values();
		for(int i = 0;i < e.length;i++) {
			System.out.println(e[i].c);
		}
	}
}
