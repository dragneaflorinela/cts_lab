package ro.ase.cts.tema;


import ro.ase.cts.tema.AngajatExceptionWrongValue;

public class Angajat {
	private int varsta;
	private int zileLucrate[];
	private String nume;
	private static double plataPeZi=85.8;
	
	public int getVarsta() {
		return varsta;
	}
	
	public void setVarsta(int varsta) throws AngajatExceptionWrongValue {
		if (varsta < 0)
			throw new AngajatExceptionWrongValue("Values can't be below 0");
		this.varsta = varsta;	}
	
	
	public int[] getZileLucrate() {
		return zileLucrate;
	}
	public void setZileLucrate(int[] zileLucrate) {
		this.zileLucrate = zileLucrate;
	}
	public String getNume() {
		return nume;
	}
	public void setNume(String nume) {
		this.nume = nume;
	}
	
	public double calculSalariu() throws AngajatExceptionWrongValue {
		if (zileLucrate == null) {
			throw new AngajatExceptionWrongValue("angajatul nu a veit la munca nici macar o data");
		}
		
		if (zileLucrate.length <= 1) {
			throw new AngajatExceptionWrongValue("not enough values to compute average");
		}

		float nrTotalZile = 0;
		for (int i = 0; i < zileLucrate.length; i++) {
			nrTotalZile += zileLucrate[i];
		}

		double calculSalariu = nrTotalZile * plataPeZi;
		return calculSalariu;
	}

}
