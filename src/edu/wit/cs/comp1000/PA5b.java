package edu.wit.cs.comp1000;
import java.util.Scanner; 
/*
 * Calculating the average of a stream of non-negative numbers 
 * @author Hector Padilla 
 * @date October 31 2019 
 */


// TODO: document this class
public class PA5b {
	public static double avg(Scanner scnr) {
		double sum = 0.00;
		double counter = 0.00;
		
		while (scnr.hasNext()) {
			double num = scnr.nextDouble();
			
			if (num < 0.00) {
				break;
			}
			else {
				sum = sum + num;
				counter = counter + 1.00; 
			}
		}
		if (counter == 0.00) {
			return 0.00;
		}
		else {
			return sum / counter;
		}
	}
	
	

	// TODO: document this method
	public static void main(String[] args) {
		// TODO: write your code here
		Scanner scnr = new Scanner(System.in);
		String response; 
		
	do {
		System.out.print("Enter a stream of non-negative numbers (negative when finished): ");
		System.out.printf("The average is: %.2f%n", avg(scnr));
		System.out.print("Do you want to compute another average (y/n)? ");
		response = scnr.next();
	} while (response.equalsIgnoreCase("y"));

	}
}


