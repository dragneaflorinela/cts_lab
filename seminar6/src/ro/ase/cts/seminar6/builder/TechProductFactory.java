package ro.ase.cts.seminar6.builder;

public class TechProductFactory extends AbstractProductFactory{

	@Override
	public Product makeProduct(int id) throws UnsupportedOperationException {
		return new TechProduct.TechProductBuilder(id).getProduct();
	}

	@Override
	public String getCatalog() {
		return "generic - Generic tech product";
	}
	
	

}
