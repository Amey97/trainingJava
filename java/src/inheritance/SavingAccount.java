package inheritance;

public class SavingAccount extends Account {
	long minbalance;

	public SavingAccount(String accountHolder, String accountName, long balance, String accountType) {
		super(accountHolder, accountName, balance, accountType);
		System.out.println("Saving Account Constructor");
		minbalance = 1000;
	}

	public long getMinbalance() {
		return minbalance;
	}

	public void setMinbalance(long minbalance) {
		this.minbalance = minbalance;
	}

	@Override
	public String toString() {
		return "SavingAccount [minbalance=" + minbalance + ", accountNumber=" + accountNumber + ", accountName="
				+ accountName + ", balance=" + balance + ", accountType=" + accountType + "]";
	}

}
