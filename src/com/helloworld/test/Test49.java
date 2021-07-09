package com.helloworld.test;

public class Test49 {

	public static void main(String[] args) {

		Hand hand = new Hand();
		hand.setItem("苹果");
		System.out.println("手中拿的:" + hand.getItem());
		
		Hand2<String> hand2 = new Hand2<String>();
		hand2.setItem("苹果");
//		hand2.setItem(1);
		System.out.println("手中拿的:" + hand2.getItem());
		
		Hand2<Integer> hand3 = new Hand2<Integer>();
//		hand3.setItem("苹果");
		hand3.setItem(1);
		System.out.println("手中拿的:" + hand3.getItem());
		
		Hand2<Cat> hand4 = new Hand2<Cat>();
//		hand4.setItem("苹果");
//		hand4.setItem(1);
		hand4.setItem(new Cat(3, "彩色"));
		System.out.println("手中拿的:" + hand4.getItem());
	}
	
}
