package AccessModifiers;

public class SavingAccount extends Account {

	

	public SavingAccount(String accountName, String accountType, int balance) {
		super(accountName, accountType, balance);
		// TODO Auto-generated constructor stub
		setMinbalance(0);
	}

}
