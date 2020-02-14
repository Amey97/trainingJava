package statements;

public class whileTest {

	public static void main(String[] args) {
		int n = 6,fact=1;
		do {
		fact*=n;
		--n;
		}while (n >= 1);
		System.out.println("Factorial of is : "+fact);
	}

}
