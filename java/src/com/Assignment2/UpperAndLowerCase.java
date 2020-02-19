package com.Assignment2;
import java.util.Arrays;

public class UpperAndLowerCase 
{ 
	public static String sortString(String inputString) 
	{ 
		char tempArray[] = inputString.toCharArray(); 
		
		Arrays.sort(tempArray); 
		
		return new String(tempArray); 
	} 
	
	public static void main(String[] args) 
	{ 
		String inputString = "ameyameya"; 
		String outputString = sortString(inputString);
		int i = outputString.length();
		int len=0;
		if(i%2==0)
		{
			len = (i/2);
		}
		else
		{
			len = (i/2) +1 ;
		}
		String s1a = outputString.substring(0, (len));
		String s1b = outputString.substring((len));
		
		System.out.println("Input String : " + inputString); 
		System.out.println("Sorted  String : " + outputString); 
		
		System.out.print("Output String : ");
		System.out.print(s1a.toUpperCase());
		System.out.println(s1b.toLowerCase());
	} 
} 
