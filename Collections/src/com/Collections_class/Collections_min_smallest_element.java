package com.Collections_class;

import java.util.ArrayList;
import java.util.Collections;

public class Collections_min_smallest_element 
{
public static void main(String[] args) {
	
	Integer []a={1,3,4,8,9,3,6};
	ArrayList<Integer>al=new ArrayList<>();
for(int b=0;b<a.length;b++)
{
	al.add(a[b]);
}
System.out.println(al);
	Integer min = Collections.min(al);
	System.out.println(min);
}
}
