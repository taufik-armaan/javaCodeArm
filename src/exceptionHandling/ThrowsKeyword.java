package exceptionHandling;


public class ThrowsKeyword {

	
	public int div(int a, int b) throws ArithmeticException{
		int d=a/b;
	    return d;
	}
	
	
	public static void main(String[] args) {
		ThrowsKeyword obj = new ThrowsKeyword();
		

		try {
			//obj.div(20, 0);
		
			System.out.println(obj.div(40, 0));
		}
		catch (ArithmeticException e) {
		    System.out.println("Exception handled ");
		}
		System.out.println("Rest of the code executed");
		
	}

}
