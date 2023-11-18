package exceptionHandling;

public class ThrowKeyword {

	
	// throw keyword is used to throw the exception explicitly from a method or a block of code
	// The throw keyword is followed by an instance of Exception to be thrown
	
	
	public void numCheck(int num) {
		if(num<1) {
			throw new ArithmeticException
			("Number is negative and can not be calculate square");
				
			}
		else {
			System.out.println("The number square is "+ num*num);
		
		}
	
	}

	
	public static void main(String[] args) {

		ThrowKeyword obj = new ThrowKeyword();
		obj.numCheck(-1);
			
		
	}

}
