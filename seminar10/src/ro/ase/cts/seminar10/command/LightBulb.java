package ro.ase.cts.seminar10.command;

public class LightBulb {
	
	int lightIntensity=0;
	
	public void turnOnLight() {
		System.out.println("light is on");
		lightIntensity=1;
	}

	public void turnOffLight() {
		System.out.println("light is off");
		lightIntensity=0;
	}
	
	public void dimLight() {
		System.out.println("dimming light");
		if(lightIntensity>0) {
		lightIntensity--;
	}
	}
	
	public void increaseLightIntensity() {
		System.out.println("increasing light");
		lightIntensity++;
	}
}
