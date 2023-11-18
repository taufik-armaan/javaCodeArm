package exceptionHandling;

import java.util.Scanner;

public class HandlingMultipleException {

	public static void main(String[] args) {


		
Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number");
		int num = sc.nextInt();
		
		String s = null;

		try {
		System.out.println(100/num); // ArithmaticException
		}
		
		/*
		 * try { System.out.println(s.length()); // NullPointerException
		 * 
		 * }
		 */
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			System.out.println("Invalid input provided");
		}
		
		catch(NullPointerException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			System.out.println("Invalid input provided");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			System.out.println("Invalid input provided");
		}
		System.out.println("Program execution done after exception handling");

	}

}
