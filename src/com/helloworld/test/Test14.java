package com.helloworld.test;

public class Test14 {

	public static void main(String[] args) {
		
		int n = 4;			// 要移动的圆盘数量
		String a = "A";		// A塔
		String b = "B";		// B塔
		String c = "C";		// C塔
		
		new Test14().move(n, a , b, c);	// 把n个圆盘从A通过B移动到C
	}
	
	/**
	 * 把n个圆盘从A塔通过B塔移动到C塔
	 * @param n 要移动的圆盘数量
	 * @param a 圆盘所在的塔
	 * @param b 辅助用的塔
	 * @param c 要移动到的目标塔
	 */
	public void move(int n, String a, String b, String c) {
		if(n == 1) {
			System.out.println(a + " -> " + c);	// 只有一个要移动的圆盘时，直接从A移动到C
		}else {
			move(n - 1, a, c, b);				// 把前n - 1个圆盘从A通过C移动到B
			System.out.println(a + " -> " + c);	// 再把第n个（最后一个）从A移动到C
			move(n - 1, b, a, c);				// 最后把在B上的n - 1个从B上通过A也移动到C
		}
	}
	
}
