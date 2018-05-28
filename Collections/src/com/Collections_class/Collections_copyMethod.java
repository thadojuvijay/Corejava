package com.Collections_class;

import java.util.ArrayList;
import java.util.Collections;

public class Collections_copyMethod 
{
	
	
	//copy method in Collections class is used to copy the one list elements 
	//into another list.
	//The list elements must should be equals to the another list elements..
	//if the list elements not equals to another list..then we will get 
	//indexboundofExcpetion.
	
public static void main(String[] args)
{
	ArrayList<String> al=new ArrayList<>();
	al.add("c");
	al.add("c++");
	al.add("java");
	al.add("oracle");
ArrayList<String>lk=new ArrayList<>();
lk.add("");
lk.add("");
lk.add("");
lk.add("");
	Collections.copy(lk, al);
	System.out.println(lk);
	System.out.println(al);
}
}
