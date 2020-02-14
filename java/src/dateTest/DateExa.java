package dateTest;
import java.io.ObjectInputStream.GetField;
import java.util.*;
public class DateExa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d= new Date();
//		System.out.println(getDay());
		System.out.println(d.toString());
		System.out.println();
	
		@SuppressWarnings("deprecation")
		Date dp = new Date(1997,1,27);
		
		int c = Calendar.DAY_OF_MONTH;
		System.out.println(c);
		System.out.println(d.compareTo(dp));
		System.out.println(d.equals(dp));
		System.out.println(d.after(dp));
		System.out.println(d.before(dp));
		System.out.println(d.clone());
		
		
	}

}
