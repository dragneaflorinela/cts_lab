package ro.ase.cts.seminar8.facade;

public class Waiter {
	String nume;

	public Waiter(String nume) {
		super();
		this.nume = nume;
	}
	
	public void takeOrder() {
		System.out.println("Order taken");
	}
	
	public void sendOrderToKitchen() {
		System.out.println("order placed");
	}
	
	public void serveCustomer() {
		System.out.println("order served");
	}

}
