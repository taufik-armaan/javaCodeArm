package objectsClassMethods;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * Student stu = new Student();
		 * 
		 * // Approach - 1 - assigning the data using object reference variable
		 * 
		 * stu.sid= 67; stu.sname = "Rahul"; stu.grade = 'B';
		 * 
		 * stu.showStudata();
		 * 
		 * // Approach - 2 - pass the values in parameters(using method)
		 * 
		 * stu.setData(45, "Mohit", 'F');
		 */
		
		// Approach -3 - creating constructor

		Student stu2 = new Student(45, "Raj", 'D');  // invoking value from from constructor 
		//stu2.showStudata();  // invoking method, without assigning values as did above

		/*
		 * Student stu3 = new Student(); stu3.showStudata();
		 */
	}

	
	
	   
}

