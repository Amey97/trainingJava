package statements;

public class Array {

	public static void main(String[] args) {
		int B[] = { 1, 2, 3, 7, 9, 7, 6 };
		int A[] = { 1, 2, 3, 4 };
		System.out.print("Third array:");
		int n = B.length;

		if (A.length > B.length) {
			n = A.length;
		}
		int c[] = new int[n];
		for (int i = 0; i < c.length; i++) {
//			c[i]=A[i]+B[i];
			if (A.length > i) {
				c[i] += A[i];
			}
			if (B.length > i) {
				c[i] += B[i];
			}
			System.out.print("\t" + c[i]);
		}

	}

}
