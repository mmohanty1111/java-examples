package com.visa.collections;

import java.util.HashMap;
import java.util.Scanner;

public class exampleHaspMap_repeatedCharacter {

public static void main(String args[])

{
	System.out.println("Please enter the string");
	Scanner scan = new Scanner(System.in);
	String str = scan.nextLine();
	char c = firstNonRepeatedCharacter(str);
	System.out.println("The first non repeated character" + c);
	

}


public static Character firstNonRepeatedCharacter(String s)
{
	HashMap<Character,Integer> hashmap = new HashMap<Character,Integer>();
	int i, length;
	Character c;
	length = s.length(); // Scan string and build hash table
	
	for(i = 0 ; i< length; i++){
		c= s.charAt(i);
		if(hashmap.containsKey(c)){
			// increment count corresponding to c
			hashmap.put(c, hashmap.get(c)+1);
		}
		else{
			hashmap.put(c, 1);
			
		}
	}
	 // Search characterhashtable in in order of string str
	
	for(i=0; i<length ;i++)
	{
		c=s.charAt(i);
		if(hashmap.get(c)==1)
			return c;
	}
	
	return null;
}
}
