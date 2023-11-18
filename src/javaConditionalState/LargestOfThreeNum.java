package javaConditionalState;

public class LargestOfThreeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// a>b  and a>c  a largest number
		// b>a  and b>c  b largest number
		// c>a  and c>b  c is largest number 
	
	
	int a=200; int b=300; int c=400;
	
	if(a>b && a>c) {
		System.out.println("a is largest number");
	}
	else if(b>a && b>c) {
		System.out.println("b is largest number");
	}
	else {
		System.out.println("c is largest number");
	}

}
}