package com.interviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.Vector;

public class Remove_Duplicate_Numbers 
{
public static void main(String[] args) {
	
	int[] arr={1,2,1,3,2,3,4};
	int end = arr.length;
	Set<Integer> set = new HashSet<Integer>();

	for(int i = 0; i < end; i++){
	  set.add(arr[i]);
	}
	System.out.println(set);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

ArrayList<Integer>al=new ArrayList<>();
al.add(1);
al.add(2);
al.add(3);
Iterator<Integer>lo=al.iterator();
while(lo.hasNext())
{
	System.out.println(lo.next());
}
	



ListIterator<Integer>so=al.listIterator();
while(so.hasNext())
{
	System.out.println(so.next());
	
}



Vector<Integer>v=new Vector<>();
Enumeration<Integer>em=v.elements();
while(em.hasMoreElements())
{
	System.out.println(em.nextElement());
}

	




int n[]={1,4,5,3,4};






	
}
}
