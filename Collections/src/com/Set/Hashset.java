package com.Set;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class Hashset 
{
public static void main(String[] args) {
	
	HashSet<String> set=new HashSet<>();
	
	/*
	 * Hashset is not allows duplicate values..if it is same value or element it will override that elemet.
	 */
	set.add("vijay");
	set.add("vijay");
	System.out.println("Not allow Duplicate elements or values============="+set);
/*
 * 	Hashset allows null values..
 */
	set.add(null);
	System.out.println("allows null values===="+set);
	
   /*
    * Hashset doesn't guarantee the insertion order.
    */
	set.add("uday");
	set.add("shashi");
	set.add("raju");
	System.out.println("doesnot guarentee the insertion order====="+set);
	
	
set.remove("uday");
System.out.println(set);

HashSet< String> s=new HashSet<>();
s.addAll(set);
System.out.println(s);



Iterator<String> iterator = set.iterator();
System.out.println(iterator);
for (String a : s) {
	System.out.println(a);
}

int size = set.size();
System.out.println(size);



boolean contains = set.contains("vijay");
System.out.println(contains);

boolean empty = set.isEmpty();
System.out.println(empty);

boolean remove = set.remove("raju");
System.out.println(remove);

System.out.println(set);

Object clone = set.clone();
System.out.println(clone);
set.add("dj");
System.out.println(set);
System.out.println(clone);


set.clear();
System.out.println(set);
	
}
}
