package AccessModifiers;

public abstract class Account implements Depositeable,Withdrawable
{
	private String accountName;
	private String accountType;
	private int balance;
	private int minbalance;
	
	
	protected int getMinbalance() {
		return minbalance;
	}
	protected void setMinbalance(int minbalance) {
		this.minbalance = minbalance;
	}
	public String getAccountName() {
		return accountName;
	}
	public Account(String accountName, String accountType, int balance) {
		super();
		this.accountName = accountName;
		this.accountType = accountType;
		this.balance = balance;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	@Override
	public void withdraw(int amount) {
		// TODO Auto-generated method stub
		int balance = getBalance();
		if(amount >balance)
		{
			//throw error
		}
		else
		{
			setBalance(this.getBalance()-amount);
		}
		
	}
	@Override
	public void deposit(int i) {
		// TODO Auto-generated method stub
		setBalance(this.balance+i);
		
	}
}
