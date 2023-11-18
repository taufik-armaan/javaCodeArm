package javaConditionalState;

public class LargestAndSmallestNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=20; int b=30;
		
		if(b>a) {
			System.out.println(" b is the largest number");
		}
		else {
			System.out.println("a is the largest number");
		}
		
		
		// smallest number among 3 numbers

		int x=10;
		int y=20; 
		int z=30;
		
		if(x<y && x<z) {
			System.out.println(" x is the smallest number");
		}
		else if(y<x && y<z) {
			System.out.println("y is the smallest number");
	}
	else {
		System.out.println("z is the smallest number");
	}

		// print month name by taking month number ( 1-12) using switch case.. 
		
		int month_number = 2;
		
		switch(month_number) {
		
		case 1: System.out.println("January"); break;
		case 2: System.out.println("February"); break;  // if we don't give break; after Feb then it will execute next statement i.e. March
		case 3: System.out.println("March"); break;
		case 4: System.out.println("April"); break;
		case 5: System.out.println("May"); break;
		case 6: System.out.println("June"); break;
		case 7: System.out.println("July"); break;
		case 8: System.out.println("August"); break;
		case 9: System.out.println("September"); break;
		case 10:System.out.println("October"); break;
		case 11:System.out.println("November"); break;
		case 12:System.out.println("December"); break;


		}
		
}
	
}
