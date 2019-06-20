package fileIo;

import java.io.*;

public class FileReaderDemo {

	public static void main(String[] args) throws IOException {

		File f = new File("abc.txt");
		// f.createNewFile();
		FileWriter fw = new FileWriter(f, true);
		BufferedWriter bw = new BufferedWriter(fw);
		PrintWriter pw=new PrintWriter(bw);
		pw.println("Hello Brother");
		pw.println("I am like 1500 years old.");
		pw.println(65);
		pw.flush();
		pw.close();

		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		// char[] ch = new char[(int) f.length()];
		// br.read(ch);
		String s = br.readLine();
		while (s !=null) {
			
			
			System.out.println(s);
			s = br.readLine();
		}
		br.close();

	}

}
