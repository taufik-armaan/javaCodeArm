package exceptionHandling;

import java.util.Scanner;

public class HandleAllExcUsingExceptionClass {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number");
		int num = sc.nextInt();

		String s = null;

		/*
		 * try { System.out.println(100/num); // ArithmaticException }
		 */

		try {
			System.out.println(s.length()); // NullPointerException

		}

		catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			System.out.println("Invalid input provided");
		} finally {
			System.out.println("It will execute finally block whether exception occured or not");
		}
	}

}
