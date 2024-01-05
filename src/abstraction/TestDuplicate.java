package abstraction;

public class TestDuplicate {

	public static void main(String[] args) {

		
		String str = "Mohammad Tohfik";
		
		
		int count=0;
		
		char[] inp = str.toCharArray();
		
		System.out.println("Occurance of duplicate characters are: ");
		
		for(int i=0; i<str.length(); i++) {
			
			for(int j=i+1; j<str.length(); j++) {
				
				if(inp[i]==inp[j]) {
					
					System.out.print(inp[j]);
					count++;
					break;
					
				}
			}
		}
	}

}
