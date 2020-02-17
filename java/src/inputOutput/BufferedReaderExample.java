package inputOutput;

import java.io.*;

public class BufferedReaderExample {
	public static void main(String args[]) {
		try {
			FileReader fin = new FileReader("D:\\test.txt");
			BufferedReader bin = new BufferedReader(fin);
			// int s=bin.read();
			int i;
			while ((i = bin.read()) != -1) {
				System.out.print((char) i);
			}
			bin.close();
			fin.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}