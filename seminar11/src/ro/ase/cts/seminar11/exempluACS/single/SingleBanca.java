package ro.ase.cts.seminar11.exempluACS.single;

import ro.ase.cts.seminar11.exempluACS.factory.ContBancar;
import ro.ase.cts.seminar11.exempluACS.factory.ContCredit;
import ro.ase.cts.seminar11.exempluACS.factory.ContDebit;

public class SingleBanca {
	private String denumire;
	private String adresa;
	private static int NRCONTURI=0;
	
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
	
    public ContBancar createInstance(String tipCont) {
        ContBancar contBancar;
        switch (tipCont) {
            case "CREDIT":
                contBancar = new ContCredit();
                setNRCONTURI(getNRCONTURI() + 1);
                break;
            case "DEBIT":
                contBancar = new ContDebit();
                setNRCONTURI(getNRCONTURI() + 1);
                break;
            default:
                contBancar = null;
                break;
        }
        return contBancar;
    }

	public static int getNRCONTURI() {
		return NRCONTURI;
	}

	public static void setNRCONTURI(int nRCONTURI) {
		NRCONTURI = nRCONTURI;
	}
}


