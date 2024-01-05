package interviewQues;

public class OccurenceOfCharacter {

	public static void main(String[] args) {


		String str = "mohammad Tohfik";
		
		int totalCount = str.length();
		int totalCountAfterR= str.replace("3", "").length();
		int count = totalCount - totalCountAfterR;
		System.out.println(count);
	}

}
