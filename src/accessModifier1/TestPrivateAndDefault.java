package accessModifier1;

import accessModifier.Test;

public class TestPrivateAndDefault {

	public static void main(String[] args) {


		Test obj2 = new Test();
		
		// below will give error when we make variable 'a' and method 'm1()' default in 'Test' class of package 'accessModifier'
		
		  //System.out.println(obj2.a);  // default variable from class 'Test' , will not be accessible because 'Test' class is present in another package i.e. 'accessModifier'
		  //obj2.m1();                     // default method from class 'Test', will not be accessible because 'Test' class is present in another package i.e. 'accessModifier'
		 
		
	}

}
