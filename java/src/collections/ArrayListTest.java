package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> A1=  new ArrayList<Integer>();
		A1.add(0);
		A1.add(1);
		A1.add(2, 2);
		System.out.println(A1);
		A1.add(1, 3);
		System.out.println(A1);
		System.out.println(A1.get(1));
		System.out.println(A1.remove(1));
		System.out.println(A1);

//		System.out.println(A1.sort(c));
		List<String> S1 = new ArrayList<String>();
		S1.add("Amey");
		S1.add("Hello");
		S1.add("Kya");
		S1.add("bola");
		System.out.println(S1);
		
		Iterator<String> it = S1.iterator();
		while (it.hasNext()) {
			System.out.print(it.next());
		}
		System.out.println();
		System.out.println(S1.subList(1, 3));
	}

}
