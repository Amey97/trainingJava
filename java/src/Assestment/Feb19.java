package Assestment;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


import java.io.FileWriter;
import java.io.IOException;

public class Feb19 {

	public static void main(String[] args) {
		try {
			Scanner scanner = new Scanner(new File("D:\\input.txt"));
			while (scanner.hasNextLine()) {
				String s[] = scanner.nextLine().split("\\s");
				 int sub1 = Integer.parseInt(s[2]);
				 int sub2 = Integer.parseInt(s[3]);
				 int sub3 = Integer.parseInt(s[4]);
				 int sub4 = Integer.parseInt(s[5]);
				 int sub5 = Integer.parseInt(s[6]);
				 int sub6 = Integer.parseInt(s[7]);
				

				  int TotalMarks = sub1 + sub2+ sub3+sub4+sub5+sub6;
				  int Percent = (TotalMarks*100) / 600 ;
				 
				String x = (s[0] +"\t" + s[1] + "\t" + TotalMarks + "\t" + Percent );
				usingPath(x);
			}
			scanner.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}}
	

	
	 private static void usingPath(String data) {
	        File file = new File("D:\\Output.txt");
	        FileWriter fr = null;
	        FileWriter fw = null;
	        try {
	            fr = new FileWriter(file,true);
	            fr.write(data);
	            fr.write("\n");
	        } catch (IOException e) {
	            e.printStackTrace();
	        }finally{
	            try {
	                fr.close();
	            } catch (IOException e) {
	                e.printStackTrace();
	            }
}}}