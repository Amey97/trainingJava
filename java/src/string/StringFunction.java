package string;

public class StringFunction {

	public static void main(String[] args) {
		String s1 = new String(" Hello World Hello World Hello World ");
		System.out.println(s1.replace("o","d"));
		
		System.out.println(s1.split(" "));
		System.out.println(s1.startsWith("H"));
		
		System.out.println(s1.substring(12));
		
		System.out.println(s1.substring(0, 5));
		
		System.out.println(s1.toLowerCase());
		
		System.out.println(s1.toUpperCase());
		
		System.out.println(s1.trim());
		
		
	}

}
