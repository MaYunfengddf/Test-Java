package com._01Basics;

import java.io.FileOutputStream;

//用数组实现九九乘法表表 并储存
public class Jj {
	public static void main(String [] args) {
		Jj j = new Jj();
		j.test();
	}

	public void test() {
		int o;
		int c = 1;
		String t ="";
		for(int i = 1;i < 10;i++) {
			for(int y = 1;y <= i;y++) {
				o = y * i;
				System.out.print(y + " * " + i + " = " + o  +"   ");

				if(y == c) {
					t+=y + " * " + i + " = " + o  +" \n";
				}else {
					t = t + y + " * " + i + " = " + o  +"   ";
				}

			}
			System.out.println();
		}
		try {
			FileOutputStream fo = new FileOutputStream("D:\\Workspace\\MaYunFeng\\src\\com\\_student\\achievement\\test.txt");
			fo.write(t.getBytes("UTF-8"));


			fo.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
