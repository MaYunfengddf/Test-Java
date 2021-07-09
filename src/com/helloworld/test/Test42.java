package com.helloworld.test;

public class Test42 {
	public static void main(String[] args) {
		try{

			//初始化赋值
			Test41 testA = new Test41();
			testA.setName("向往");
			testA.setAge(18);
			CatAction catActionA = new CatAction();
			catActionA.setEat("学习");
			testA .setCatAction(catActionA);
			System.out.println("复制前为：" + testA);

			//复制后 然后修改入参
			Test41 testB= (Test41)testA.clone();
			System.out.println("复制后为：" + testB);
			testB.setName("xioaming");
			testB.setAge(16);
			CatAction catActionB = testB.getCatAction();
			catActionB.setEat("篮球");
			testB.setCatAction(catActionB);
			System.out.println("修改为：" + testB);
			System.out.println("修改后原来为：" + testA);

			//复制修改后的 然后再次修改入参
			Test41 testC= (Test41)testB.clone();
			testC.setName("小玲");
			testC.setAge(12);
			CatAction catActionC =testC.getCatAction();
			catActionC.setEat("画画");
			testC .setCatAction(catActionC);
			System.out.println("再次修改:" + testC);
			System.out.println("第一次修改来为:" + testB);
			System.out.println("原来为:"+ testA);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
