package javaConditionalState;

public class IfElseInnerMulti {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// nested if else 
		
		/*
		 * if(true) {
		 * 
		 * if(false) { System.out.println("Print abc"); } else {
		 * System.out.println("Print xyz"); }
		 * 
		 * } } }
		 */

		/*
		 * if(false) {
		 * 
		 * if(false) { System.out.println("Print abc"); } else {
		 * System.out.println("Print xyz"); }
		 * 
		 * } else { System.out.println("Print DEF"); } } }
		 * 
		 */

		if (false) {

			if (false) {
				System.out.println("Print abc");
			} else {
				System.out.println("Print xyz");
			}

		} else if (true) {
			if (false) {

				System.out.println("Print TRE");
			} else {
				System.out.println("Print BBB");
			}
		}
	}
}