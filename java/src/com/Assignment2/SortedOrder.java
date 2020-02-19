package com.Assignment2;


import java.util.Arrays;
import java.util.Scanner;

public class SortedOrder {
	public static void main(String[] args) {
        int[] arr1=new int[5];
        int[] reversed=new int[5];
        System.out.println("Enter 5 elements " );
        for(int i=0;i<5;i++)
        {
        	Scanner sc=new Scanner(System.in);
        	arr1[i]=sc.nextInt();
        }
        System.out.print("Reversed Number of array are: ");
        for(int i=0;i<5;i++)
        {
        while(arr1[i] != 0) {
            int digit = arr1[i] % 10;
            reversed[i] = reversed[i] * 10 + digit;
            
            arr1[i] /= 10;
          
        }
       System.out.print(reversed[i] +" ");
       
        }
       Arrays.parallelSort(reversed);
       System.out.println("\n Sorted array is="+Arrays.toString(reversed));
	}
}
