package inputOutput;

import java.io.FileOutputStream;

public class FileOutputStreamExample {
	public static void main(String args[]) {
		try {
			FileOutputStream fout = new FileOutputStream("D:\\myfile.txt");
			String s = "Hello World ♦";
			byte b[] = s.getBytes();
			fout.write(b);
			fout.close();
			System.out.println("Done...");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}