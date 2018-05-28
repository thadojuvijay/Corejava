package com.interviewQuestions;

import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeSet;

public class How_to_sort_Number_in_ascendingorder 
{
public static void main(String[] args) {
	
	int[]a ={1,9,8,2,3,5,4,6,7};
    Arrays.sort(a);

    for(int i=0;i<a.length;i++)
    {
    	System.out.print(" "+a[i]);
    }
	
	System.out.println();
	
    TreeSet<Integer>ts=new TreeSet<>();
    
    for(int i=0;i<a.length;i++)
    {
    	ts.add(a[i]);
    }
    Iterator<Integer> iterator = ts.iterator();
    while(iterator.hasNext())
    {
    	System.out.print(" "+iterator.next());
    }
}
}
