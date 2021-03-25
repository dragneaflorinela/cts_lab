package ro.ase.cts.seminar4;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Cart  implements Serializable{

	//private static Cart instance = null;
	private static Map<String,Cart> instances = null;
	private String type;
	public ArrayList<Product> products;
	
	private Cart() {
		
		products=new ArrayList<>();	}

	public static synchronized Cart getInstance(String type) {
		if (instances == null) {
			instances=new HashMap<>();
			
		}
		if(!instances.containsKey(type)) {
			return instances.get(type);
		}else {
			Cart myCart=new Cart();
			myCart.type=type;
			instances.put(type, myCart);
		}
		return instances.get(type);
	}
	
	public ArrayList<Product>getProducts(){
		return products;
	}
}