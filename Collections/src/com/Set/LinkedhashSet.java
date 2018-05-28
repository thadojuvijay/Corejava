package com.Set;


import java.util.Iterator;
import java.util.LinkedHashSet;


public class LinkedhashSet
{
public static void main(String[] args) {
	LinkedHashSet<String> set=new LinkedHashSet<>();
	/*
	 * LinkedHashset is not allows duplicate values..if it is same value or element it will override that elemet.
	 */
	set.add("vijay");
	set.add("vijay");
	System.out.println("Not allow Duplicate elements or values============="+set);
/*
 * 	LinkedHashset allows null values..
 */
	set.add(null);
	System.out.println("allows null values===="+set);
	
   /*
    * LinkedHashset doesn't guarantee the insertion order.
    */
	set.add("uday");
	set.add("shashi");
	set.add("raju");
	System.out.println("does  guarentee the insertion order====="+set);
	
	
set.remove("uday");
System.out.println(set);

LinkedHashSet< String> s=new LinkedHashSet<>();
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
