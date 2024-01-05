package accessModifier;

public class TestProtected1 {



	/*
	 * private int a = 100; 
	 * private void m1() { // these variable & method will be accessible only within this class by creating object
	 * System.out.println("this is private class"); }
	 */
	
	 protected int a = 100;  
	 protected void m1() {  // these variable & method will be accessible only within a package by creating object in another class of same package 
		System.out.println("this is private class");
	}

     public static void main(String args[]) {
    	 
    	 TestProtected1 obj = new TestProtected1();
    	 System.out.println(obj.a);
    	 obj.m1();
    	 
     }
}