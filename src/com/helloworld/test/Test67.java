package com.helloworld.test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class Test67 {
	public static void main(String[] args) {
		try {
		File file = new File("D:/WeGameApps/地下城与勇士/tcls.lst");
		InputStream inputInput = new FileInputStream(file);
		OutputStream inputOutput = new FileOutputStream("D:/dssa.txt");
		int i = 0;
		while(i != -1) {
			i = inputInput.read();
			inputOutput.write(i);
			inputInput.close();
			inputOutput.close();
		}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
