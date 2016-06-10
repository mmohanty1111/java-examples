package com.visa.collections;

import java.util.ArrayList;

public class exampleArrayList {

	public static void main(String args[]){
		
		/*Creation of ArrayList: I'm going to add String
	       *elements so I made it of string type */
		ArrayList <String> obj = new ArrayList<String>();
		
		 /*This is how elements should be added to the array list*/
		obj.add("Ajeet");
		obj.add("Harry");
		obj.add("Chaitanya");
		obj.add("Steve");
		obj.add("Anuj");
		
		/* Displaying array list elements */
		System.out.println("Array List currently has" + obj);
		
		/*Add element at the given index*/
		obj.add(0, "Rahul");
		obj.add(1, "Justin");
		
		/*Remove elements from array list like this*/
		obj.remove("Chaitanya");
		obj.remove("Harry");
		
		System.out.println("Array List in phase 2 currently has" + obj);
		
		 /*Remove element from the given index*/
		obj.remove(1);
		
		System.out.println("Array List in phase 3 currently has" + obj);
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
