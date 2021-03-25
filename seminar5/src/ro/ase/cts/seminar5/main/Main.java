package ro.ase.cts.seminar5.main;

import java.util.Scanner;

import ro.ase.cts.seminar5.factory.OfficeProduct;
import ro.ase.cts.seminar5.factory.Product;
import ro.ase.cts.seminar5.factory.TechProduct;
import ro.ase.cts.seminar5.singleton.Cart;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cart myShoppingCart= Cart.getInstance("shopping");
		
		Scanner scan= new Scanner(System.in);
		System.out.println("catalog produse: \ntech - produse tech \n office - produse");
		String userPreference=scan.nextLine();
		Product myProduct=null;
		if(userPreference.equalsIgnoreCase("tech")) {
			myProduct=new TechProduct();
		}else if(userPreference.equalsIgnoreCase("office")){
			myProduct=new OfficeProduct();
			}
		}
		
		
		Product smartphone=new TechProduct();
		Product paperClip=new OfficeProduct();
		myShoppingCart.products.add(smartphone);
		myShoppingCart.products.add(paperClip);
		
		for(Product p: myShoppingCart.products) {
			System.out.println(p.getDescription());
		}
	}

}
