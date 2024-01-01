import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Object lock = new Object();  //synchronization lock
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter pattern 1 = ");
		String p1 = sc.next();
		
		System.out.print("Enter pattern 2 = ");
		String p2 = sc.next();
		
		System.out.print("Enter count = ");
		int count = sc.nextInt();
		
		
		Thread thread01 = new Pattern01(lock,p1,count);
		Thread thread02 = new Pattern02(lock,p2,count);
		
		thread01.start();
		thread02.start();
		
		try {
			thread01.join();
			thread02.join();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}

	}

}
