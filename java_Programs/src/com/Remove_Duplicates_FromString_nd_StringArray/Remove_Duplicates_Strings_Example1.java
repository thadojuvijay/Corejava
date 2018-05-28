package com.Remove_Duplicates_FromString_nd_StringArray;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Remove_Duplicates_Strings_Example1
{
public static void main(String[] args) {
	
	
	String s="viiijjay";
//List<String> list = Arrays.asList(s);
//we can supply an Array.we can store one object also.it internally writes{"viiijay"}

	String[] split = s.split("");
	//if we use split method,it will convert one one word into string[]
	//like this {"v","i","i","i","j","j","a","y"};
	System.out.println("split========"+split);
	
	for (String string : split) {
		System.out.print(string);
	}

	System.out.println();
	
	
	
List<String> list = Arrays.asList(split);//{"v","i","i","i","j","j","a","y"};
System.out.println("list===="+list);


Set<String> uniqueWords = new HashSet<String>(list);
for (String word : uniqueWords)
{
    System.out.print(word + ":" + Collections.frequency(list, word)+"  ");
}


	
	
}
}
