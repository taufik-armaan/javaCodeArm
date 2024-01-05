package encapsulation;

public class StaticMain {

   public static void main(String[] args) { // inside static method we can access static method without creating object but non-static stuffs by creating object

 
		
		System.out.println(StaticExample.b); // calling non static variable
		StaticExample.sub();  // This method is present in another class that's why we have to use class name to access method
		
		
		StaticExample obj = new StaticExample();
		System.out.println(obj.a);
		obj.add();
		
		obj.div();
	}

}

