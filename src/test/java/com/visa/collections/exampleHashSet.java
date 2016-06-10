package com.visa.collections;

import java.util.HashSet;
import java.util.Iterator;

class exampleHashSet{ 
  public static void main(String[] args) {
     // Create a HashSet
     HashSet<String> hset = new HashSet<String>();
 
    hset.add("Mango");
    hset.add("Apple");
    hset.add("Apple");
    hset.add("Pear");
    
    Iterator<String> itt = hset.iterator();
    while(itt.hasNext())
    {
    	System.out.println(itt.next());
    }
    
    HashSetIterator();
  }
  
  
  public static void HashSetIterator()
  {

	  HashSet<String> hset1 = new HashSet<String>();
	  hset1.add("Chhaha");
	  hset1.add("nissn");
	  hset1.add("Nnnejs");
	  
	  for(String s : hset1)
	  {
		  System.out.println(s);
	  }
	  
	  
  }
}