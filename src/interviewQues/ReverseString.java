package interviewQues;

public class ReverseString {

	public static void main(String[] args) {

		String s = "Work with Infosys";
		String rev = "";
		
		for(int i=s.length()-1; i>=0; i--){
			rev= rev+ s.charAt(i);
		}
		
		System.out.println("The reverse string is : "+ rev);
		
	}

}
