package ro.ase.cts.seminar4;
import ro.ase.cts.seminar4.EagerShoppingCartExample;

public class Main {

	public static void main(String[] args) {
		Cart shoppingCart = Cart.getInstance("shoppingCart");
		Cart wishlist = Cart.getInstance("wishlist");
		
		shoppingCart.getProducts();
		wishlist.getProducts();
		
		EagerShoppingCartExample example=EagerShoppingCartExample.instance;
		EagerShoppingCartExample example2=EagerShoppingCartExample.instance;

		if(example==example2) {
			System.out.println("obiectele sunt identice");
		}
		SingletonEnum mySingleton=SingletonEnum.INSTANCE;
		mySingleton.getProducts();
		}

}
