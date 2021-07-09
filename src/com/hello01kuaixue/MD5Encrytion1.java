package com.hello01kuaixue;

import java.math.BigInteger;
import java.security.MessageDigest;

public class MD5Encrytion1 {
	public static void main(String[] args) {
		String userAPassword = "0123456789";
		String userBPassword = "95643210";
		System.out.println("用户A登录是否成功: " + md5Encryp(userAPassword).equals(getPasswordFromDB("userA")));
		System.out.println("用户B登录是否成功: " + md5Encryp(userAPassword).equals(getPasswordFromDB("userB")));
	}
	
	public static String md5Encryp(String str) {
		try {
			MessageDigest md = MessageDigest.getInstance("MD5");
			md.update(str.getBytes());
			return new BigInteger(1,md.digest()).toString(16);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	public static String getPasswordFromDB(String name) {
		return UserEnum.getPassword(name);
	}
}
