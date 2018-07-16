package edu.yust.ceceom;

import java.io.BufferedReader;
import java.io.File;

import java.io.FileReader;

public class split {

	public static void main(String[] args) throws Exception {
	
		File file = new File("C:/Users/ThinkPad/Desktop/order.txt");
		BufferedReader br = new BufferedReader(new FileReader(file));
		String s = null;
		while ((s = br.readLine()) != null) {
			System.out.println(s.split(",")[1]);
		}
		br.close();
	
	
	}

}

