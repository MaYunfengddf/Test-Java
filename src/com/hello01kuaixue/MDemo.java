package com.hello01kuaixue;

import java.util.Base64;

public class MDemo {
	public static void main(String[] args) {
		try {
			final Base64.Decoder decoder = Base64.getDecoder();
			final Base64.Encoder encoder = Base64.getEncoder();
			String text = "零基础Java从入门到精通";
			final byte[] textByte = text.getBytes("UTF-8");
			final String encodedText = encoder.encodeToString(textByte);
			System.out.println("base64开始加密:" + text);
			System.out.println(encodedText);
			System.out.println("base64开始解密:");
			System.out.println(new String(decoder.decode(encodedText),"UTF-8"));
		}catch (Exception e){
			e.printStackTrace();
		}
	}
}
