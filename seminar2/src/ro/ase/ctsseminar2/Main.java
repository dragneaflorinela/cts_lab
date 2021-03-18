package ro.ase.ctsseminar2;

import ro.ase.ctsseminar2.exceptii.IllegalTransferException;
import ro.ase.ctsseminar2.exceptii.InsufficientFundsException;
import ro.ase.ctsseminar2.interfaces.NotificationService;
import ro.ase.ctsseminar2.interfaces.Profitable;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CurrentAccount c=new CurrentAccount(300,"IBAN1");
		CurrentAccount  account2=new CurrentAccount(200,"IBAN2");
		c.setNotificationSerive(new SMSNotificationSerive());
		SavingsAccount account3=new SavingsAccount(300,"IBAN3");
		
		System.out.println("suma disponibila:" + c.getBalance());
		System.out.println("creditul max pt contul curent este" + CurrentAccount.MAX_CREDIT);
		c.deposit(200);
		System.out.println("suma disponibila:" + c.getBalance());
		
		
		try {
			c.withdraw(200);
			c.setNotificationSerive(new EmailNotificationService());
			c.withdraw(200);
			c.setNotificationSerive(new NotificationService() {
				
				@Override
				public void sendNotification(String message) {
					// TODO Auto-generated method stub
					System.out.println("sent push notification with message" + message);
				}
			});
			c.withdraw(200);
			c.transfer(100, c);
		}catch ( InsufficientFundsException e) {
				// TODO Auto-generated catch block
			System.err.println(e.getMessage());
			}
		catch (IllegalTransferException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("suma disponibila: " + c.getBalance());
		System.out.println("suma in contul 2 este " +account2.getBalance());
		((Profitable) account3).addInterest(10);
		System.out.println("suma in contul 3 este " +account3.getBalance());
		account3.deposit(200);
		Bank banca=new Bank();
		BankAccount account4=banca.openBankAccount(AccountType.CURRENT);
		
	}

}
