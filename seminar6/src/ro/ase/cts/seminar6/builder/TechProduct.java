package ro.ase.cts.seminar6.builder;

public class TechProduct implements Product, Cloneable {

	int id;
	String productName;
	String manufacturer;
	String model;
	String displayType;
	float price;
	
	
	private TechProduct() {
	}
	
	public TechProduct(int id) {
		super();
		this.id = id;
	}
	@Override
	public String getDescription() {
		return this.productName +" "+this.manufacturer + " " +this.model;
	}

	public int getId() {
		return id;
	}

	public String getProductName() {
		return productName;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public String getModel() {
		return model;
	}

	public String getDisplayType() {
		return displayType;
	}

	public float getPrice() {
		return price;
	}

	public static class TechProductBuilder{
		private TechProduct product;
		
		public TechProductBuilder(int id) {
			product=new TechProduct();
		}
		
		public TechProductBuilder setName(String name) {
			product.productName=name;
			return this;
			
		}
		public TechProductBuilder setManufacturer(String manufacturer) {
			product.manufacturer=manufacturer;
			return this;
		}
		public TechProductBuilder setModel(String model) {
			product.model=model;
			return this;
		}
		public TechProductBuilder setDisplayType(String displayType) {
			product.displayType=displayType;
			return this;
		}
		public TechProductBuilder setPrice(float price) {
			product.price = price;
			return this;
		}
		
		public TechProduct getProduct() {
			return product;
		}
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		TechProduct newProduct= new TechProductBuilder(this.id).setDisplayType(this.displayType).setManufacturer(this.manufacturer).setModel(this.model).setName(this.productName).setPrice(this.price).getProduct();
		
		return newProduct;
	}
	
	
}
		
		
	
	



