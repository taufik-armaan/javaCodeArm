package javaloopStatements;

public class ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// print even no
		for(int i=1; i<=10; i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
		
		for(int j=1; j<=10; j++) {
			if(j%2!=0) {
				System.out.println(j);
			}
		}
		
		int num = 10;
		
		if(num%2==0) {
			System.out.println("Number is even");
		}
	}

}
