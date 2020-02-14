package array;

import java.util.Scanner;

public class Array2d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int a[][]=new int[2][2];
		int b[][]=new int[2][2];
		System.out.println("first array");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				a[i][j]=sc.nextInt();
				
			}
		}
		System.out.println("second array");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				b[i][j]=sc.nextInt();
				
			}
		}
		System.out.println("sum of array");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				System.out.print((b[i][j]+a[i][j])+" ");
				
			}
			System.out.println();
		}

	}

}
