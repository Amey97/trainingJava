package string;

public class DifferenceofEqual {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = new String("Hello");
		String s2 = new String("Hello");

		String s4 = "Hello";
		String s3 = "Hello";
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));

		System.out.println(s3 == s4);
		System.out.println(s1 == s4);
		System.out.println(s1.equals(s4));

	}

}
