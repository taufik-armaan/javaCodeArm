package array;


class Bank {
	
	public void add() {
		
		System.out.println(10+20);
	}
	
	public void sub() {
		System.out.println(20-10);
	}
}
	class Axis extends Bank{
		
		public void add() {
			
			System.out.println(100+300);
		}
	}



public class MetghodOverriding {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bank b = new Bank();
		b.add();
		
		Axis a = new Axis();
		a.add();
		
		Bank d = new Axis();
		d.add(); // calling child class method
		
	}

}
