package com.Map;

import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
public class EXample1
{
public static void main(String[] args) {
	
	Map<Integer,String>m=new HashMap<>();
	m.put(1, "vijay");
	m.put(2, "ajay");
	m.put(3, "uday");
	
	Set<Integer>set=m.keySet();
	
	Iterator<Integer>iterator=set.iterator();
	while(iterator.hasNext())
	{
	
		Integer key=iterator.next();
		System.out.println(m.get(key));
	}
}
	
}
