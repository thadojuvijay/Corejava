package com.enumerations;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Stack;

public class Stack_enumeration {

	public static void main(String[] args) {
	
		Stack<Integer>al=new Stack<>();
		al.add(1);
		al.add(2);
		al.add(3);
		Enumeration<Integer> elements = al.elements();
		while(elements.hasMoreElements())
		{
			System.out.println(elements.nextElement());
		}
		
		Iterator<Integer> iterator = al.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		
		ListIterator<Integer> listIterator = al.listIterator();
		
		while(listIterator.hasNext())
		{
		System.out.println(listIterator.next());	
		}	
		
		
		
		
		
	}
}
