package com.visa.collections;

import java.util.ArrayList;

import org.testng.annotations.Test;

public class TestArrayListSwap {
	
	@Test
	public void testArrayListSwap(){
		
		exampleArrayListSwap ex = new exampleArrayListSwap();
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("rahul");
		arr.add("soma");
		arr.add("selina");
		arr.add("happy");
		
		System.out.println("Before");
		for(String pr : arr){
			System.out.println(pr);
		}
		
		ex.arrayListSwap(arr, 1, 2);
		
		System.out.println("After");
		for(String pr : arr){
			System.out.println(pr);
		}
		
	}

}
