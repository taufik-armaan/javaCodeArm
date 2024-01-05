package encapsulation;

public class AccountMain {

	public static void main(String[] args) {


		Account accObj = new Account();
		
		accObj.setAcc_no(12345);
		accObj.setName("Rahul");
		accObj.setAmount(50000);
		
		System.out.println(accObj.getAcc_no());
		System.out.println(accObj.getName());
		System.out.println(accObj.getAmount());
	}

}
