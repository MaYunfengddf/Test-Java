package com.helloworld.test;

public class GuessANumber extends Thread{
	  private int number;
	   public GuessANumber(int number) {
	      this.number = number;
	   }
	   
	   public void run() {
	      int counter = 0;
	      int guess = 0;
	      do {
	         guess = (int) (Math.random() * 100 + 1);
	         System.out.println("线程" + this.getName() + "当前值为: " + guess);
	         counter++;
	      } while(guess != number);
	      System.out.println("** 线程 " + this.getName() + "in   ：" + counter + "次.**" + guess +"和" + number + "相等");
	      System.out.println("结束程序");
	   }
}
