package ro.ase.cts.seminar11.state;

public class OpenState implements GateStateInterface {

	@Override
	public void enter(Gate gate) {
		// TODO Auto-generated method stub
		System.out.println("entered successfully");
		gate.setState(new LockedState());
	}

	@Override
	public void authorize(Gate gate) {
		// TODO Auto-generated method stub
		System.out.println("already authorized to pass");
		
	}

}
