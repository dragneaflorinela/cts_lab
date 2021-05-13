package ro.ase.cts.seminar11.exempluACS.factory;

public interface ContBancar {
	void transfer(ContBancar destinatie, double suma);
	void depune(double suma);

}
