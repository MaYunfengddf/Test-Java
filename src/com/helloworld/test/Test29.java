package com.helloworld.test;
/*
 * 题目：打印出所有的"水仙花数"，所谓"水仙花数"是指一个三位数，其各位数字立方和等于该数本身。例如：
153是一个"水仙花数"，因为153=1的三次方＋5的三次方＋3的三次方。想当年，做这些题都是网上找答案，如今事过境迁，不会也得会。
 */
public class Test29 {
	public static void main(String[] args) {
		for(int i = 100;i <= 999; i++) {
			int gewei = i % 10;
			int shiwei = i % 100 / 10;
			int baiwei = i % 1000 / 100;
			int x = gewei * gewei * gewei + shiwei * shiwei * shiwei + baiwei * baiwei * baiwei;
			if(i == x) {
				System.out.println(i);
			}
		}
		/*
		 * 题目：一球从100米高度自由落下，每次落地后反跳回原高度的一半；再落下，求它在 第10次落地时，共经过多
少米？第10次反弹多高？ 
		 */
		System.out.println("---------");
		double a = 100.0;
		for(int i = 1;i <= 10;i ++) {
			a /=2;
			System.out.println("第"+i +"次，最高弹" + a + "米");
		}
		/*
		 * 题目：猴子吃桃问题：猴子第一天摘下若干个桃子，当即吃了一半，还不瘾，又多吃了一个 第二天早上又将剩
下的桃子吃掉一半，又多吃了一个。以后每天早上都吃了前一天剩下
的一半零一个。到第10天早上想再吃时，见只剩下一个桃子了。求第一天共摘了多少
		 */
		System.out.println("-------------");
		int n = 1;//第十天的桃子
		System.out.println("一共摘了"+ Test29.number(n));

	}
	public static int number(int n) {

		if(n == 10) {
			return 1;
		}
		return (number(n + 1) + 1) * 2;
	}

	
}
