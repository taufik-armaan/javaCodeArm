package array;


// Super- 1. super keyword is used to initialize the immidiate parent class instance variable
//        2. super keyword is used to involk/access immediate parent class method 

class Animal{
	
	String color = "White";
	
	void eat() {
		System.out.println("eating... bread");
	}
}

class Dog extends Animal{
	
	String color = "Black";
	void dosplayColor() {
		
		System.out.println(super.color);
	}
	
	
	void eat() {
		System.out.println("eating.... chapati");
		super.eat();
		System.out.println(super.color);
	}
}


public class SuperKeyword {

	public static void main(String[] args) {


		Dog d = new Dog();
		d.dosplayColor();
		d.eat();
	}

}
