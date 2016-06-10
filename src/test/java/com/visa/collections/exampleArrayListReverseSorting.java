package com.visa.collections;

import java.util.ArrayList;
import java.util.Collections;

import org.testng.annotations.Test;

public class exampleArrayListReverseSorting {
	
	
	@Test
	
	public void reverseArrayList(){
		
		ArrayList<String> arraylist = new ArrayList<String>();
		arraylist.add("AA");
		arraylist.add("BB");
		arraylist.add("CC");
		arraylist.add("DD");
		
		/*Unsorted List: ArrayList content before sorting*/
		
		System.out.println("Before Sorting");
		for( String str : arraylist){
			System.out.println(str);
		}
		
		/* Sorting in decreasing order*/
		
		Collections.sort(arraylist,Collections.reverseOrder());
		
		/* Sorted List in reverse order*/
		
		System.out.println("Arraylist in descending order:");
		for( String str1 : arraylist){
			System.out.println(str1);
		}
		
		
		
		
		
	}

}
