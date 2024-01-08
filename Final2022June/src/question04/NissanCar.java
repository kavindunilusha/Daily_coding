package question04;

public class NissanCar implements Car {
	
	CarAirbag airBag;
	
	

	
	public NissanCar(CarAirbag airBag) {
		super();
		this.airBag = airBag;
	}

	@Override
	public void assembleLight() {
		System.out.println("Assembling for Nissan");
		airBag.airBagLightIndecator();

	}

	@Override
	public void assembleMotionSensor() {
		System.out.println("Assembling  Nissan");
		airBag.airBagMotionDetection();
		

	}

}
