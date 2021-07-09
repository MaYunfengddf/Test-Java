package com.hello01kuaixue;

import java.math.BigInteger;
import java.security.MessageDigest;

public class ShaDemo {
	public static void main(String[] args) {
		String str = "零基础Java从入门到精通";
		try {
			MessageDigest md = MessageDigest.getInstance("SHA-1");
			md.update(str.getBytes());
			System.out.println(str + "SHA-1加密后内容为:");
			System.out.println(new BigInteger(1,md.digest()).toString(256));
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
