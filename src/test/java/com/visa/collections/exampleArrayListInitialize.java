package com.visa.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class exampleArrayListInitialize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/* 
		 * Method 1: Initialization using Arrays.asList
		 */
		ArrayList<String> obj = new ArrayList<String>(
				Arrays.asList("Rahul", "Tony", "Peter"));
			System.out.println("Elements in ArrayList are" + obj);	
		
			
		/* 
		 * Method 2: Anonymous inner class method to initialize ArrayList
		 */	
			
	    ArrayList<String> cities = new ArrayList<String>(){/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

		{
	    	
	    	add("Delhi");
	    	add("Kolkata");
	    	add("Mumbai");
	    	add("Chennai");
	    }};
	    
	    System.out.println("Content of ArrayList for cities is " + cities);
			
	    /* 
		 * Method 3: Normal way of ArrayList initialization
		 */	
		ArrayList<String> books = new ArrayList<String>();
		
		books.add("Java One");
		books.add("Java Two");
		books.add("Java Three");
		
		System.out.println("The thirst set Array List has"+ books);
		
		
		/* 
		 * Method 4: Use Collections.ncopies
		 */
		
		ArrayList<Integer> intlist = new ArrayList<Integer>(Collections.nCopies(10, 5));
		
		System.out.println("ArrayList Items: " + intlist);
		
	}

}
