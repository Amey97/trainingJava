package inheritance;

public class AccountTest {

	public static void main(String[] args) {
		Account myaccount = new SavingAccount("sdfnhfk", "Amey", 20000, "Saving");
		Account youraccount = new CurrentAccount("dskfjklj", "ABcurrent", 10000, "Current");
	
		System.out.println(myaccount.toString());
		System.out.println(youraccount.toString());
	}

}
