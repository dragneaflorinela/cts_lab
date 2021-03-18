package ro.ase.ctsseminar2;

import ro.ase.ctsseminar2.exceptii.IllegalTransferException;
import ro.ase.ctsseminar2.exceptii.InsufficientFundsException;
import ro.ase.ctsseminar2.interfaces.Transferable;

public class CurrentAccount extends BankAccount implements Depositable, Withdrawable, Transferable {

	
	public static double MAX_CREDIT=5000;
	public NotificationSerive notificationService;
	
	public CurrentAccount() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CurrentAccount(double balance, String iban) {
		super(balance, iban);
		
		// TODO Auto-generated constructor stub
	}
	
	

	public NotificationSerive getNotificationService() {
		return notificationService;
	}

	public void setNotificationService(NotificationSerive notificationService) {
		this.notificationService = notificationService;
	}

	@Override
	public void deposit(double amount) {
		// TODO Auto-generated method stub
		
		this.balance +=amount;
		
		
	}
	
	

	@Override
	public void withdraw(double amount) throws InsufficientFundsException {
		// TODO Auto-generated method stub
		if(this.balance >=amount) {
			this.balance -=amount;
		}
		else {
			throw new InsufficientFundsException("fonduri insuficiente");
		}
		if(this.notificationService != null) {
			this.notificationService.sendNotification("s a extras suma " + amount);
		}
		
		
	}

	@Override
	public void transfer(double amount, Depositable destination) throws IllegalTransferException, InsufficientFundsException{
		// TODO Auto-generated method stub
		if(((BankAccount)destination).iban.equals(this.iban)) {
			throw new IllegalTransferException("conturile coincid");
		}
		else {
			this.withdraw(amount);
			destination.deposit(amount);
		}
		
	}

		

}
