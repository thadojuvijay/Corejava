package com.Collections_class;

import java.util.ArrayList;
import java.util.Collections;

public class Collections_reversemethod 
{
public static void main(String[] args) {
	
	ArrayList<String> al=new ArrayList<>();
	al.add("vijay");
	al.add("uday");
	Collections.reverse(al);
	System.out.println(al);
	
	
	
	String s="vijay";
	char[] charArray = s.toCharArray();
	ArrayList<Character>ac=new ArrayList<>();
	for(int i=0;i<charArray.length;i++)
	{
		ac.add(charArray[i]);
	}
	System.out.println(ac);
	Collections.reverse(ac);
	System.out.println(ac);

}
}
