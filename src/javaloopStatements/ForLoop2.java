package javaloopStatements;

public class ForLoop2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// in looping statement we have used conditional statement
		// print only 2, 5 and 8 from 1-10
		for (int i = 1; i <= 10; i++) {

			if (i == 2 || i == 5 || i == 8) {
				System.out.println(i);
			}
		}
		// **********************************
		System.out.println("********");

	
		for (int i = 1; i <= 10; i++) {

			if (i != 2 && i != 5 && i != 8) {
				System.out.println(i);
			}
		}

	}

}
