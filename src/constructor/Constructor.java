package constructor;

public class Constructor {

	
	// I am addding second commit to this class
	int x, y;
	String s;
	
	// constructors are used to initialize the variable values, initialize the object, not used to execute the code, method is used for this purpose
	  public Constructor() {
	  
	  x=100; 
	  y=50; 
	  s="Selenium"; }
	 
	
    public Constructor(int a, int b, String k) {
		
		x=a;
		y=b;
		s=k;
	}
	public void display() {
		System.out.println(x);
		System.out.println(y);
		System.out.println(s);
	}
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Constructor con = new Constructor(); // default constructor
		con.display();
		
		Constructor con1 = new Constructor(13, 20, "John");  // parameterize constructor
		con1.display();

		
	}

}
