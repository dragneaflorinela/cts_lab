package ro.ase.cts.seminar11.exempluACS.single;

public class SingleBanca {
	private String denumire;
	private String adresa;
	private static int NRCONT;
	
	private static SingleBanca INSTANCE;
	
	private SingleBanca(String denumire, String adresa) {
		this.denumire=denumire;
		this.adresa=adresa;	
	}
	
	public static synchronized SingleBanca getInstance(String denumire, String adresa) {
		if(INSTANCE==null) {
			INSTANCE=new SingleBanca(denumire, adresa);
		}
		return INSTANCE;
	}

}
