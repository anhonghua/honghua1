

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class y {

	public static void main(String[] args) throws Exception {
		File file = new File("C:/Users/ThinkPad/Desktop/order.txt");
		FileInputStream fi2 = new FileInputStream(file);
		int ch2;
		byte[] bt = new byte[1024];
		int i = 0;
		while((ch2 = fi2.read())!= -1) {
			bt[i] = (byte)ch2; 
			i++;
		}
		System.out.print(new String(bt));
		fi2.close();
		

	}

}
