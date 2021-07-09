package com.helloworld.test;
import com.helloworld.test.Test11;

public class Test11 { 
	int i = 1;
	public static void main(String[] args) {
		int num = 0;
		Test11 test = new Test11();
//		int a = test.number(num);
//		int a = test.number();
//		int a = test.number(0, 0);
		int a = test.number(10);
		System.out.println(a);
	}

//	public int number(int num) {
//		num = num +i;
//		if(i == 10) {
//			System.out.println(num+"das");
//			return num;
//		}
//		i++;
//		return number(num);
//		
//	}
	
	public int number() {
		int result = 0;
		for(int n = 0; n <= 10; n++) {
			result += n;
		}
		return result;
	}
	
	public int number(int result, int n) {
		result += n;
		if(n < 10) {
			result = number(result, ++n);
		}
		return result;
	}
	
	/**
	 * 计算0~n之和
	 * @param n
	 * @return
	 */
	public int number(int n) {
		if(n == 1)
			return 1;
		else
			return n + number(n - 1);
	}
}
