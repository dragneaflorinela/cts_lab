package ro.ase.cts.seminar6.builder;

public class OfficeProduct implements Product{

	String productName;
	
	public OfficeProduct(String productName) {
		super();
		this.productName = productName;
	}
	
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "this is an office product";
	}
	

}
