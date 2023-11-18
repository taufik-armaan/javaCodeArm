package stringHandling;

public class StringOperations {

	public static void main(String[] args) {


		String s = "Welcome";
		//String s1 = new String("Welcome");
		
		System.out.println(s);
		
		// 1. length of the string
		System.out.println(s.length());
		
		// 2. concat() - joining strings
		
		String s2 = "Automation";
		System.out.println(s.concat(s2));
		System.out.println(s+s2);
		
		// 3. trim() - used to remove left and right spaces from the string
		String h = "    Selenium  ";
		System.out.println(h);
		System.out.println("The lenght of the string before trimming is " + h.length());
		String k = h.trim();
		System.out.println("The lenght of the string after trimming is " + k.length());
		
		// 4. charAt() - return single char based on the index we passed
		
		s= "Welcome";
		System.out.println(s.charAt(2));
		System.out.println(s.charAt(5));
		
		// 5. contains() - return boolean value- true/false
		
		System.out.println(s.contains("Wel"));
		System.out.println(s.contains("me"));
		System.out.println(s.contains("wel"));
		
		// 6. equals(), equalsIgnoreCase() - used to compare two strings. It return true/false, boolean value
		s= "Welcome";
		s2= "welcome";
		
		System.out.println(s.equals(s2));   // false
		System.out.println(s.equalsIgnoreCase(s2));   // true
		
		// replace() - replace single/multiple characters in a string
		s = "Welcome to the selenium";
		System.out.println(s.replace('e', 'X'));
		System.out.println(s.replace("selenium", "java"));
		
		// 7. substring() - to extract the substring from the main string
		
		s= "Welcome"; // starting index start from 0 & ending index starts from 1 . start index of 'l; is 2, ending index of 'm' is 6
		System.out.println(s.substring(2, 6)); // lcom
		
		//8. split() - divide the string into multiple parts using delimeter
		// we should not use . + - $ ? * as a delimeter
		
		s = "abc@gmail.com";
		String a [] = s.split("@");
		System.out.println(a[0]);   // abc - index 0
		System.out.println(a[1]);   // gmail.com - index 1
		
		s = "welcome to selenium";
		String b[]= s.split(" ");
		System.out.println(b[0]);
		System.out.println(b[1]);
		System.out.println(b[2]);
		
		s="welcome";
		String c[] = s.split("c");
		System.out.println(c[0]);
		System.out.println(c[1]);
		//System.out.println(c[3]); // it will give arrayIndexOutOfBound exception as only two index i.e. 0(wel) and 1(ome) after split 
		//System.out.println(c[4]);
		
		//9. toUpparCase and toLowerCae
		
		s= "Welcome";
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
				
		
		
		

	}

}
