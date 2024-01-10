package question02;

import java.util.ArrayList;
//comment
public class TCalculation<T extends Number> {
	private ArrayList<T> numList;

	
	public TCalculation() {
		
		this.numList = new ArrayList<>();
		
	}
	public void append(T value) {
		numList.add(value);
	}
	public double average() {
		if(numList.isEmpty()) {
			return 0.0;
		}
		double sum = 0.0;
		for(T value : numList) {
			sum += value.doubleValue();
		}
		return sum / numList.size();
	}
	

}
