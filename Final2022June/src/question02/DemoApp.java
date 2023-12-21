package question02;

public class DemoApp {

	public static void main(String[] args) {
		TCalculation<Integer> intCalculation = new TCalculation<Integer>();
		intCalculation.append(5);

		intCalculation.append(10);
		
		intCalculation.append(15);
		
		System.out.println("Average of Integers :" + intCalculation.average());
		
		
		TCalculation<Double> doubleCalculation = new TCalculation<Double>();
		
		doubleCalculation.append(2.5);
		doubleCalculation.append(3.5);
		doubleCalculation.append(4.0);
		
		
		System.out.println("Average of double is : " + doubleCalculation.average());
		
	}

}
