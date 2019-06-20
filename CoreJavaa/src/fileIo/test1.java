package fileIo;

import java.io.*;

public class test1 {

	public static void main(String[] args) {
		File f = new File("abc");
		String[] s = f.list();
		int count = 0;
		for (String s1 : s) {
			File f1 = new File(f, s1);
			if (f1.isDirectory()) {
				count++;
				System.out.println(s);
			}
		}
		System.out.println(count);

	}

}
