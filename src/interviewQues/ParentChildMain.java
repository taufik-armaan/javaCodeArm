package interviewQues;

public class ParentChildMain {

	public static void main(String[] args) {


		ParentClass p = new ParentClass();
		System.out.println(p.variable);
		p.display();
		
		ChildClass q = new ChildClass();
		System.out.println(q.variable);
		q.display();
		
		ParentClass m = new ChildClass();
		System.out.println(m.variable); // it will access 'display()' method of child class on run time
		m.display();
		
		 //ChildClass t = new ParentClass(); // java.lang.ClassCastException(parent class object is refered by the child class reference variable which is wrong
	}

}
