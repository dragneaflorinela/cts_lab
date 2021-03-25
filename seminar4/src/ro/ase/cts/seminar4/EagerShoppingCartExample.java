package ro.ase.cts.seminar4;

public class EagerShoppingCartExample {
	public static final EagerShoppingCartExample instance;
	
	static {
		instance=new EagerShoppingCartExample();
	}
	
	private EagerShoppingCartExample() {} //trb constructor privat la singleton
	
}
