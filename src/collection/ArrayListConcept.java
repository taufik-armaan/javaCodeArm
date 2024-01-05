package collection;

import java.util.ArrayList;

     //Collections
     //Collection - To represent group of elements/objects/data into single entity then go for collections.
     //"Collection": is interface which is available in java.util package.

       // It allows heterogeneous data
       // it maintain insertion order
       // multiple null values are allowed
       // duplicate values are allowed
       // In whichever order we have added elements , in same order it will maintain and fetch elements i.e. it works on index basis

public class ArrayListConcept {

	public static void main(String[] args) {

		//ArrayList<Integer> myList = new ArrayList<Integer>(); // this will only store integer type of data i.e. Arraylist of integer
		
		ArrayList mylist = new ArrayList();
		
		// adding data elements into arraylist
		mylist.add(100);
		mylist.add("John");
		mylist.add(12);
		mylist.add(16.9);
		mylist.add(true);
		mylist.add(null);
		mylist.add(null);
		mylist.add(100);
		
		// size of the arraylist
		System.out.println(mylist.size());
		
		System.out.println("Before removing value " + mylist);  // print all the values of arraylist
		
		// remove the value from arraylist of specific index
		mylist.remove(3);
		System.out.println("After removing value " + mylist);  // print the values after removing element

		// inserting element into arraylist at last position
		mylist.add("Selenium");
		System.out.println(mylist);
		
		// inserting element into arraylist at specific index position
		mylist.add(2,"automation");
		System.out.println(mylist);
		
		// getting the value of element from arraylist of specific index
		System.out.println(mylist.get(3));

		// read all the data from arraylist using for loop
		
		System.out.println();
		
		for(Object x:mylist) {
			System.out.println(x);
		}
		// clearing all the data from arraylist
	    mylist.clear();
		System.out.println("After clearing all the data from aaraylist: "+ mylist); // []
		}
	}


