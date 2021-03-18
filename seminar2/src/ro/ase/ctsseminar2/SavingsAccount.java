package ro.ase.ctsseminar2;

import ro.ase.ctsseminar2.exceptii.IllegalTransferException;
import ro.ase.ctsseminar2.exceptii.InsufficientFundsException;
import ro.ase.ctsseminar2.interfaces.Profitable;
import ro.ase.ctsseminar2.interfaces.Transferable;

public class SavingsAccount extends BankAccount implements Profitable, Depositable, Withdrawable, Transferable{

	
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
		this.balance +=amount;
				
	}
	
	

	@Override
	public void withdraw(double amount) throws InsufficientFundsException {
		// TODO Auto-generated method stub
		if(amount <= this.balance) {
			this.balance -= amount;
		}
		
	}

	@Override
	public void transfer(double amount, Depositable destination)
			throws IllegalTransferException, InsufficientFundsException {
		// TODO Auto-generated method stub
		if(((BankAccount)destination).iban.equals(this.iban)) {
			throw new IllegalTransferException("conturile coincid");
		}else {
			this.withdraw(amount);
			destination.deposit(amount);
		}
	}



	@Override
	public void addInterest(double interest) {
		// TODO Auto-generated method stub
		this.balance *= (1+interest/100);
		
	}



	
	
	

}
