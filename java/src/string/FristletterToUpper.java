package string;

public class FristletterToUpper {

	public static void main(String[] args) {
		String s1 = new String("hello worlD hello world hello world");

		/*
		 * int i = 1; while (i != -1) {
		 * 
		 * //int j = 0; sb = sb + s1.substring((i), (i+1)).toUpperCase(); i =
		 * s1.indexOf(" ", (i + 1)); //j = i - 1; }
		 */
		String words[]=s1.split("\\s");  
	    String cWord=" ";  
	    for(String w:words){  
	        String a=w.substring(0,1);  
	        String b=w.substring(1).toLowerCase();  
	        cWord+=a.toUpperCase()+b+" ";  
	    }  
		
//		sb = s1.substring(0, 1).toUpperCase();

		System.out.println(cWord.trim());
	}

}
