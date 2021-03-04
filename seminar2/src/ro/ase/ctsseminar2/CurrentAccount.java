package ro.ase.ctsseminar2;

public class CurrentAccount extends BankAccount {

	
	public static double MAX_CREDIT=5000;
	
	public CurrentAccount() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CurrentAccount(double balance, String iban) {
		super(balance, iban);
		
		// TODO Auto-generated constructor stub
	}

	@Override
	public void deposit(double amount) {
		// TODO Auto-generated method stub
		
		this.balance +=amount;
		
	}

	@Override
	public void withdraw(double amount) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void transfer(double amount, Account destination) {
		// TODO Auto-generated method stub
		
	}

	

	

	
	
	

}
