package com.iterator;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMap_iterator 
{
	public static void main(String[] args) 
	{
	HashMap<String, Integer>hl=new HashMap<>();
	hl.put("one",1);
	hl.put("two",2);
	hl.put("three",3);

	Set<String> set = hl.keySet();
	Iterator<String> iterator = set.iterator();
	while(iterator.hasNext())
	{
		System.out.println(iterator.next());
	}
}
}