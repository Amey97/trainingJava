package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> weekDayList = new ArrayList<String>();
		weekDayList.add("Monday");
		// weekDayList.add("Tuesday");
		weekDayList.add("Wednesday");
		weekDayList.add("Thrusday");
		weekDayList.add("Friday");
		// weekDayList.add("Sunday");

		List<String> weekendList = new ArrayList<String>();
		weekendList.add("Saturday");
		weekendList.add("Sunday");

		System.out.println("Weekday list print: " + weekDayList);
		weekDayList.add(1, "Tuesday");
		System.out.println("Week day List print after adding element: " + weekDayList);

		List<String> weekList = new ArrayList<String>(weekDayList);
		weekList.addAll(weekendList);
		System.out.println("List after adding two list : " + weekList);

		weekList.add("Monday");
		System.out.println(" \nCheck can contain duplicate elements : " + weekList);

		// Different ways to print

		// way1
		System.out.println("Way 1 of printing : ");
		for (int i = 0; i < weekDayList.size(); i++) {
			System.out.print(weekDayList.get(i));
		}

		System.out.println("\n Way 2 of printing : ");
		// way2
		Iterator<String> ite = weekDayList.iterator();
		while (ite.hasNext()) {
			System.out.print(ite.next());
		}

		System.out.println("\n Way 2 with differtnt approch of printing : ");
		for (Iterator<String> it = weekDayList.iterator(); it.hasNext();)
			System.out.print(it.next());

		// way3
		System.out.println("\n way 3 of printing : ");
		for (String weekdaydata : weekList)
			System.out.print(weekdaydata);

	}

}
