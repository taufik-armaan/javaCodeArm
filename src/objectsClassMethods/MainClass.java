package objectsClassMethods;

public class MainClass {

	
	public static void main(String args[]){
		
		Employee obj = new Employee();
		obj.EmpId = 10;
		obj.EmpJob = "Manager";
		obj.EmpName = "John";
		obj.EmpSalary = 50000;
		
		obj.displayEmpData();
		
		Employee obj1 = new Employee();
		obj1.EmpId = 11;
		obj1.EmpJob = "Test Lead";
		obj1.EmpName = "Sameer";
		obj1.EmpSalary = 123400;
		
		System.out.println();
		
		obj1.displayEmpData();

		
		
	}
}
