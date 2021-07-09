package com.hello01kuaixue;

import java.math.BigInteger;
import java.security.MessageDigest;

public class MD5Encrytion2 {
	public static void main(String[] args) {
		String str ="零基础Java从入门到精通";
		System.out.println("MD5第一次加密为:" + md5Encrytion(str));
		System.out.println("MD5第二次加密为:" + md5Encrytion(md5Encrytion(str)));
		System.out.println("MD5第三次加密为:" + md5Encrytion(md5Encrytion(md5Encrytion(str))));
	}

	public static String md5Encrytion(String str) {
		try {
			MessageDigest md = MessageDigest.getInstance("MD5");
			md.update(str.getBytes());
			return new BigInteger(1,md.digest()).toString(16);
		}catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
