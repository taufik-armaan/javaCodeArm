package wrapperClasses;

public class DataConvertionMethods {

	public static void main(String[] args) {
		
		//String-----int
		
		String s="welcome";    //not possible to convert to number
		String s1="10";
		String s2="20";
		
	
		System.out.println(s1+s2);
		System.out.println(Integer.parseInt(s1)+Integer.parseInt(s2));
		
		
		
		//String-->Double
		String s3="150.15";
		String s4="130.20";
		
		double s1dbl=Double.parseDouble(s3);
		double s2dbl=Double.parseDouble(s4);
		
		System.out.println(s1dbl+s2dbl);
		

		//String--->Boolean
		
		String s6="true";
		
		boolean bool=Boolean.parseBoolean(s6);
		System.out.println(bool);
		
		// String---> Character(not possible) 

		// int, double, char, boolean----->String
		
		int a=10;
		double d=15.15;
		char c='A';
		boolean b=false;
		
		System.out.println(String.valueOf(a));
		System.out.println(String.valueOf(d));
		System.out.println(String.valueOf(c));
		System.out.println(String.valueOf(b));
		
		// int---> String
		int p=10;    
		String k=String.valueOf(p);    
		System.out.println(k+10);

	}


}
