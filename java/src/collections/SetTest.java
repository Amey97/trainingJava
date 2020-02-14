package collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {

	public static void main(String[] args) {
		Set<Integer> intset = new HashSet<Integer>();
		intset.add(4);
		intset.add(5);
		intset.add(4);
		intset.add(null);
		intset.add(null);
		intset.add(new Integer(6));
		intset.add(2); //// always print in accending
		//System.out.println(intset.size());
		
		for(Integer inte : intset)
			System.out.println(inte);
		System.out.println("------------------------------------");
		
		Set<Integer> intsettree = new TreeSet<Integer>();
		intsettree.add(5);
		intsettree.add(4);
		intsettree.add(new Integer(6));
		intsettree.add(2); //// always print in accending
		//System.out.println(intsettree.size());
		
		for(Integer inte : intsettree)
			System.out.println(inte);
		
		
	}

}
