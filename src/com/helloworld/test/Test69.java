package com.helloworld.test;

import java.io.FileWriter;
import java.util.Scanner;

public class Test69 {
	public static void main(String[] args) {
		try {

			Scanner sc = new Scanner(System.in);
			System.out.println("输入汉字");
			String str = sc.nextLine();
			FileWriter writer = new FileWriter("D:/ddfs.txt");
			writer.write(str);
			writer.close();
			sc.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
