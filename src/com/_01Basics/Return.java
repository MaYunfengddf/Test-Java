package com._01Basics;

public class Return {
	String name;
	static int f ;

	public static void main(String[] args) {
		Return r = new Return();
		r.test();
		r.test1();
		
		Return x = new Return();
		x.name = "小李";
		x.f = 5;
		System.out.println(x.test2());
		
		Return y = new Return();
		y.name = "王明";
		y.f = 7;
		System.out.println(y.test2());
		
		Return v = new Return();
		v.name = "李四";
		v.f = 11;
		System.out.println(v.test2());
		
		Return k = new Return();
		k.name = "王五";
		k.f = 28;
		System.out.println(k.test2());
		
		System.out.println(x.test2());
		System.out.println(y.test2());
		System.out.println(v.test2());
	}
	
	public Return(){
		
	}
		
	public void test() {
		int i = 1;
		if(i == 1) {
			System.out.println(i);
			return;
		}
		int x = i;
		x = 2;
		System.out.println(x);
		return;
	}
	
	public int test1() {
		int i = 1;
		if(i ==1) {
			System.out.println(i);
			return i;
		}
		int x = i;
		x = 2;
		System.out.println(x);
		return i;
	}

	public String test2() {
		return "name: " + name + "  f: " + f;
	}
}
