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
	static int loanid = 1;
	private static Scanner sc;
	static String Customer[][] = new String[2][4];
	public static void main(String[] args) {
		
		
		System.out.println("XYZ Finance Company welcomes you\n\t1.Register Customer\n\t 2.Exit");
		int ch=0;
		sc= new Scanner(System.in);
		while(true) {
			ch=sc.nextInt();
		switch(ch)
		{
		case 1: id++; 
			Registraion(id);
		break;
		case 2:System.out.println("Exited"); 
			System.exit(0);
		break;
		default: System.out.println("Enter valid Input");
		}
		}
	}
	
	static void Registraion(int id) 
	{
		System.out.println("Enter details:");

		System.out.println("Name :");
		Customer[id][0] = sc.next();

		System.out.println("Mobile Number :");
		Customer[id][1] = sc.next();

		System.out.println("Address :");
		Customer[id][2] = sc.next();

		System.out.println("Customer Information saved successfully\nYour Customer Id is : XYZ_00" + id);

		System.out.println("-------------------------------------");
		System.out.println("do you eish to apply for loan? ans in Yes/no");
		
		String choice = sc.next();
		if(choice.equalsIgnoreCase("yes"))
		{
			Loan();
		}
		else
		{
			System.out.println("Exit");
			System.exit(0);
		}
	}
	
	static void Loan() {
		System.out.println("Enter the loan amount");
		double amount = sc.nextDouble();
		System.out.println("Enter the loan duration in months");
		int duration=sc.nextInt();
		float r= (float)9.5/100;
		double emi = amount * r * (1+r)* duration / ((1+r)*duration -1);
		
		System.out.println("Your EMI for "+ amount+" and duration is"+emi);
		System.out.println(" You want to get the loan? reply in Yes/No");
		String loanch=sc.nextLine();
		if(loanch.equalsIgnoreCase("yes"))
		{
			System.out.println("Your loan id is "+ loanid);
		}
		else {
			//int tempId = sc.nextInt();
			System.out.println("Name :" + Customer[id][0]);

			System.out.println("Mobile Number :" + Customer[id][1]);

			System.out.println("Address :" + Customer[id][2]);
		

			System.out.println("-------------------------------------");
		}
		
	}

}
