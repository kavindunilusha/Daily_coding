package question04;

public class ToyotaCar implements Car {
	CarAirbag airBag;
	
	

	
	public ToyotaCar(CarAirbag airBag) {
		super();
		this.airBag = airBag;
	}

	@Override
	public void assembleLight() {
		System.out.println("Assembling for Toyota");
		airBag.airBagLightIndecator();

	}

	@Override
	public void assembleMotionSensor() {
		
		System.out.println("Assembling for Toyota");
		airBag.airBagMotionDetection();

	}

}
