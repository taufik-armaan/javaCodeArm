package exceptionHandling;

import java.util.Scanner;

public class exceptionHandling {

	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number");
		int num = sc.nextInt();
		
		try {
			System.out.println();
		System.out.println(100/num); // ArithmaticException
		
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			System.out.println("Invalid input provided");
		}
		System.out.println("Program execution done after exception handling");
	}
	
	
}
