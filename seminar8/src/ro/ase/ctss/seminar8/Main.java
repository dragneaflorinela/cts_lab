package ro.ase.ctss.seminar8;

import ro.ase.cts.seminar8.facade.OrderFacade;
import ro.ase.ctss.seminar8.Decorator.AbstractBackpack;
import ro.ase.ctss.seminar8.Decorator.Backpack;
import ro.ase.ctss.seminar8.Decorator.WithFoodDecorator;
import ro.ase.ctss.seminar8.Decorator.WithLaptopDecorator;
import ro.ase.ctss.seminar8.composite.CatalogComponent;
import ro.ase.ctss.seminar8.composite.Product;
import ro.ase.ctss.seminar8.composite.ProductCatalog;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OrderFacade facade=new OrderFacade();
		facade.order();
		
		System.out.println("................................................................");
		
		CatalogComponent laptop=new Product("asus",2000);
		CatalogComponent smartphone= new Product("Samsung s20", 2500);
		
		CatalogComponent techProductsCatalog= new ProductCatalog("tech products");
		techProductsCatalog.add(laptop);
		techProductsCatalog.add(smartphone);
		
		CatalogComponent officeProductCatalog= new ProductCatalog("office products");
		CatalogComponent paperclip=new Product("paperclip", 5);
		CatalogComponent pen= new Product("blue pen", 2);
		officeProductCatalog.add(pen);
		officeProductCatalog.add(paperclip);
		
		CatalogComponent genericProducts= new ProductCatalog("generic products");
		genericProducts.add(new Product("generic product",0));
		genericProducts.add(techProductsCatalog);
		genericProducts.add(officeProductCatalog);
		
		System.out.println(genericProducts);
		System.out.println("................................................................");
	
		AbstractBackpack myBackpack= new Backpack();
		myBackpack.pack();
		AbstractBackpack decoratedBackpack= new WithLaptopDecorator(new WithFoodDecorator(myBackpack, "banana"));
		decoratedBackpack.pack();
	
	}
	

}
