package com.visa.collections;

import java.util.LinkedList;

import org.testng.annotations.Test;

public class exampleLinkedList {
	
	@Test
	public void exampleLinkedList1(){
		
		/* Linked List Declaration */
		LinkedList<String> linkedlist = new LinkedList<String>();
		linkedlist.add("Item1");
		linkedlist.add("Item5");
		linkedlist.add("Item3");
		linkedlist.add("Item6");
		linkedlist.add("Item2");
		
		/*Display Linked List Content*/
		System.out.println("The linkedlist contents are" + linkedlist);
		
		/*Add First and Last Element*/
		linkedlist.addFirst("First Item");
		linkedlist.addLast("Last Item");
		System.out.println("LinkedList content after addition: " + linkedlist);
		
		/*This is how to get and set Values*/
		Object firstvar = linkedlist.get(0);
		System.out.println("First Element :" + firstvar);
		linkedlist.set(0, "Changed First Item");
		Object firstvar2 = linkedlist.get(0);
		System.out.println("First element after update by set method: " +firstvar2);
		
		/*Remove first and last element*/
        linkedlist.removeFirst();
        linkedlist.removeLast();
        System.out.println("LinkedList after deletion of first and last element: " +linkedlist);
		
		
        /* Add to a Position and remove from a position*/
        linkedlist.add(0,"Newly Added Item");
        linkedlist.remove(2);
        System.out.println("Final Content: " + linkedlist);
        
        
	}
	
	

}
