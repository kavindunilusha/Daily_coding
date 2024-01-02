package qu02a;

import java.util.ArrayList;
import java.util.Scanner;

public class RemoveEvenNumbers {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> numbers = new ArrayList<>();
		
		//get user input
		
		while(true) {
			
			System.out.print("Enter numbers (0 to quit) :");
			int num = sc.nextInt();
			
			if(num == 0) {
				break;
			}
			numbers.add(num);
			
		}
		
		for (int i = 0; i < numbers.size(); ) {
            if (numbers.get(i) % 2 == 0) {
                numbers.remove(i);
            } else {
                i++;
            }
        }

        // Display odd numbers
        System.out.println("Odd numbers in the Array:");
        for (int num : numbers) {
            System.out.println(num);
        }

        sc.close();
	}

}
