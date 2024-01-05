package collection;

import java.util.ArrayList;
import java.util.HashSet;

// It allows heterogeneous data (elements with different data types)
// it does not allow duplicate element, if added it will not give any error but add only one value and get only one value when we print
// It does not maintain insertion order i.e. data added randomly in memory, index not allowed
// it does not allow multiple null values, only one null value is allowed. If added it will not give any error but add only one value and get only one value when we print


public class HashSetConcept {

	public static void main(String[] args) {


		//HashSet<Integer> myList = new HashSet<Integer>(); // this will only store integer type of data i.e. Arraylist of integer
		
		        HashSet hashSet = new HashSet();
				
				// adding data elements into arraylist
		        hashSet.add(100);
		        hashSet.add("John");
		        hashSet.add(12);
		        hashSet.add(16.9);
		        hashSet.add(true);
		        hashSet.add(null);
		        hashSet.add(null);
		        hashSet.add(100);
		        
		        System.out.println(hashSet.size());   // 6 because 100 and null are duplicate so will consider one value only
		        
		        System.out.println(hashSet); // insertion order is not preserved. will not print values in whichever order it is added, so randomly printing values
 
		        hashSet.remove(16.9); // if want to remove value then need to provide value which need to remove, we can not add index of element as it does not support
		        System.out.println(hashSet);
		        
		        hashSet.add("Rahul");
		        System.out.println(hashSet);
		        
		        // get specific value from hash set - not possible
		        //System.out.println(hashSet.get(true)); // will give error
		        
		        for(Object x: hashSet) {
		        	System.out.println(x);
		        }
	}

}
