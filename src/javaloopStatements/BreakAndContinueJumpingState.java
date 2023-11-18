package javaloopStatements;

public class BreakAndContinueJumpingState {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// break command:
		for (int i = 1; i <= 10; i++) {

			if (i == 3) {
				break;
			}
			System.out.println(i);
		}

		// *************************************
		System.out.println("*******");

		for (int i = 1; i <= 10; i++) {

			if (i == 3 || i==5) {      // (i == 3 && i==5) - it will never happer so it will print all no from 1 - 10
				break;
			}
			System.out.println(i);
		}
		
		// continue command:
		System.out.println("*******");
		
		for (int i = 1; i <= 10; i++) {

			if (i == 3) {
				continue;
			}
			System.out.println(i);
		}
	}

}
