package ro.ase.ctss.seminar8.composite;

public class Product extends CatalogComponent {
	String name;
	double price;
	
	public Product(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}

	@Override
	public void add(CatalogComponent component) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("can t add product");
		
	}

	@Override
	public void remove(CatalogComponent component) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("can t remove product");
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return this.price;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.name + "with price tag: " + this.price;
	}
	
	

}
