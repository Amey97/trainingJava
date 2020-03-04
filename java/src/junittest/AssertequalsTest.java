package junittest;


public class AssertequalsTest {
// function 1 to find max number 
	public static int findMax(int arr[]) {
		int max=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(max<arr[i])
			{
				max=arr[i];
			}
		}
		return max;
	}
	// function 2 to find cube
	public static int cube(int n) {
		return n*n*n;
	}

}
