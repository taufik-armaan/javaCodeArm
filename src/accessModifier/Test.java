package accessModifier;

public class Test {



	/*
	 * private int a = 100; 
	 * private void m1() { // these variable & method will be accessible only within this class by creating object
	 * System.out.println("this is private class"); 
	 * }
	 */
	
	 int a = 100;  
	 void m1() {  // these variable & method will be accessible only within a package by creating object in another class of same package 
		System.out.println("this is private class");
	}

     public static void main(String args[]) {
    	 
    	 Test obj = new Test();
    	 System.out.println(obj.a);
    	 obj.m1();
    	 
     }
}