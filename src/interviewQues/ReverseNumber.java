package interviewQues;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// first approach -1 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number to reverse");
		 
		int num = sc.nextInt();
		
		// use StringBuffer class to reverse number
		
		StringBuffer sb = new StringBuffer(String.valueOf(num));
		StringBuffer rev = sb.reverse();

		System.out.println(rev);
		
		// 2nd approach - string builder method
		
		StringBuilder sbl = new StringBuilder();
		sbl.append(num);
		StringBuilder rev1 = sbl.reverse();
		System.out.println("Reverse number is :" + rev);
		
		
	}

}
