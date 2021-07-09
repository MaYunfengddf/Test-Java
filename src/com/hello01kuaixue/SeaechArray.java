package com.hello01kuaixue;
//数组查找
import java.util.Arrays;

public class SeaechArray {
	/*public static int searchElement(Object[]array,Object value) {
	*	int i = 0;
	*	for(;i<array.length;i++) {
	*		if(array[i] == value || array[i].equals(value)) {
	*			break;
	*		}
	*	}
	*	if(i == array.length) {
	*		return - 1;
	*	}
	*	return i;
	*}
	*public static void main(String[] args) {
	*	Object array[] = new String[] {"零","壹","快","学"};
	*	System.out.println( (searchElement(array,"学") != - 1? searchElement(array,"学"):"不存在的原属"));
	*	System.out.println( (searchElement(array,"01") != - 1? searchElement(array,"01"):"不存在的原属"));
	*}
	*/
	public static  int searchElement(Object[]array,Object value) {
		return Arrays.binarySearch(array,value);
	}
	public static void main(String[] args) {
		Object array[] = new String[] {"零","壹","快","学"};
		System.out.println((searchElement(array,"学") != - 1 ? searchElement(array,"学"):"不存在该元素"));
		System.out.println((searchElement(array,"01") != - 1 ? searchElement(array,"01"):"不存在该元素"));
	}
}
