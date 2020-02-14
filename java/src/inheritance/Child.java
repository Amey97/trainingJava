package inheritance;

public class Child extends Parent {

	public void CallMethod(int a) {
		System.out.println("one argument");
	}
	public void CallMethod(int a,int b) {
		System.out.println("two argument");
	}
	public void CallMethod(int a,int b,int c) {
		System.out.println("three argument");
	}
	
}
