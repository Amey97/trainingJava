package string;

public class StringBuilderTest {

	public static void main(String[] args) {
		
		String s1 = new String("Hello  World Hello World Hello World");
		StringBuilder sb= new StringBuilder("Spaces are at :");
		
		int i = s1.indexOf(" ");
		while (i != -1) {
			sb.append(i);
			i = s1.indexOf(" ", (i + 1));
			if(i!=-1)
			sb.append(",");
		}
		System.out.println(sb+" Index");
	}

}
