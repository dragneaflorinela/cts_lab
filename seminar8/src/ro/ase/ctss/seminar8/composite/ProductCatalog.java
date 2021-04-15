package ro.ase.ctss.seminar8.composite;

import java.util.ArrayList;

public class ProductCatalog extends CatalogComponent {

	private ArrayList<CatalogComponent>products;
	private String name;
	
	@Override
	public void add(CatalogComponent component) {
		// TODO Auto-generated method stub
		this.products.add(component);
	}

	@Override
	public void remove(CatalogComponent component) {
		// TODO Auto-generated method stub
		for(int i=0;i<products.size();i++) {
			if(products.get(i).equals(component.getName())) {
				products.remove(i);
			}
		}
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 0;
	}

}
