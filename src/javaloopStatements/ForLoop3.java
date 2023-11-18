package javaloopStatements;

public class ForLoop3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// in the conditional statement we can use the looping statement and in looping statement we can use the conditional statement
		boolean flag=false; // false
		
		if(flag) {
			
			for(int i=1; i<=10; i++) {
				System.out.println(i);
			}
		}
		else {
			
			for(int i=10; i>=1;i--) {
				System.out.println(i);
			}
		}
	}

}
