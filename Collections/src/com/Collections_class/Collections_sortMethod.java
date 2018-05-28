package com.Collections_class;

import java.util.ArrayList;
import java.util.Collections;

public class Collections_sortMethod
{
public static void main(String[] args) {
	ArrayList<String> al=new ArrayList<>();
	al.add("c");
	al.add("a++");
	al.add("java");
	al.add("oracle");
	System.out.println(al);
	Collections.sort(al);
	System.out.println(al);
	
	
	ArrayList<Integer>lk=new ArrayList<>();
	lk.add(4);
	lk.add(3);
	lk.add(2);
	lk.add(1);
	System.out.println(lk);
	Collections.sort(lk);
	System.out.println(lk);
}
}
