package com._01Basics;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//2.第二题 已知有十六支男子足球队参加2008 北京奥运会。写一个程序，把这16 支球队随机分为4 个组。采用List集合和随机数
//
//2008 北京奥运会男足参赛国家： 
//
//科特迪瓦，阿根廷，澳大利亚，塞尔维亚，荷兰，尼日利亚、日本，美国，中国，新西 兰，巴西，比利时，韩国，喀麦隆，洪都拉斯，意大利

public class TestList {
	public static void main(String[] args) {
		try {
			List<String> list = new ArrayList<>();
			list.add("科特迪瓦");
			list.add("阿根廷");
			list.add("澳大利亚");
			list.add("塞尔维亚");
			list.add("荷兰");
			list.add("日本");
			list.add("美国");
			list.add("中国");
			list.add("新西兰");
			list.add("比利时");
			list.add("韩国");
			list.add("喀麦隆");
			list.add("洪都拉斯");
			list.add("意大利");
			
			Random random = new Random();
			int size = list.size();
			for(int index = 0; index < size; index++) {

				if(index % 4 == 0)
					System.out.println(String.format("\r\n第%s组：", index / 4));
					
				int n = random.nextInt(list.size());
				System.out.print(list.get(n) + "    ");
				list.remove(n);
				
			}
			
			
			
//			//list集合长度的一位数组
//			int[] in = new int[list.size()];
//			//随机数
//			Random random = new Random();
//			//控制组数
//			for(int i = 1;i <= 4;i++) {
//				System.out.println("第" + i+ "组");
//
//				//控制每组内的个数
//				for(int y = 0;y < 4;y++) {
//
//					//生成的随机数 范围是List集合的长度
//					int x = random.nextInt(list.size());
//
//					//定义一个调用一次实现自增的整形
//					int w = 0;
//
//					//int 数组未包含的随机数返回false 数组包含返回true 然后判断取反
//					if(!test(in,w,x)) {
//
//						//调取list集合指定下标 提取出来
//						String str = list. get(x);
//						in[w] = x;
//						//输出提取list集合内元素
//						System.out.print(str + "  ");
//					}else {
//						System.out.print("aaan  ");
//					}
//				}
//				System.out.println();
//			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	//生成重复的数
//	public static boolean test(int[] in,int w,int x) {
//		for(int e = 0;e < in.length;e++) {
//			//判断int数组内是否存在改随机数 
//			if(in[e] == x) {
//				in[w++] = x;
//
//				//数组内不存在本次随机数返回true;
//				return true;
//			}
//		}
//
//		//数组内存在本次生成的随机数返回false;
//		return false;
//	}
}
