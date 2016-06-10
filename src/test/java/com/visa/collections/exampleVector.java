package com.visa.collections;

import java.util.Vector;
import java.util.*;

public class exampleVector {
	
public static void main(String args[]){
	
	/* Vector of initial capacity(size) of 2 */
    Vector<String> vec = new Vector<String>(2);
    
    /* Adding elements to a vector*/
    vec.addElement("Element");
    vec.addElement("Orange");
    vec.addElement("Mango");
    vec.addElement("Fig");
    
    /* check size and capacityIncrement*/
    System.out.println("The size is:" + vec.size());
    System.out.println("Default capacity increment is: " + vec.capacity());
    
    
    vec.addElement("first");
    vec.addElement("second");
    vec.addElement("third");
    
    
    /* check size and capacityIncrement*/
    System.out.println("The size is:" + vec.size());
    System.out.println("Default capacity increment is: " + vec.capacity());
    
    
    /* Display Vector Elements */
    
    Enumeration en = vec.elements();
    System.out.println("\n Elements are:");
    
    while(en.hasMoreElements())
    	System.out.println("Elements are:" + en.nextElement());
}
	
	
	

}
