package jan6;

import java.util.Scanner;

public class ArrayTest {

	public static void main(String[] args) {
		int[] array = { 125, 132, 95, 116, 110 };
		int sum = 0;
		for (int num : array) {
			sum = sum + num;
		}
		System.out.println(sum);
		Scanner sc= new Scanner(System.in);
		String s=sc.nextLine();
		double d= sc.nextDouble();
	}

}
