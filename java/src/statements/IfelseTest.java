package statements;

public class IfelseTest {

	public static void main(String[] args) {
		int i=18;
		boolean flag=false;
		//if(i%2==0 || i%3==0 ||i%5==0 )     	....Working
		//{
			if(i%2==0) {
			System.out.println("divisible by 2");
			flag=true;
		}
		if(i%3==0) {
				System.out.println("divisiable by 3");
				flag=true;
		}
		if(i%5==0) {
				System.out.println("divisible by 5");
				flag=true;
		}
		//}
		if(flag==false) {
			System.out.println("not divisible below 10");
		}
	}

}
