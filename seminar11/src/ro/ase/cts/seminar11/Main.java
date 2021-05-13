package ro.ase.cts.seminar11;

import ro.ase.cts.seminar11.state.Gate;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gate securedGate=new Gate();
		securedGate.authorize();
		securedGate.enter();
		securedGate.enter();
	}

}
