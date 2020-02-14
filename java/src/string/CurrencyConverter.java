package string;

public class CurrencyConverter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s= args[0];
		int number =  Integer.parseInt(s.substring(1));
		if(s.startsWith("$"))
		{
			System.out.println("Rupee value " + s + "in RS is ₹"+(number*72));
		}
		else if(s.startsWith("R"))
		{
			System.out.printf("Dollar value of " + s + " in $%.4f",(number/72.0));
		}
		System.out.println(Integer.valueOf(1).equals(Long.valueOf(1)));
	
		System.out.println(Integer.toHexString(65));

	}

}
