package ro.ase.cts.seminar8.Decorator;

public class WithFoodDecorator extends AbstractBackpackDecorator{

	String food;
	
	public WithFoodDecorator(AbstractBackpack basicBackpack) {
		super(basicBackpack);
		// TODO Auto-generated constructor stub
	}
	
	

	public WithFoodDecorator(AbstractBackpack basicBackpack, String food) {
		super(basicBackpack);
		this.food = food;
	}



	@Override
	public void pack() {
		// TODO Auto-generated method stub
		this.basicBackpack.pack();
		System.out.println(" + food");
	}
	
	public String getFood() {
		return this.food;
		
	}

}
