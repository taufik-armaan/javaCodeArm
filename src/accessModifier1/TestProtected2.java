package accessModifier1;

//import accessModifier.Test;
import accessModifier.TestProtected1;

public class TestProtected2 extends TestProtected1 {

	public static void main(String[] args) {


		TestProtected2 obj3 = new TestProtected2(); 
		
		// By inheritance, below will be accessible when we make variable 'a' and method 'm1()' protected in 'TestProtected1' class of package 'accessModifier'
		
		  System.out.println(obj3.a);  
		  obj3.m1();                    
		
	}

}
