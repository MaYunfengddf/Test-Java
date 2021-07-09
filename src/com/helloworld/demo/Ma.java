package com.helloworld.demo;



import java.util.Random;
import java.util.Scanner;

public class Ma {

	public static void main(String[] args) {

		for(;;) {
			Scanner input = new Scanner(System.in);
			System.out.println("欢迎使用xxxxx系统 ");
			System.out.println("1：计算正方形面积");
			System.out.println("2：计算圆形面积");
			System.out.println("3：猜大小");
			System.out.println("4：判断是否闰年");
			System.out.println("5：判断奇偶性");
			System.out.println("输入esc退出程序");
			
			String number = input.nextLine();
			if ("esc".equals(number)){
				System.out.println("程序结束");
				input.close();
				break;
			}
			
			switch (number) {
			case "1":
				dds(number,input);
				break;
			case "2":
				test (number,input);
				break;
			case "3":
				num (number,input);
				break;
			case "4":
				ant (number,input);
				break;
			case "5":
				and (number,input);
				break;
			default:
				System.out.println(number+"......请输入1到5的整数或esc 来选择菜单或退出程序......");
				break;
			}

		}
	}


	/*
	 * 计算正方体面积
	 */
	public static void dds(String number,Scanner input) {
		System.out.println(".....计算正方形面积....."); 
		System.out.println("输入esc返回主菜单");

		for(;;) {
			System.out.println("请输入边长,输入esc返回菜单");
			String q = input.nextLine();
				            	     
			if("esc".equals(q)) {
				System.out.println("返回菜单");
				break;
			}else {    	  
				int w = Integer.parseInt(q);
				int s = w*w;
				System.out.println("正方形面积为"+s);
			} 
			
		}
	}		
	
	
    /*
    * 计算圆形面积
    */
	public static void test(String number,Scanner input) {

		System.out.println(".....计算圆形面积.....");
		System.out.println("输入esc返回主菜单");
		for(;;) {
			System.out.println("请输入半径,输入esc返回菜单");
			String r = input.nextLine();
			if("esc".equals(r)) {
				System.out.println("返回菜单");
				break;
			}else {
				int t = Integer.parseInt(r);
				double y = t*t*3.14;
				System.out.println("圆形面积为："+y);
			}
			
		}
	}

   /*
    * 猜大小
    */
	public static void num(String number,Scanner input) {
		Random  random = new Random();
		int i = random.nextInt(100);
		System.out.println(".....猜大小.....");	 
		System.out.println("输入esc返回主菜单");
		for(;;) {
			String o = input.nextLine();
			System.out.println("请随便输入0到100的整数(输入esc返回菜单)");
			if("esc".equals(o)) {
				break;
			}else if("hellp".equals(o)) {
				System.out.println("当前随机数为："+i);
			}else {
				int p = Integer.parseInt(o);
				if(p<i){
					System.out.println("你猜小了");
				}else if(i<p){
					System.out.println("你猜大了");
				}else if(p == i){
					System.out.println("恭喜你猜中了");
					System.out.println("返回菜单");
					break;
				}
			}  
		
		}
	}
     
	/*
	 * 判断闰年
	 */
	public static void ant(String number,Scanner input) {
		System.out.println(".....判断闰年.....");
		System.out.println("输入esc返回主菜单");
		for(;;) {
			String  p = input.nextLine();
			System.out.println("请随意输入数字 输入esc返回菜单");
			if("esc".equals(p)) {
				System.out.println("返回菜单");
				break;
			}else {
				int l = Integer.parseInt(p);
				if(l % 4 == 0 || l % 400 == 0 &&  l % 100 != 0) {
					System.out.println("是闰年");
				}else {
					System.out.println("不是闰年");
				}	               
			}
		
		} 

	}
     /*
      * 判断奇偶性
      */
	public static void and(String number,Scanner input) { 	
		
		System.out.println(".....判断奇偶性.....");
		System.out.println("输入esc返回主菜单");
		for(;;) {
			String s = input.nextLine();
			System.out.println("请随意输入数字 输入esc返回菜单");
			if("esc".equals(s)) {
				System.out.println("返回菜单");
				break;
			}
			int o = Integer.parseInt(s);
			if(o%2 == 0) {
				System.out.println("您输入的是偶数");
			}else if(o%2 != 0) {
				System.out.println("您输入的是奇数"); 
			} 
		
		}

	}

}


