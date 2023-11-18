package javaConditionalState;

public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// conditional statements are used to check the condition, it will check the condition among the several
		// it is used to execute the condition from multiple condition
		
		// switch statement is used to reduce the code. It's like else if ladder.
		// switch statement executes one statement from multiple conditions. It is like
		// an if-else-if ladder statement
		// boolean, string, character, Long not supported by switch statement
		// in every case we have to use "break" statement otherwise it will execute next statement if break is absent
		// break is also called jumping commands

		/*
		 * int variable=value; switch(variable) { case value: System.out.println("Abc");
		 * break; }
		 */

		int weekno = 6;

		switch (weekno) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		default:
			System.out.println("Invalid week no");
		}

	}

}
