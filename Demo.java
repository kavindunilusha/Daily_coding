package Question01;

public class Demo {

	public static void main(String[] args) {
		
		Pet squirrel = new Squirrel("Run3");
		squirrel.cuddle();
		squirrel.feed();
		squirrel.GetTotalPoints();
		
		Pet squirrel2 = new Squirrel("Run5");
		squirrel2.cuddle();
		squirrel2.feed();
		squirrel2.GetTotalPoints();
		
		
		Pet garfield = new Cat();
		garfield.clean();
		garfield.cuddle();
		garfield.feed();
		garfield.GetTotalPoints();
		
		
		
		Pet parrot = new Parrot("walk");
		
		parrot.feed();
		parrot.GetTotalPoints();
		
		
		
		
		
		

	}

}
