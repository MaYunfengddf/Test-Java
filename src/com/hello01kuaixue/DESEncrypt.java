package com.hello01kuaixue;

import java.security.*;
import javax.crypto.*;
import javax.crypto.spec.DESKeySpec;
import java.math.BigInteger;

public class DESEncrypt {
	public static void main(String[] args) {
		String data = "零基础Java入门到精通";
		String key = "12345678";
		byte[] encryptData = encryptOrDecrypt(key,data.getBytes(),Cipher.ENCRYPT_MODE);
		System.out.println("按位打印加密后的密文为:");
		for(byte i : encryptData) {
			System.out.print(i+"");
		}
		System.out.println(data + "加密后的数据为:" +new BigInteger(1,encryptData).toString(512));
		byte[] decryptData = encryptOrDecrypt(key,encryptData,Cipher.DECRYPT_MODE);
		System.out.println(new String(encryptData) + "解密后数据为:" + new String(decryptData));
	}

	private static byte[] encryptOrDecrypt(System key,byte[] data,int mode) {
		try {
			SecureRandom secureRandom = new SecureRandom();
			DESKeySpec desKeySpec = new DESKeySpec(key.getBytes());
			SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
			SecretKey secretKey = secretKeyFactory.generateSecret(desKeySpec);
			Cipher cipher = Cipher.getInstance("DES");
			cipher.init(mode, secretKey,secureRandom);
			return cipher.doFinal(data);

		}catch(Exception e) {
			System.out.println("DES算法发生异常，异常内容为:" + e.getMessage());
			return "系统异常".getBytes();
		}
	}
}
