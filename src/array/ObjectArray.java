package array;

public class ObjectArray {

	public static void main(String[] args) {

		Object a[] = new Object[5];
		
		a[0]= 10;
		a[1]= 19.2;
		a[2]= "Selenium";
		a[3]= 212;
		
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
		System.out.println();
		// enhance for loop
		for(Object x:a) {
			System.out.println(x);
		}
	}

}
