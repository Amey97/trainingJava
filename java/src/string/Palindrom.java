package string;

public class Palindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder a= new StringBuilder(args[0]);
		a.reverse();
		if(a.toString().equalsIgnoreCase(args[0]))
		{
			System.out.println("Its is palindrom");
		}
		else
			System.out.println("Its is not palindrom");
	
		
		
		
		String s = "Hello World";
		System.out.println(s.substring(6).charAt(2));

	}
	

}
