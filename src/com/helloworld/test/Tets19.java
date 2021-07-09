package com.helloworld.test;
public class Tets19 {
 
	public static void main(String[] args) {

		Tets19 tets = new Tets19();
		int x = 0 ;
		int j = 0;
		int f = 0;
		tets.number(x);
		tets.number(x,j);
		tets.number(x,j,f);
	}
	public void number(int x) {
		for(int i = x; i < 10;i ++) {
			for(int j = 0;j < 10;j ++ ) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public void number(int num,int str) {
		for(int i = num; i <= 12; i ++) {
			for(int x = str; x < 12 ; x ++) {
				if(i == 0) {
					System.out.print("#");
				}else if(i <= 11) {
					if(x == 0) {

						System.out.print("#");
					}else if(x <=10) {
						System.out.print("*");
					}else if(x <=11) {
						System.out.print("#");
					}
				}else if(i ==12) {
					System.out.print("#");
				}
			}
			System.out.println();
		}
	}
	public void number(int ...num) {
		for(int y = 0;y < 10 ; y ++) {
			for(int x = 0;x < 10;x ++) {
				if(y < -x + 15 && y > -x + 5 && y < x +5 &&y > x-5) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}