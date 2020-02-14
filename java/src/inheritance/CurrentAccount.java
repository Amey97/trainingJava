package inheritance;

public class CurrentAccount extends Account {
	long minbalance;
	public CurrentAccount(String accountHolder, String accountName, long balance, String accountType) {
		super(accountHolder, accountName, balance, accountType);
		System.out.println("Current Account Constructor");
		minbalance=-10000;
	}
	public long getMinbalance() {
		return minbalance;
	}
	public void setMinbalance(long minbalance) {
		this.minbalance = minbalance;
	}
	@Override
	public String toString() {
		return "CurrentAccount [minbalance=" + minbalance + ", accountNumber=" + accountNumber + ", accountName="
				+ accountName + ", balance=" + balance + ", accountType=" + accountType + "]";
	}

	

}
