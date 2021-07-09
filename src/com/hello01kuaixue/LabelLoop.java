package com.hello01kuaixue;

public class LabelLoop {
	public static void main(String[] args) {
		outer_loop:
		for(int i = 0;i <4;i ++) {
			System.out.println("11111111111111111");
			inner_loop:
			for(int j = 0;j < i ;j++) {
				if(i + j >2) {
					System.out.println("2222222222222222");
					continue outer_loop;
				}
				System.out.println("333333333333333333333");
			}
			System.out.println("444444444444444444");
		}
	}
}
