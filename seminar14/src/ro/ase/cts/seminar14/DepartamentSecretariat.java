package ro.ase.cts.seminar14;

import java.util.ArrayList;

public class DepartamentSecretariat {
	
	ArrayList<Student> studenti;
	
	public DepartamentSecretariat() {
		studenti=new ArrayList<Student>();
	}

	public DepartamentSecretariat(ArrayList<Student> studenti) {
		super();
		this.studenti = studenti;
	}

	
	float calculBursa(int studentIndex) {
		float mediestudent;
		try {
			mediestudent = studenti.get(studentIndex).calculMedie();
		} catch (StudentExceptionWrongValue e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(mediestudent>9) {
			return TipBursaEnum.EXCELENTA.getCuantum();
		}else if(mediestudent>8) {
			return TipBursaEnum.MERIT.getCuantum();
		}
				
		return 0;
	}
	
	
	
	
}
