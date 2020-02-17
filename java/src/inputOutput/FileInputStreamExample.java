package inputOutput;

import java.io.FileInputStream;

public class FileInputStreamExample {
	public static void main(String args[]) {
		try {
			FileInputStream fin = new FileInputStream("D:\\testout.txt");
			int i = 0;
		//	String s[]= null;
			while ((i = fin.read()) != -1) {
			//	s[i]=(char) fin.read();
				System.out.print(" "+i);
				System.out.print((char) i);
			}
			fin.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}