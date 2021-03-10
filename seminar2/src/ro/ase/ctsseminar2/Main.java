package ro.ase.ctsseminar2;

import ro.ase.ctsseminar2.exceptii.IllegalTransferException;
import ro.ase.ctsseminar2.exceptii.InsufficientFundsException;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CurrentAccount c=new CurrentAccount(300,"IBAN1");
		CurrentAccount account2=new CurrentAccount(200,"IBAN2");
		
		
		System.out.println("suma disponibila:" + c.getBalance());
		System.out.println("creditul max pt contul curent este" + CurrentAccount.MAX_CREDIT);
		c.deposit(200);
		System.out.println("suma disponibila:" + c.getBalance());
		
		
		try {
			c.withdraw(200);
			
			c.transfer(100, account2);
		}catch ( InsufficientFundsException e) {
				// TODO Auto-generated catch block
			System.err.println(e.getMessage());
			}
		catch (IllegalTransferException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("suma disponibila:" + c.getBalance());
		System.out.println("suma in contul 2 este" +account2.getBalance());
		
	}

}
