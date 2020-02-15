package com.Assignment2;

import java.util.*;
import java.io.*;

public class LoanManagement {
	private long custId;
	private String custName;
	private String address;
	private long mobile;
	private String email;
	static int id = 0;
	static String Customer[][] = new String[2][4];
	public static void main(String[] args) {
		
		
		System.out.println("XYZ Finance Company welcomes you\n\t1.Register Customer\n\t 2.Exit");
		int ch=0;
		Scanner sc= new Scanner(System.in);
		while(true) {
			ch=sc.nextInt();
		switch(ch)
		{
		case 1: Registraion();
		break;
		case 2:System.out.println("Exited"); 
			System.exit(0);
		break;
		default: System.out.println("Enter valid Input");
		}
		}
	}
	
	static void Registraion() 
	{
		
	}

}
