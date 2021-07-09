package com.hello01kuaixue;

import java.math.BigInteger;
import java.security.MessageDigest;

public class MD5EncryTion {
	public static void main(String[] args) {
		try {
			String str = "95643210";
			MessageDigest md = MessageDigest.getInstance("MD5");
			md.update(str.getBytes());
			System.out.println(str + "MD5加密后内容为:");
			String a = new BigInteger(1,md.digest()).toString(16);
			double x = Double.valueOf(a);
			System.out.println(( x + 1));
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}