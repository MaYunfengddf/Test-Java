package com.hello01kuaixue;

import java.math.BigInteger;
import java.security.*;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.HashMap;
import java.util.Map;

import javax.crypto.Cipher;
//RAS加密算法
public class RSAEncrypt {
	public static final String KEY_ALGORITHM = "RSA";
	private static final int KEY_SIZE = 512;
	private static final String PUBLIC_KEY = "RSAPublicKey";
	private static final String PRIVATE_KEY = "RSAPrivateKey";
	
	//初始化密钥对
	public static Map<String,Object> initKey() throws Exception{
		KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance(KEY_ALGORITHM);
		keyPairGenerator.initialize(KEY_SIZE);
		KeyPair keyPair = keyPairGenerator.generateKeyPair();
		RSAPublicKey publicKey = (RSAPublicKey) keyPair.getPublic();
		RSAPrivateKey privateKey = (RSAPrivateKey) keyPair.getPrivate();
		Map<String,Object> keyMap = new HashMap<String,Object>();
		keyMap.put(PUBLIC_KEY, publicKey);
		keyMap.put(PRIVATE_KEY, privateKey);
		return keyMap;
	}
	
	//密钥加密
	public static byte[] encryptByPrivateKey(byte[] data,byte[] key) throws Exception{
		PKCS8EncodedKeySpec pkcs8KeySpec  = new PKCS8EncodedKeySpec(key);
		KeyFactory keyFactory = KeyFactory.getInstance(KEY_ALGORITHM);
		PrivateKey privateKey = keyFactory.generatePrivate(pkcs8KeySpec);
		Cipher cipher = Cipher.getInstance(keyFactory.getAlgorithm());
		cipher .init(Cipher.ENCRYPT_MODE, privateKey);
		return cipher.doFinal(data);
	}
	
	//公钥加密
	public static byte[] encryptByPublicKey(byte[] data,byte[] key) throws Exception{
		KeyFactory keyFactory = KeyFactory.getInstance(KEY_ALGORITHM);
		X509EncodedKeySpec x509KeySpec = new X509EncodedKeySpec(key);
		PublicKey pubKey = keyFactory.generatePublic(x509KeySpec);
		Cipher cipher = Cipher.getInstance(keyFactory.getAlgorithm());
		cipher .init(Cipher.ENCRYPT_MODE, pubKey);
		return cipher.doFinal(data);
	}
	
	//私钥解密
	public static byte[] decryptByprivateKey(byte[]data,byte[] key)  throws Exception{
		PKCS8EncodedKeySpec pkcs8KeySpec = new PKCS8EncodedKeySpec(key);
		KeyFactory keyFactory = KeyFactory.getInstance(KEY_ALGORITHM);
		PrivateKey privateKey = keyFactory.generatePrivate(pkcs8KeySpec);
		Cipher cipher = Cipher.getInstance(keyFactory.getAlgorithm());
		cipher .init(Cipher.DECRYPT_MODE, privateKey);
		return cipher.doFinal(data);
	}
	
	//公钥解密
	public static byte[] decryptByPublicKey(byte[] data,byte[] key) throws Exception{
		KeyFactory keyFactory = KeyFactory.getInstance(KEY_ALGORITHM);
		X509EncodedKeySpec x509KeySpec = new X509EncodedKeySpec(key);
		PublicKey pubKey = keyFactory.generatePublic(x509KeySpec);
		Cipher cipher = Cipher.getInstance(keyFactory.getAlgorithm());
		cipher .init(Cipher.DECRYPT_MODE, pubKey);
		return cipher.doFinal(data);
	}
	
	//取得密钥
	public static byte[] getPrivateKey(Map<String,Object> keyMap) {
		Key key = (Key) keyMap.get(PRIVATE_KEY);
		return key.getEncoded();
	}
	
	//取得公钥
	public static byte[] getPublicKey(Map<String,Object> keyMap) {
		Key key = (Key) keyMap.get(PRIVATE_KEY);
		return key.getEncoded();
	}
	
	public static void main(String[] args) throws Exception {
		Map<String,Object> keyMap = RSAEncrypt.initKey();
		byte[] publicKey = RSAEncrypt.getPublicKey(keyMap);
		byte[] privateKey = RSAEncrypt.getPrivateKey(keyMap);
		System.out.println("生成公钥:\n" + new BigInteger(1,publicKey).toString());
		System.out.println("生成私钥:\n" + new BigInteger(1,privateKey).toString());
		String str = "零基础Java入门到精通";
		System.out.println("原文:" + str);
		byte[] encodData1 = RSAEncrypt.encryptByPrivateKey(str.getBytes(),privateKey);
		System.out.println("加密后的数据为:" + new BigInteger(1,encodData1).toString());
		byte[] decodeData1 = RSAEncrypt.decryptByPublicKey(encodData1,publicKey);
		System.out.println("解密后的数据为:" + new String(decodeData1) + "\n\n");
		
		System.out.println("================反向操作==================");
		
		System.out.println("原文:" + str);
		byte[] encodData2 = RSAEncrypt.encryptByPrivateKey(str.getBytes(), publicKey);//使用公钥加密
		System.out.println("加密后数据:" + new BigInteger(1,encodData2).toString());
		byte[] decodeData2 = RSAEncrypt.encryptByPrivateKey(encodData2, privateKey);//使用公钥加密
		System.out.println("加密后数据:" + new String(decodeData2));
	}
}
