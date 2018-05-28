package com.interviewQuestions;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Remove_Duplicates_From_String {

	public static void main(String[] args) {

		String s="aabbcddefgg";

		char[] chars = s.toCharArray();
		
		//The Character class wraps a value of the primitive type char in an object.
		//An object of type Character contains a single field whose type is char. 
		
	    Set<Character> charSet = new LinkedHashSet<Character>();
	    
	    for(int i=0;i<chars.length;i++)
	    {
	    	
	    charSet.add(chars[i]);	
	    }
	    
	    System.out.println(charSet);
	    
	    
	  Iterator<Character> iterator = charSet.iterator();
	  while(iterator.hasNext())
	  {
		  System.out.print(iterator.next());
	  }
	  System.out.println();
	  
	  
	 Object[] array = charSet.toArray();
	 int length = array.length;
	 System.out.println(length);
	 
	 for(int i=0;i<array.length;i++)
	    {
	    System.out.print(array[i]);
	    }
	 
	 
	
	
	 
	 
	 

	    
}
}