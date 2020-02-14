package dateTest;

import java.util.StringTokenizer;

public class StringTokenTest {

	public static void main(String[] args) {
																				//..... if we dont provide a , the it make token default by space
		StringTokenizer sc = new StringTokenizer("I am here to ma,ke my technic,al skill strong",",");
		System.out.println(sc.countTokens());
		System.out.println(sc.hasMoreTokens());
		while(sc.hasMoreTokens())
		System.out.println(sc.nextElement());
	}

}
