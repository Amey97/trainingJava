package com.assignment;

import java.util.Scanner;

public class ArrayMultiplication {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int A[][]= {{1,2,3},{4,5,6},{7,8,9}};
		int B[][]= {{1,2,3},{4,5,6},{7,8,9}};
		
		int C[][]=new int[A.length][B[0].length];
		
		for (int i = 0; i < C.length; i++) {
			for (int j = 0; j < C.length; j++) {
				for (int k = 0; k < C.length; k++) {
					C[i][j] +=A[i][k]*B[k][j];
				}
			} 
		}
		for (int i = 0; i < C.length; i++) {
			for (int j = 0; j < C.length; j++) {
				System.out.print(C[i][j]+" ");
			}
			System.out.println();
		}
	}

}
