package string;

import java.util.Random;

public class RandomString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		StringBuilder sb = new StringBuilder();
		String a = "abcdefghijklmnopqrstuvwxyz" + "0123456789" + "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
//		char B[] = a.toCharArray();
		for (int i = 0; i < 8; i++) {
			int j = (int) (Math.random() * a.length());
			char temp = a.charAt(j);
			/*
			 * int j=(int)rand.nextInt(a.length()); char temp = a.charAt(j); ..... working
			 */sb.append(temp);
		}
		System.out.println(sb);
	}

}
