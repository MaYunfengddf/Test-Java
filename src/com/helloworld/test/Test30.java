package com.helloworld.test;
/*
 * 
 * 题目：猴子吃桃问题：猴子第一天摘下若干个桃子，当即吃了一半，还不瘾，又多吃了一个 第二天早上又将剩
下的桃子吃掉一半，又多吃了一个。以后每天早上都吃了前一天剩下
的一半零一个。到第10天早上想再吃时，见只剩下一个桃子了。求第一天共摘了多少
 */
public class Test30 {
	public static void main(String[] args) {

		System.out.println(Test30.getNum(1, 10));
		System.out.println(Test30.getNum(1));
		int n = 3;
		System.out.println(n+"的阶乘值为: "+recursion(n));
	}

	public static int getNum(int num, int day) {    //num为剩下几个桃子，day为第几天
		if (day > 2) {
			return getNum((num + 1) * 2, --day);    //当day>2,重复调用本方法，不断返回上一天的num值
		} 
		return (num + 1) * 2;    //当day=2时，再次返回上一天的num值，此时num就是第一天的桃子总量
	}

	public static int getNum(int num) {
		if(num == 10) {
			return 1;
		}
		return (getNum(num + 1) + 1) * 2;//getNum(1)就是获取第一天的数量，也就是最开始……  getNum(1) = (getNum(2) + 1) * 2
	}										//getNum(2) = (getNum(3) + 1) * 2     getNum(10) = 1  然后回溯求出结果
	

	private static long recursion(int n) {
		long recur = 0;
		if(1 == n)
			recur = 1;
		else
			recur = recursion(n-1)*n;

		return recur;
	}
}
