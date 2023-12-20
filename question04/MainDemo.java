package question04;

public class MainDemo {

	public static void main(String[] args) {
		CarAirbag fAirBag = new FrontAirbag();
		CarAirbag sAirBag = new SideAirbag();
		
		new NissanCar(fAirBag).assembleLight();
		new NissanCar(fAirBag).assembleMotionSensor();
		new NissanCar(sAirBag).assembleMotionSensor();
		
		new ToyotaCar(fAirBag).assembleLight();
		new ToyotaCar(fAirBag).assembleMotionSensor();
		new ToyotaCar(sAirBag).assembleLight();
		new ToyotaCar(sAirBag).assembleMotionSensor();

	}

}
