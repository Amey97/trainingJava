package string;

public class UsingIndexof {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s5 = new String("Hello World Hello World Hello World");

		System.out.println(s5.indexOf(100));

		System.out.println(s5.indexOf("r", 2));
		
		System.out.println(s5.indexOf("o"));

		System.out.println(s5.lastIndexOf("d"));

		int i = s5.indexOf(" ");
		// int i=0; .......program to find space using indexof()
//		System.out.println(s5.indexOf(" World",12));
		int j = 1;
		while (i != -1) {
			System.out.println(j + " index  " + i);
			j++;

			i = s5.indexOf(" ", (i + 1));
		}

	}

}
