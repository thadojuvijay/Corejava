package com.sortingPrograms;

import java.util.Arrays;

public class Sort_Names_By_Alphabetic_Order_StringArray 
{
	
	public static String[] sortNames_AlphabeticOreder_using_Collection(String[] names)
	{
	Arrays.sort(names);
		return names;
	
	}
	

	public static String[] sortNames_case1(String[] names) 
	{
		String temp="";
	for(int i=0;i<names.length;i++)
	{
		for(int j=i+1;j<names.length;j++)
		{
			System.out.println(names[i].compareTo(names[j]));
			System.out.println(names[i].compareTo(names[j])>0);
			
			if(names[i].compareTo(names[j])>0)
			{
			temp=names[i];	
			names[i]=names[j];
			names[j]=temp;
			}
		}
	}		
		return names;
	}
	
	
	
	public static void main(String[] args) {
		

		String[] names={"Rajesh","vijay","Balu","Ajay","Uday"};
		System.out.println("Sorting_using_Collections===========================");
		String[] oreder_using_Collection = sortNames_AlphabeticOreder_using_Collection(names);
		
		for (int i = 0; i < oreder_using_Collection.length; i++) 
		{
			System.out.println(oreder_using_Collection[i]);
		}
		
		System.out.println("======================================================");
	
		String[] names1={"Rajesh","vijay","Balu","Ajay","Uday"};
		String[] sortNames_By_AlphabeticOrder = sortNames_case1(names1);
		System.out.println("sortNames_case1=================");
		for (int i = 0; i < sortNames_By_AlphabeticOrder.length; i++) {
			System.out.println(sortNames_By_AlphabeticOrder[i]);
		}
		
		
	
	}

}
	
		