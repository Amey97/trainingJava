package com.wrapperclass;

import java.util.Random;

public class MathTest {

	public static void main(String[] args) {
		double value = -1.6;
		double temp = 25;
		System.out.println(Math.sqrt(temp));
		System.out.println(Math.ceil(value));
		System.out.println(Math.round(value));
		//System.out.format("%.4d", Math.cos(90)); ..... need radian input		
		
//		double random = Math.random();
		Random rand = new Random();
		int a[]={1,2,3,4,5,6};
		System.out.println(rand.nextInt(a.length));
		
	}

}
