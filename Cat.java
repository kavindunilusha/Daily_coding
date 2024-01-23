package Question01;

public class Cat extends Pet {
	
	@Override
	public void GetTotalPoints() {
		System.out.println("Total points is " + getters());
		
		
	}
	
	public void feed() {
		System.out.println("feeding the Ca");
		setter(getters()+5);
	}

	public void clean() {

		System.out.println("cleanig the Cat");
		setter(getters() + 10);
	}

	public void cuddle() {

		System.out.println("cuddling the Cat");
		setter(getters() + 15);

	}

}
