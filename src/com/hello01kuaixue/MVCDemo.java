package com.hello01kuaixue;

public class MVCDemo {
	public static void main(String[] args) {
		CatModel cat = gewCatFromDB();
		CatView view = new CatView();
		CatController controller = new CatController(cat,view);
		controller.updateView();
		cat.setName("小黑");
		controller.updateView();
	}
	private static CatModel gewCatFromDB(){
		CatModel cat = new CatModel();
		cat.setName("大白");
		cat.setAge(1);
		return cat;
	}
}
