package com.wrapperclass;

public class PrimeNumber {

	public static void main(String[] args) {
		try {
		boolean flag = true;
		int n = Integer.parseInt(args[0]);
		int m=(int) Math.sqrt(n);
		
		
			if (n<2) {
			System.out.println(n + " is not prime number");
		}

		else {
			for (int i = 2; i <= m; i++) {
				if (n % i == 0) {
					System.out.println(n + " is not prime number");
					flag = false;
					break;
				}

			}
		}
		if (flag) {
			System.out.println(n + " is prime number");
		}}
		catch(Exception e) {
			System.out.println("Exception");
			e.printStackTrace();
		}

	}

}
