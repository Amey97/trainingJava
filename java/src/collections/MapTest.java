package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapTest {

	public static void main(String[] args) {
		Map<Integer, String> maping =  new HashMap<Integer, String>();
		maping.put(1, "Monday");
		//maping.put(2, "Tuesday");
		maping.put(3, "Wednesday");
		maping.put(4, "Thrusday");
		maping.put(5, "Friday");
		maping.put(6, "Saturday");
		maping.put(7, "Sunday");
		maping.put(2, "Tuesday");
		maping.put(8, "Tuesday");
		
		System.out.println(maping);
		Set<Integer> keyset = maping.keySet();
		for(Integer key:keyset)
		{
			System.out.println("key = "+key+ " : value "+maping.get(key));
		}
		
		Iterator<Integer> itr = maping.keySet().iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next());
		}
		System.out.println(maping.keySet().toString());
		Iterator<String> it = maping.values().iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		
		System.out.println("--------------------------------");
		Map<Integer, String> tree =  new TreeMap<Integer, String>();
		maping.put(1, "Monday");
		//maping.put(2, "Tuesday");
		maping.put(3, "Wednesday");
		maping.put(4, "Thrusday");
		maping.put(5, "Friday");
		maping.put(6, "Saturday");
		maping.put(7, "Sunday");
		maping.put(2, "Tuesday");
		maping.put(8, "Tuesday");
		
		System.out.println(maping);
		Set<Integer> keyt = maping.keySet();
		for(Integer key:keyt)
		{
			System.out.println("key = "+key+ " : value "+maping.get(key));
		}
	}

}
