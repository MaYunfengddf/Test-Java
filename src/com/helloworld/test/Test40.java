package com.helloworld.test;
import com.hello01kuaixue.CatAction;

public class Test40 {
	public static void main(String[] args) {
		try{

			//初始化赋值
			Test39 test = new Test39();
			test.setName("向往");
			test.setAge(18);
			CatAction catAction = new CatAction();
			catAction.setEat("学习");
			test .setcatAction(catAction);
			System.out.println("复制前为：" + test);

			//复制后 然后修改入参
			Test39 test1= (Test39)test.clone();
			System.out.println("复制后为：" + test1);
			test1.setName("xioaming");
			test1.setAge(16);
			CatAction catAction1 = test1.getCatAction();
			catAction1.setEat("篮球");
			test .setcatAction(catAction1);
			System.out.println("修改为：" + test1);
			System.out.println("修改后原来为：" + test);

			//再次复制后修改入参
			Test39 test2= (Test39)test1.clone();
			test2.setName("小玲");
			test2.setAge(12);
			CatAction catAction2 =test2.getCatAction();
			catAction2.setEat("画画");
			test .setcatAction(catAction2);
			System.out.println("再次修改:" + test2);
			System.out.println("第一次修改来为:" + test1);
			System.out.println("原来为:"+ test);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}


