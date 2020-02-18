package assessment;

import java.nio.MappedByteBuffer;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Amey18feb {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<Integer, String> maping = new HashMap<Integer, String>();
		maping.put(1, "Mannyata");
		maping.put(3, "Mannyata");
		maping.put(4, "Mannyata");
		maping.put(5, "Mannyata");
		maping.put(6, "Electronic City");
		maping.put(7, "Electronic City");
		maping.put(9, "Electronic City");
		maping.put(8, "Electronic City");

		System.out.println(maping);
	//	System.out.println(maping.containsValue("Mannyata"));

		System.out.println("Enter location : ");
		String S1 = sc.nextLine();
		Iterator<String> it = maping.values().iterator();
		while (it.hasNext()) {
			if (it.next().equalsIgnoreCase(S1)) {
				System.out.println("Cars avaailable at the location");

				System.out.println(it.next());
				System.out.println("Cab booked");
				break;
			}
			else {
				System.out.println("cars not avaliable");
				break;
			}

		}

	}

}
