package interviewQues;

import org.apache.commons.lang3.RandomStringUtils;

public class CreateRandomAlphaNumericValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String alphaPlusNumber = RandomStringUtils.randomAlphanumeric(5);

		System.out.println(alphaPlusNumber);
		
		String str=RandomStringUtils.randomAlphabetic(3);
		String num=RandomStringUtils.randomNumeric(3);
		
		System.out.println(str);
		System.out.println(num);
	}

}
