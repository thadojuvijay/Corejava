package com.List;

import java.util.LinkedList;

public class Linkedlist 
{
public static void main(String[] args) {
	
	LinkedList<Integer>list=new LinkedList<>();
	/*
	 * linkedlist is an implementation class of List Interface
	 * Linkedlist can be used for storing individual values.
	 * Linkedlist follows double liked list structure.
	 * LinkedList is not synchronized.
	 * LinkedList object can be created in 2 ways
	 * public LinkedList() { }
	 * 
	 * write how many ways we can  Linkedlist object.
	 */
	list.add(1);
	list.add(8);
	list.add(5);
	System.out.println("storing individual objects====================" +list);
	
/*
 * linkedlist allows duplicate values
 */
list.add(2);
list.add(2);
System.out.println("Allows duplicate values ==================="+list);

/* 
 * linkedlist allows null values
 */
list.add(null);
System.out.println("Allows null values=============="+list);

/*
 * linkedlist can store values in insertion order.when print the output it will come same  as in which format you give input.
 */

list.add(1);
list.add(7);
list.add(4);
list.add(9);
System.out.println("insertion order=================="+ list);
}
}
