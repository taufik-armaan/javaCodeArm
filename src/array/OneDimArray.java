package array;

public class OneDimArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a[] ={100, 200, 300, 400, 500,600};
		
		System.out.println(a[2]);
		
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
		
		// enhanced for loop
		System.out.println("\n");
		for(int abc:a) {
			System.out.println(abc);
		}
		
	}

}
