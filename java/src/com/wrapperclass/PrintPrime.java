package com.wrapperclass;

public class PrintPrime {

	public static void main(String[] args) {
		boolean flag = true;
		int n = Integer.parseInt(args[0]);

		for (int i = 2; i <= n; i++) {
			int k = 0;
			for (int j = 2; j < Math.sqrt(i); j++) {
				if (i % j == 0) {
					k++;
					// flag = false;
					// break;
				}
			}

			if (k == 0)
				System.out.print(i + "  ");
		}

	}

}
