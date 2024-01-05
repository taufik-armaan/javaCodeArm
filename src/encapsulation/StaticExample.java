package encapsulation;

public class StaticExample {

	
	int a=10;
	static int b = 20;
	
	public void add() {
		System.out.println("Addition printed");
	}
	
	public static void sub() {
		System.out.println("Substraction printed");
	}
	
	public void div() {  //Inside non - static method we can access static and non-static stuffs without creating object
		
		System.out.println(a);
		System.out.println(b);
		
		add();
		sub();
	}
	
	
	
	

	public static void main(String[] args) { // inside static method we can access static method without creating object but non-static stuffs by creating object

 
		
		System.out.println(b); // calling non static variable
		sub();
		
		
		StaticExample obj = new StaticExample();
		System.out.println(obj.a);
		obj.add();
		
		obj.div();
	}

}
