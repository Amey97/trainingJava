package AccessModifiers;

public class CurrentAccount extends Account {

	public CurrentAccount(String accountName, String accountType, int balance) {
		super(accountName, accountType, balance);
		// TODO Auto-generated constructor stub
		setMinbalance(-10000);
		
	}

}
