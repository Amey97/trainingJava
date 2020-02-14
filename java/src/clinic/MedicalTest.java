package clinic;

import java.util.Scanner;

public class MedicalTest {
	static int id = 0;
	static String Stock[] = new String[2];
	static String record[][] = new String[2][4];
	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		while (true) {
			int ch = 6;
			System.out.println(
					" 1. for registration \n 2. Book appoiment \n 3. health History \n 4generate today's patient report  \n 5. medicine Stock \n 6 for exit");
			ch = sc.nextInt();
			switch (ch) {
			case 1: {
				id++;
				registration(id);
				break;
			}
			case 2: {
				appoiments();
				break;
			}
			case 3: {
				health();
				break;
			}
			case 4: {
				generateReport();
				break;
			}
			case 5: {
				checkStock();
			}
			default: {
				System.out.println("Enter valid value");
				ch = 6;

			}
			}
		}
	}

	public static void registration(int id) {
		System.out.println("Enter patient details:");

		System.out.println("Name :");
		record[id][0] = sc.next();

		System.out.println("Mobile Number :");
		record[id][1] = sc.next();

		System.out.println("Address :");
		record[id][2] = sc.next();

		System.out.println("Registration completed\n Note down your patient id : " + id);

		System.out.println("-------------------------------------");
	}

	public static void appoiments() {
		System.out.println("Enter your patient id :");
		int tempId = sc.nextInt();
		System.out.println("Available doctor\n 1. Dr.Bhatra \n 2. Dr.Pande");
		System.out.println("select one of the avalible dr to book appoiment");
		String doc = new String();
		int drid = sc.nextInt();
		if (drid == 1) {
			doc = "Dr.Bhatra";
		} else {
			doc = "Dr.Pande";
		}
		record[tempId][3] = doc;

		System.out.println("Appoimenent Booked");

		System.out.println("-------------------------------------");
	}

	public static void health() {
		System.out.println("Enter your patient id to check health history:");
		int tempId = sc.nextInt();
		System.out.println("Name :" + record[tempId][0]);

		System.out.println("Mobile Number :" + record[tempId][1]);

		System.out.println("Address :" + record[tempId][2]);
		System.out.println("Doctor :" + record[tempId][3]);

		System.out.println("-------------------------------------");
	}

	public static void generateReport() {
		for (int i = 1; i <= id; i++) {

			System.out.println("patient Number:" + i);
			System.out.println("Name :" + record[i][0]);

			System.out.println("Mobile Number :" + record[i][1]);

			System.out.println("Address :" + record[i][2]);
			System.out.println("Doctor :" + record[i][3]);

			System.out.println("-------------------------------------");
		}
	}

	public static void checkStock() {
		System.out.println("All medicine are in stock");
	}
}
