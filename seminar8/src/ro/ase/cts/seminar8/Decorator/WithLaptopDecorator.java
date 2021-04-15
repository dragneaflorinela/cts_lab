package ro.ase.cts.seminar8.Decorator;

public class WithLaptopDecorator extends AbstractBackpackDecorator{

	public WithLaptopDecorator(AbstractBackpack basicBackpack) {
		super(basicBackpack);
		
		// TODO Auto-generated constructor stub
	}

	@Override
	public void pack() {
		// TODO Auto-generated method stub
		this.basicBackpack.pack();
		System.out.print(" + laptop");
	}
	

}
