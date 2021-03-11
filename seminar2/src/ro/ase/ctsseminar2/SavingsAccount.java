package ro.ase.ctsseminar2;

import ro.ase.ctsseminar2.exceptii.InsufficientFundsException;

public class SavingsAccount extends BankAccount implements Profitable{

	
	public SavingsAccount() {
		super();
		// TODO Auto-generated constructor stub
	}



	public SavingsAccount(double balance, String iban) {
		super(balance, iban);
		// TODO Auto-generated constructor stub
	}



	@Override
	public void deposit(double amount) {
		// TODO Auto-generated method stub
		
	}
	
	

	@Override
	public void withdraw(double amount) throws InsufficientFundsException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void transfer(double amount, Account destination)
			throws InsufficientFundsException, InsufficientFundsException {
		// TODO Auto-generated method stub
		
	}



	
	
	

}
