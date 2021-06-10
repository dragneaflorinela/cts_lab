package ro.ase.cts.tema.unittesting;

import static org.junit.Assert.assertThrows;
import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import ro.ase.cts.tema.AngajatExceptionWrongValue;
import ro.ase.cts.tema.Angajat;

public class AngajatTestCase {
	Angajat angajat;
	static String DEFAULT_NAME = "Anonim";
	static int DEFAULT_VARSTA = 25;
	static int DEFAULT_ZILELUCRATE[];
	
	static double PLATA_DEFAULT=85.8;
	
	// ordonance test
	@Test
	void testCalculSalariuOrdonance() throws AngajatExceptionWrongValue {
		
		int zileLucrate[] = {1, 3, 5, 6, 14,20};
		angajat.setZileLucrate(zileLucrate);
		double salariu = angajat.calculSalariu();
		double expectedValue = 513;
		assertEquals(expectedValue, salariu, "Salariul nu corespunde");
	}
	
	// cardinality test - zero
	
	@Test
	void testCalculSalariuCardinalityZero() {
		int zileLucrate[] = new int[10];
		angajat.setZileLucrate(zileLucrate);
		
		assertThrows(AngajatExceptionWrongValue.class, ()->{
			angajat.calculSalariu();
		});
		
	}
	
	
	@Test
	void testCalculSalariuCardinalityOne() {
		int zileLucrate[] = new int[1];
		zileLucrate[0] = 9;
		angajat.setZileLucrate(zileLucrate);
		
		assertThrows(AngajatExceptionWrongValue.class, ()->{
			angajat.calculSalariu();
		});
		
	}
	
	
}
