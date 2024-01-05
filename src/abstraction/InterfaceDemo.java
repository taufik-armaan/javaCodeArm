package abstraction;

interface Shape {
	
	int a = 10;  // by default variable in interface is static and final
	int b = 20;  // by default variable in interface is static and final
	
	void circle();
	
	default void square() {
		System.out.println("this is square - default method");
		
	}
 
	static void rectangle() {
		System.out.println("this is rectangle - static method");
	}
}



public class InterfaceDemo implements Shape{

	@Override
	public void circle() {  // when implementing any interface then we have to override all the methods of interface in child class
 
		System.out.println("this is circle");
	}
	
	public static void main(String[] args) {

		// if we have to access the methods of the interface then we have to create the object of the child class which implements interface
		InterfaceDemo obj = new InterfaceDemo();
		
		obj.circle();
		obj.square();
		Shape.rectangle(); // static method directly access using interface name
		
		// Shape obj = new Shape(); // this is incorrect as we can not create the object of interface
		
		
		Shape sh = new InterfaceDemo();   // we can create the object reference for interface but we can not instantiate the interface 
		sh.circle();
		sh.square();
		Shape.rectangle();
	}

	/*
	 * Interface ------------- Abstraction is a process of hiding the implementation
	 * details and showing only functionality to the user.
	 * 
	 * Interface ------------- An intgerface is a blue print of class. Interface
	 * contains final & Static variables. Interface contains abstract methods.( also
	 * allowed default methods & Static methods from java8 onwards) An abstract
	 * method is a method contains definition but not body(Un-implemented method).
	 * Methods in interface are public. Interface supports the functionality of
	 * multiple inheritance. We can define interface with interface keyword. A class
	 * extends another class, an interface extends another interface but a class
	 * implements an interface. We can create Object reference for Interface but we
	 * cannot instantiate interface.
	 */
	
	
	

}
