package collections;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;

public class CountWords {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner scan = new Scanner(new File("C:\\Users\\admin\\Documents\\javacount.txt"));
		String s1 = null;
		while(scan.hasNext())
		{
			s1=scan.nextLine();
		}
		String[] Words=s1.split("\\s");
		System.out.println("Number of words :" +Words.length);
		
		Set<String> wordset = new HashSet<String>();
		for(int i=0;i<Words.length;i++)
		{
			wordset.add(Words[i]);
		}
		System.out.println("Distint : "+(wordset.size()));
	}

}
