package javaConditionalState;

public class IfElseifMultiple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// nested if else
		
		if(false) {
			System.out.println("abc");
		}
		else {
			System.out.println("xyz");
			if(false) {
				System.out.println("Inner if printed");
			}
			else {
				System.out.println("inner not printed");
			}
		}
		if(true) {
			System.out.println("uop");
		}
		else {
			System.out.println("NMO");
		}
	}

}
