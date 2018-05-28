package com.List;

import java.util.ArrayList;


public class Arraylist 
{
public static void main(String[] args) {
	ArrayList<Integer> list=new ArrayList<>();
	
/* 
 * Arraylist can be used for storing individual objects.
 * Arraylist follows resizable array structure.
 * Arraylist object can be create in three ways 
 * 1. ArrayList<E> list=new ArrayList<E>();
 * 2. ArrayList<E> list=new ArrayList<E>(int initialCapacity);
 * 3. ArrayList<E> list=new ArrayList<E>(Collection C);
 * Arraylist is not synchronized.
 * write how many ways we can  Arraylist.
 */
	
	list.add(1);
	list.add(8);
	list.add(5);
	System.out.println("storing individual objects====================" +list);
	
/*
 * list allows duplicate values
 */
list.add(2);
list.add(2);

System.out.println("Allows duplicate values ==================="+list);

/* 
 * list allows null values
 */
list.add(null);
System.out.println("Allows null values=============="+list);

/*
 * list can store values in insertion order.when print the output it will come same  as in which format you give input.
 */

list.add(1);
list.add(7);
list.add(4);
list.add(9);
list.add(10, 87);
System.out.println("insertion order=================="+ list);

ArrayList l=new ArrayList();
l.addAll(list);
System.out.println(l);
Object[] array = l.toArray();
for (Object object : array) {
	System.out.println(object);
}
l.clear();
System.out.println("clear========"+l);
	}
}
