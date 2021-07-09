package com.helloworld.test;
import java.util.Scanner;
import com.helloworld.test.Test9;

public class Test9 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入半径");
		String data = input.nextLine();
		double num = Double.valueOf(data);
		double s = 3.14;
		Test9 c = new Test9();
		double t = c.number(num , s);
		System.out.println(t+"aac"); 
		
		double b = c.number(num);
		System.out.println(b+"bbd"); 
		
		double x =c. number(data);
		System.out.println(x+"ssx"); 
		
		input.close();
	}

	double number(double num , double s) {
		double x =  s * num * num;
		return x;
	}

	 double number(double num) {
		double f = Math.PI;
		return number(num ,f );
	}

	double number(String data) {
		double d = Double.valueOf(data);
		return number(d , Math.PI);
	}
}
