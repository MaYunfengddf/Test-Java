package com.hello01kuaixue;

public class CatController {
	private CatModel cat;
	private CatView view;
	public CatController(CatModel cat,CatView view) {
		this.cat = cat;
		this.view = view;
	}
	public void setCat(CatModel eat) {
		this.cat = cat;
	}
	public CatModel getCat() {
		return cat;
	}
	public void setiew(CatView view) {
		this.view = view;
	}
	public CatView getView() {
		return view;
	}
	public void updateView() {
		view.privateCatInfo(cat);
	}
}
