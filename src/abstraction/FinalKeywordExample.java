package abstraction;


	class Test {
		
		int x = 100; // normal variable
		final int y = 200;  // final variable. can not change the value. Value will be constant. If variable is final then we have to assign value to variable while declaration 
	}
	
	
	//final:
	//Variables - we cannot change the value of variable ( constant)
	//methods - we cannot override methods in the child class
	//classes - we cannot extend the class in to another class
	
	public class FinalKeywordExample {

	
	public static void main(String[] args) {


		Test obj = new Test();
		obj.x = 500;  // we can change the value of normal variable when needed
		
		//obj.y= 400;   // it will show error because final variable value can not be changed
	
		System.out.println(obj.x);
		System.out.println(obj.y);
		
	}

}
