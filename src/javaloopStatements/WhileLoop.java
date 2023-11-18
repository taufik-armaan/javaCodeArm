package javaloopStatements;

public class WhileLoop {

	public static void main(String[] args) {

		// when set of statements needs to be execute multiple times then we use loops

		// in while loop, initialization should be done before while condition
		
		/*int i = 1; // initialization 
		while (i <= 10) { // condition
		System.out.println(i);
		i++; // increment/decrement
		}*/
		
		//print Hello 10 times
		int i=1;
		while(i<=10) {
			System.out.println("Hello");
			i++;
		}
		
		// Approach 1 - print even numbers
		int j=2;
		while(j<=10) {
			System.out.println(j);
			j=j+2;   // or i+=2
		}
		
		System.out.println("\n");
		// Approach 2(print even numbers) - using if condition
		
		
		int k=1;
		while(k<=10) {
			if(k%2==0) {
				System.out.println(k);
			}
			k++;

		}
		// Approach 1 - print odd number
		int p=1;
		while(p<=10) {
			System.out.println(p);
			p=p+2;   // or i+=2
		}
		System.out.println("\n");

		
		int z=1;
		while(z<=10) {
			if(z%2!=0) {
				System.out.println(z);
			}
			z++;
		}
		
	}
}
