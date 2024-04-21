package abstraction;

public class PQR extends MNO implements ABC,XYZ {

	@Override
	public void m2() {
		System.out.println("this is m2 from XYZ interface");
		System.out.println(x);

	}

	@Override
	public void m1() {
		System.out.println("this is m1 from ABC interface");
		System.out.println(y);

	}

	public static void main(String args[]) {
		
		
		  PQR obj = new PQR();
		  
		  obj.m1(); 
		  obj.m2(); 
		  System.out.println(obj.x); // all the variable of the interface is static and final by default so showing suggestion
		  System.out.println(y); 
		  System.out.println(ABC.x); // this will also work as accessing using interface name as we do for class using class name
		  
		  // calling variables and methods of MNO class which is parent of PQR class
		  obj.m3(); 
		  System.out.println(obj.z);
		 
		// calling methods and variables of the interface using object reference variable of interface 
		ABC obj1 = new PQR();
		
		System.out.println(obj1.x);
		obj1.m1();
		
	}
	
	
	
}
