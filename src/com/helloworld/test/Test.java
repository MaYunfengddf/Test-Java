package com.helloworld.test;
import java.util.Scanner;
import java.util.Random;

public class Test {

	public static void test(int number) {
		for(;;) {
			Scanner input=new Scanner(System.in);
		
		System.out.println("欢迎使用嘻嘻嘻系统");
		System.out.println("输入1到5来选择菜单内容 ，输入“esc”退出程序");
		System.out.println("1:猜大小");
		System.out.println("2:判断闰年");
		System.out.println("3:判断奇偶性");
		System.out.println("4:计算正方形面积");
		System.out.println("5:计算圆形面积");
			if ("esc".equals(number)){
				System.out.println("程序结束");
				break;
			}
			if(number== 1) {
					Random  random = new Random();
					int i = random.nextInt(100);
					System.out.println(".....猜大小.....");	 
					for(;;) {
						String o=input.nextLine();
						System.out.println("请随便输入0到100的整数(输入esc返回菜单)");
						if("esc".equals(o)) {
							break;
						}else if("hellp".equals(o)) {
							System.out.println("当前随机数为："+i);
						}else {
							int p=Integer.parseInt(o);
							if(p<i){
								System.out.println("你猜小了");
							}else if(i<p){
								System.out.println("你猜大了");
							}else if(p==i){
								System.out.println("恭喜你猜中了");
								System.out.println("返回菜单");
								break;
							}
						}   
	
					}	if(number==2 ) {

			
				System.out.println(".....判断闰年.....");	    
				for(;;) {
					String p=input.nextLine();
					System.out.println("请随意输入数字 输入esc返回菜单");
					if("esc".equals(p)) {
						System.out.println("返回菜单");
						break;
					}else {
						int l=Integer.parseInt(p);
						if(l%4==0||l%100!=0 && l%400 == 0) {
							System.out.println("是闰年");
						}else {
							System.out.println("不是闰年");
						}	               
					}

				} 
				break;
				}
					break; 
				}
			

			    if( number==3)    {    	      
				       System.out.println(".....判断奇偶性.....");
				for(;;) {
					String s=input.nextLine();
					System.out.println("请随意输入数字 输入esc返回菜单");
					if("esc".equals(s)) {
						System.out.println("返回菜单");
						break;
					}
					int o=Integer.parseInt(s);
					if(o%2==0) {
						System.out.println("您输入的是偶数");
					}else if(o%2!=0) {
						System.out.println("您输入的是奇数"); 
					} 

				}
				break;
				}
			    if( number==4) {
				    System.out.println(".....计算正方形面积.....");  
				for(;;) {
					String q=input.nextLine();
					System.out.println("请输入边长");	            	     
					if("esc".equals(q)) {
						System.out.println("返回菜单");
						break;
					}else {    	  
						int w=Integer.parseInt(q);
						int s=w*w;
						System.out.println("正方形面积为"+s);
					}
				}
				break;
				}
			    if( number==5) {
				System.out.println(".....计算圆形面积.....");
				for(;;) {
					System.out.println("请输入半径");
					String r=input.nextLine();
					if("esc".equals(r)) {
						System.out.println("返回菜单");
						break;
					}else {
						int t=Integer.parseInt(r);
						double y=t*t*3.14;
						System.out.println("圆形面积为："+y);
					}
				}
				}
		}
	}

         public static void main(String[] args) {
	            Scanner input=new Scanner(System.in);
		        String  data = input.nextLine();
              int number=Integer.parseInt(data);
			  switch (number) {
				case 1:
					test(number);
				case 2:
					test (number);
				case 3:
					test (number);
				case 4:
					test (number);
				case 5:
					test (number);
				default:
				    System.out.println(number+"......请输入1到5的整数或esc 来选择菜单或退出程序......");
	         }
	
                   input.close();
		}
        
         }	