package inputOutput;

import java.io.FileWriter;
import java.io.Writer;

public class WriterExample {

	public static void main(String[] args) {
		try {
			Writer w =  new FileWriter("D:\\myfile.txt");
			String content = "Good bye";
			w.write(content);
			w.close();
			System.out.println("Done...");
		}
		catch (Exception e) {
			e.printStackTrace();
		}

	}

}
