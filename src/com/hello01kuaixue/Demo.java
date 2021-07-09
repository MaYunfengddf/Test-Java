package com.hello01kuaixue;
import java.math.BigInteger;
import java.math.BigDecimal;


public class Demo {
	public static void main(String[] args) {
		
		BigInteger bigInteger = new BigInteger("1010");
		System.out.println("1:"+bigInteger);
		
		bigInteger.add(new BigInteger("101"));
		System.out.println("2:"+bigInteger.toString());
		
		bigInteger = bigInteger.add(new BigInteger("101"));
		System.out.println("3: " +bigInteger.toString());
		
		BigDecimal bigDecimal = new BigDecimal("3.14");
		System.out.println("4:"+bigDecimal.toString());
		System.out.println("5:"+bigDecimal.precision());
		System.out.println(Math.PI);
		System.out.println(Math.E);
		
	}
}
