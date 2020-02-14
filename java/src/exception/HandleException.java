package exception;


public class HandleException {

	private static Object obj2;

	public static void main(String[] args) {
		try {
		java.lang.Object obj1= new Integer(0);
			System.out.println((String)obj1);
			
			obj2 = null;
			System.out.println(obj2.toString());
			System.out.println(10/0);
			
			String str = "abcd";
			System.out.println(str.charAt(10));
			
			int arr[] = {1,2,3,4,5};
			System.out.println(arr[10]);
			
		}catch (ArithmeticException e) {
			// TODO: handle exception
			e.printStackTrace();
			
			System.out.println("Arithmetic ");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array out of Bound");
		}
		catch (ClassCastException e) {
			// TODO: handle exception
			System.out.println(" Class cast");
		}
		
	}

}
