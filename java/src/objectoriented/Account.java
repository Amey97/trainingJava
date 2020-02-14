package objectoriented;


public class Account {
	String AccountHolder;
	String AccountName;
	long balance;
	String AccountType;

	public Account(long balance, String accountType) {
		super();
		this.balance = balance;
		this.AccountType = accountType;
	}

	public Account(String accountName, long balance, String accountType) {
		this.AccountName = accountName;
		this.balance = balance;
		this.AccountType = accountType;
	}

	public long getBalance() {
		return balance;
	}

	@Override
	public String toString() {
		return "Account [AccountHolder=" + AccountHolder + ", AccountName=" + AccountName + ", balance=" + balance
				+ ", AccountType=" + AccountType + "]";
	}

	public void setBalance(long balance) {
		this.balance = balance;
	}

	public void withdraw(int x) {
		setBalance(getBalance() - x);
	}
		
	public void transfer(int x) {
		setBalance(getBalance() + x);
	}
	public void deposit(int v)
	{
		setBalance(getBalance()+v);
	}
	
	public String getAccountType() {
		return AccountType;
	}

	public void setAccountType(String accountType) {
		AccountType = accountType;
	}

	public Account(String accountHolder, String accountName, long balance, String accountType, int account) {
		this.AccountHolder = accountHolder;
		this.AccountName = accountName;
		this.balance = balance;
		this.AccountType = accountType;

	}

}
