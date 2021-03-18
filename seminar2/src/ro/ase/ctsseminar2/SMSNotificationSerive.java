package ro.ase.ctsseminar2;

import ro.ase.ctsseminar2.interfaces.NotificationService;

public class SMSNotificationSerive implements NotificationService {
	public void sendNotification(String message) {
		System.out.println("sent notification with message: " + message);
	}

}
