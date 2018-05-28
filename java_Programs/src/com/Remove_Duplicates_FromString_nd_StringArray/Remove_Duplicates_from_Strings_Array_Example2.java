package com.Remove_Duplicates_FromString_nd_StringArray;


public class Remove_Duplicates_from_Strings_Array_Example2 {

	public static void main(String[] args) {
	
		String []a={"vijay","vijay","vijay","uday","uday","vijay"};
		

		for(int i=0;i<a.length;i++)
		{
			
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i].equals(a[j])){
					
				System.out.println(a[i]);
				
				}
				
			}
		}
			
		}
		
	}

