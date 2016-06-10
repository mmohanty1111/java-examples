package com.visa.collections;

import java.util.ArrayList;
import java.util.Collections;

import org.testng.annotations.Test;

public class exampleArrayListSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> listofcountries = new ArrayList<String>();
        listofcountries.add("India");
        listofcountries.add("US");
        listofcountries.add("China");
        listofcountries.add("Denmark");
        
        /*Unsorted List of Countries */
        
        System.out.println("The unsorted list of Countries are " + listofcountries);

        /*Unsorted List of Countries Using Loop */
        
        System.out.println("The unsorted list of Countries with Looping");
        for( String counter : listofcountries){
        	System.out.println(counter);
        }
        
        /* Sort Statement */
        
        Collections.sort(listofcountries);
        
        /* Sorted List*/
        
        System.out.println("After Sorting");
        
        for(String counter: listofcountries){
        	System.out.println(counter);
        }
        
        
	}
	
	@Test
	public void testIntegerSorting(){
	  ArrayList<Integer> arraylist = new ArrayList<Integer>();
	   arraylist.add(11);
	   arraylist.add(2);
	   arraylist.add(7);
	   arraylist.add(3);
	   /* ArrayList before the sorting*/
	   System.out.println("Before Sorting:");
	   for(int counter: arraylist){
			System.out.println(counter);
		}

	   /* Sorting of arraylist using Collections.sort*/
	   Collections.sort(arraylist);

	   /* ArrayList after sorting*/
	   System.out.println("After Sorting:");
	   for(int counter: arraylist){
			System.out.println(counter);
	   }

}
}
