package inheritance;

public class Account {
	String accountNumber;
	String accountName;
	long balance;
	String accountType;

	public Account(String accountHolder, String accountName, long balance, String accountType) {
		//super();
		System.out.println(" Account Constructor");
		this.accountNumber = accountHolder;
		this.accountName = accountName;
		this.balance = balance;
		this.accountType = accountType;
	}

}
