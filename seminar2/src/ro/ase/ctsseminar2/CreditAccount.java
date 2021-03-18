package ro.ase.ctsseminar2;

import ro.ase.ctsseminar2.exceptii.IllegalTransferException;
import ro.ase.ctsseminar2.exceptii.InsufficientFundsException;
import ro.ase.ctsseminar2.interfaces.Transferable;

public class CreditAccount extends BankAccount implements Depositable,Withdrawable{

	@Override
	public void deposit(double amount) {
		// TODO Auto-generated method stub
		if (amount>0) {
			this.balance +=amount;
		}		
	}

	@Override
	public void withdraw(double amount) throws InsufficientFundsException {
		// TODO Auto-generated method stub
		if (amount>0) {
			this.balance -=amount;
		}
	}

	

}
