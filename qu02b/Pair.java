package qu02b;

public class Pair<T,U> {
	private T first;
	private U second;
	
	
	//parameterized constructor
	public Pair(T first, U second) {
		super();
		this.first = first;
		this.second = second;
	}
	
	
	//method of get first value 


	public T getFirst() {
		return first;
	}
	
	//method of get first value of pair
	public U getSecond() {
		return second;
	}

}
