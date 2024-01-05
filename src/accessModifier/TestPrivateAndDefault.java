package accessModifier;

public class TestPrivateAndDefault {

	public static void main(String[] args) {


		Test obj2 = new Test();
		
		// below will give error when we make variable 'a' and method 'm1()' is private in 'Test' class so these will not be accessible in this another class
		
		  System.out.println(obj2.a);  // default variable from class 'Test' , will be accessible only within a package means classes of same package
		  obj2.m1();                     // default method from class 'Test', will be accessible only within a package means classes of same package
		 
		
	}

}
