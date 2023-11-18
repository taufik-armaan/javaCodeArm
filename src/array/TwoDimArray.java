package array;

public class TwoDimArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// declaration
		// approach - 1 - if we have fixed data values or small , no need to change the data then go for it
		
		int a[][] = new int[3][2];
		
		a[0][0]=100;
		a[0][1]=200;
		
		a[1][0]=300;
		a[1][1]=400;
		
		a[2][0]=500;
		a[2][1]=600;
		
		//Approach - 2 - if we want to add or remove values in future
		
		int b [][]= {{100,200},{300,400},{500,600}};
		
		// lenght of array
		System.out.println(b.length);
		System.out.println(b[0].length);
		
		// read specific value
		
		System.out.println(b[0][1]);
		
		for(int i=0; i<b.length; i++) {
			for(int j=0; j<b[0].length; j++) {
				System.out.println(a[i][j]);
			}
		}
		
		for(int i=0; i<b.length; i++) {
			for(int j=0; j<b[0].length; j++) {
				System.out.print(a[i][j]+ "  ");
			}
			System.out.println();
		}
		System.out.println();

		// enhanced for loop
		
		for(int x[]:b) {
			for(int v:x) {
				System.out.print(v+ "  ");
			}
			System.out.println();
		}
	}

}
