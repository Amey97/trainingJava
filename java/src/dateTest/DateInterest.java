package dateTest;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class DateInterest {

	public static void main(String[] args) {
		// all things are working
		double r = 0.01;
		int amount = 1000;

		/*
		 * Date d= new Date(); DateFormat df = DateFormat.getDateInstance();
		 * System.out.println(df.toString());
		 */
		Calendar today = new GregorianCalendar();
		int c = today.get(Calendar.DAY_OF_MONTH);
		// int c = Calendar.DAY_OF_MONTH; ,.... all working
		// System.out.println(c+" :"+amount);
		// today.add(Calendar.DAY_OF_MONTH,1);
		// System.out.println(today.get(Calendar.DAY_OF_MONTH));
		// int m = today.get(Calendar.MONTH);
		// System.out.println(m);
		SimpleDateFormat sf = new SimpleDateFormat("dd-MMM-yyyy");
		SimpleDateFormat weekday = new SimpleDateFormat("EEE");
		System.out.println(weekday.format(today.getTime()));
		String month = today.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.getDefault());
		System.out.println(month);
		float temp = amount;
		for (int i = 0; i < 10; i++) {
			today.add(Calendar.DATE, 1);
			if (weekday.format(today.getTime()).equalsIgnoreCase("Sat") || weekday.format(today.getTime()).equalsIgnoreCase("sun")) {
				//System.out.println(weekday.format(today.getTime()));
				continue;
			}
			temp = (float) (temp + temp * r/100);
			System.out.println(sf.format(today.getTime()));
			// ...... Working
			// System.out.printf( "As of Day "+today.get(Calendar.DAY_OF_MONTH)+" Month "+
			// (today.get(Calendar.MONTH)+1)+ " Year "+ today.get(Calendar.YEAR)+" : %.3f
			// \n",temp);
			// System.out.println(today.getDisplayName(Calendar.MONTH, Calendar.LONG,
			// Locale.getDefault()));
			System.out.printf("As of Day " + today.get(Calendar.DAY_OF_MONTH) + " Month "
					+ today.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.getDefault()) + " Year  "
					+ today.get(Calendar.YEAR) + " : %.3f \n", temp);
		}

	}

}
