package javaloopStatements;

public class doWhileLoop {

	public static void main(String[] args) {

		int i=1;
		
		do {
			System.out.println(i);
			i++;
		}
		while(i<=10);
		
		//*********************************** 
		// below case it will execute at least once then check condition, condition is not satisfy then will not execute further
		System.out.println("\n");
		
		int j=10;
		
		do {
			System.out.println(j);
			j++;
			
		}
		while(j<=5);
		
		
	}

}
