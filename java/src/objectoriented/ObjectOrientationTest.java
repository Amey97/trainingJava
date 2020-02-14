package objectoriented;

public class ObjectOrientationTest {
	public static void main(String[] args) {
		Account acc = new Account("amey", 100, "saving");
		System.out.println(acc.AccountName);
		System.out.println(acc.AccountType);
		System.out.println(acc.balance);
		System.out.println(acc.toString());
		acc.withdraw(10);
		System.out.println(acc.balance);
		Account myacc = new Account(1000, "Saving");
		
		System.out.println(myacc.getBalance());
		myacc.withdraw(100);
		acc.deposit(100);
		System.out.println("my acc :"+myacc.getBalance());
		System.out.println("acc :"+acc.getBalance());
	}
}
