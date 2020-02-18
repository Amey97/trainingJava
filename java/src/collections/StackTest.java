package collections;

import java.util.Stack;

public class StackTest {

	public static void main(String[] args) {

		Stack st=new Stack();
		st.push("amey");
		st.push("A");
		st.push(56);
		System.out.println(st);
		st.pop();
		System.out.println(st);
	}

}
