package com.hello01kuaixue;
import java.util.Arrays;

public class MultiDimensionArray {
	public static void main(String[] args) {
		String[][] strArray = new String[4][4];
		strArray[0][0] = "零";
		strArray[1][1] = "壹";
		strArray[2][2] = "快";
		strArray[3][3] = "学";
		System.out.println(strArray[3][3]);

		//二维数组
		char[][] charArray = new char[3][];
		charArray[0] = new char[] {'零','壹','快','学'};
		charArray[1] = new char[3];
		charArray[2] = new char[1];
		System.out.println("char类型二维数组:" + Arrays.toString(charArray[0]));
		System.out.println("char类型二维数组:" + Arrays.toString(charArray[1]));
		System.out.println("char类型二维数组:" + Arrays.toString(charArray[2]));

		//二维数组
		String[][] stringArray = new String[3][];
		stringArray[0] = new String[] {"零","壹","快","学"};
		stringArray[1] = new String[3];
		stringArray[2] = new String[1];
		System.out.println("String类型二维数组:" + Arrays.toString(stringArray[0]));
		System.out.println("String类型二维数组:" + Arrays.toString(stringArray[1]));
		System.out.println("String类型二维数组:" + Arrays.toString(stringArray[2]));


		//二维数组
		int[][] intArray = new int[3][];
		intArray[0] = new int[] {1,2,3,5};
		intArray[1] = new int[3];
		intArray[2] = new int[1];
		System.out.println("int类型二维数组:" + Arrays.toString(intArray[0]));
		System.out.println("int类型二维数组:" + Arrays.toString(intArray[1]));
		System.out.println("int类型二维数组:" + Arrays.toString(intArray[2]));
		

		boolean[][] booleanArray = new boolean[3][];
		booleanArray[0] = new boolean[] {true,false,true,true};
		booleanArray[1] = new boolean[3];
		booleanArray[2] = new boolean[1];
		System.out.println("boolean类型二维数组:" + Arrays.toString(booleanArray[0]));
		System.out.println("boolean类型二维数组:" + Arrays.toString(booleanArray[1]));
		System.out.println("boolean类型二维数组:" + Arrays.toString(booleanArray[2]));
		
		Double[][] DoubleArray = new Double[3][];
		DoubleArray[0] = new Double[] {1.0,1.2,1.3,1.5};
		DoubleArray[1] = new Double[3];
		DoubleArray[2] = new Double[1];
		System.out.println("Double类型二维数组:" + Arrays.toString(DoubleArray[0]));
		System.out.println("Double类型二维数组:" + Arrays.toString(DoubleArray[1]));
		System.out.println("Double类型二维数组:" + Arrays.toString(DoubleArray[2]));
		
		double[][] doubleArray = new double[3][];
		doubleArray[0] = new double[] {1.0,1.2,1.3,1.5};
		doubleArray[1] = new double[3];
		doubleArray[2] = new double[1];
		System.out.println("double类型二维数组:" + Arrays.toString(doubleArray[0]));
		System.out.println("double类型二维数组:" + Arrays.toString(doubleArray[1]));
		System.out.println("double类型二维数组:" + Arrays.toString(doubleArray[2]));
		
	}
}
