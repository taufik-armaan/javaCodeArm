package collection;

import java.util.HashMap;

 //HashMap - a class implemented Map interface
 // Data can be stored in the form of key, value pairs.
 // Key is unique. But we can have duplicate values.
 //Insertion order not preserved(Index not followed)


public class HashMapConcept {

	public static void main(String[] args) {


		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		
		hm.put(101, "John");
		hm.put(102, "Marry");
		hm.put(103, "Shon");
		hm.put(104, "Rahul");
		hm.put(105, "John");
		hm.put(101, "Robert");
		
		// get size of hashmap
		System.out.println(hm.size()); // it will not allow duplicate key. allow only unique key  
		
		// print all the values of hashmap 
		System.out.println("Before removing value: "+ hm);  // if using duplicate key then will override old value and print latest key value
		
		// remove value , just provide key
		hm.remove(104);
		System.out.println("After removing value: " + hm);
		
		// print only keys in hashmap
		System.out.println(hm.keySet());
		
		System.out.println();

		// print only values of hashmap 
		
		for(Object x: hm.keySet()) {
		System.out.println(hm.get(x));
		}
		// print keys and values of hashmap
		
		System.out.println();
		
		for(Object x: hm.keySet()) {
			System.out.println(x+ "  " +hm.get(x));
			}
		
		hm.clear(); // it will clear all the data from hashmap
		System.out.println(hm);  // {}
	}
	}


