package com.iterator;

import java.util.ArrayList;
import java.util.Iterator;

import com.enumerations.Employee;

public class Arraylist_iterator 
{
	public static void main(String[] args) {
		

		ArrayList<Integer>a=new ArrayList<>();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		a.add(5);

		Iterator<Integer> iterator = a.iterator();

		while(iterator.hasNext())
		{
			
			System.out.println(iterator.next());
		}
		
		
	}
}
