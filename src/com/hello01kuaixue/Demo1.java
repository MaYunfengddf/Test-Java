package com.hello01kuaixue;
import java.util.Random;

public class Demo1 {
	public static void main(String[] args) {
		System.out.println(Math.exp(2));
		System.out.println(Math.log(Math.E));
		System.out.println(Math.log10(10));
		System.out.println(Math.sqrt(81));
		System.out.println(Math.cbrt(27));
		System.out.println(Math.pow(2,2));
		System.out.println("--------------------");
		
		System.out.println(Math.max(1.23,3.14));
		System.out.println(Math.min(3.33,4.44));
		System.out.println(Math.abs(-5.14));
		System.out.println(Math.nextUp(-5.14));
		System.out.println(Math.nextDown(-5.14));
		System.out.println("______ ________ _______");
		
		System.out.println(Math.random());
		System.out.println(Math.random()*100);
		System.out.println("----------------------");
		
		System.out.println((char)('a' + Math.random()*('z'-'a'+1)));
		System.out.println((char)('a' + Math.random()*('z'-'a'+1)));
		System.out.println((char)('a' + Math.random()*('z'-'a'+1)));
		System.out.println("______ ___ _____ _______");
		
		Random random = new Random();
		System.out.println(random.nextInt());
		System.out.println(random.nextInt(10));
		System.out.println(random.nextBoolean());
		System.out.println(random.nextGaussian());
		
	}
}
