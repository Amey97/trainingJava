package Accounttest;

import AccessModifiers.Account;
import AccessModifiers.CurrentAccount;
import AccessModifiers.SavingAccount;

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account myAccount = new SavingAccount("MyAccount", "Saving", 120000);
		Account yourAccount = new CurrentAccount("Your name", "Currrent", 10000);
	}

}
