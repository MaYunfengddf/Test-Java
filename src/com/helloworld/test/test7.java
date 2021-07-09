package com.helloworld.test;

public class test7 {
	public static void main(String[] args) {
		Integer a = 1 + (-1) ;//0000 1001
		//Byte b = 13;//0000 1101
		//Long c = -6l;//1000 0110
		System.out.println(~a);//1111 0110         1000 1001    1000 1010
		//System.out.println(~b);//1111 0010         1000 1101     1000 1110
		//System.out.println(~c);//1111 1001  1111 1010  0000 0101
		//System.out.println(a instanceof Integer);
		//System.out.println(b instanceof Byte);
		//System.out.println(c instanceof Long);
		//for(int i = 0;i <= 10;i++) {
			//int a = ~i+1;//0000 0001  1111 1110  1000 0001 1000 0010 1111 1101
			//System.out.println(a);
		}//0000 1001 + 1000 0011  补码1111 1100 + 1  1111 1101
	//0000 1001 + 1111 1101
	//1111 1101
	//0000 0110
	/*0000 0001 + 1000 0001  1111 1110 1111 1111
	 * 0000 0001 +1111 1111
	 * 0000 0000
	 * 
	 * 0000 0001+1000 0001  1111 1110  1111 1111
	 * 0000 0000
	 * 1111 1111
	 */
	
	}

