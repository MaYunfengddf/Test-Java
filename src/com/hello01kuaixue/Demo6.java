package com.hello01kuaixue;

import java.io.*;

public class Demo6 {
	public static void main(String[] args) {
		testDataOutputStream();
		testDataInputStream();
	}


	private static void testDataOutputStream() {
		try {
			File file = new File("data.txt");
			DataOutputStream out = new DataOutputStream(new FileOutputStream(file));
			System.out.println("开始写入数据");
			out.writeBoolean(true);
			out.writeByte((byte) 0x11);
			out.writeChar((char)0x5133);
			out.writeShort((short)0x4146);
			out.writeInt(0x23456789);
			out.writeLong(0x0FEDCBA123456789L);
			out.writeUTF("零壹快学");
			out.close();
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(SecurityException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	
	private static void testDataInputStream() {
		try {
			File file = new File("data.txt");
			DataInputStream in = new DataInputStream(new FileInputStream(file));
			System.out.println("读取数据");
			System.out.printf("readShort():0x%s\n",shortToHexString(in.readShort()));
			System.out.printf("readInt():0x%s\n",Integer.toHexString(in.readInt()));
			System.out.printf("readLong():0x%s\n",Long.toHexString(in.readLong()));
			System.out.printf("readBoolean():0x%s\n",in.readBoolean());
			System.out.printf("byteToHexString(0x8F):0x%s\n",byteToHexString((byte)0x8F));
			System.out.printf("charToHexString(0x8FCF):0x%s\n",charToHexString((char)0x8FCF));
			System.out.printf("readByte():0x%s\n",byteToHexString(in.readByte()));
			System.out.printf("readChar():0x%s\n",charToHexString(in.readChar()));
			System.out.printf("readUTF():%s\n",in.readUTF());
			in.close();
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(SecurityException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	private static String byteToHexString(byte val) {
		return Integer.toHexString(val & 0xff);
	}
	
	private static String charToHexString(char val) {
		return Integer.toHexString(val);
	}
	
	private static String shortToHexString(short val) {
		return Integer.toHexString(val & 0xffff);
	}
}
