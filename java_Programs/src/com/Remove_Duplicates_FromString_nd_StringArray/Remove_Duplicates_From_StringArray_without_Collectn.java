package com.Remove_Duplicates_FromString_nd_StringArray;

public class Remove_Duplicates_From_StringArray_without_Collectn 
{
	public static void   removeDuplicate(String[] s)
	{
		String removedup=" ";
		
		
		for(int i=0;i<s.length;i++)
		{
			
			for(int j=i+1;j<s.length;j++)
			{
				if(s[i].equals(s[j])) //== operator will not work
				{
					s[j]=removedup;
				}
			}
	
		}
	
		
	for (int i = 0; i < s.length; i++) 
	{
		
		if(s[i]!=" ")
		{
			System.out.println(s[i]);
		}

	}
	}
		
	public static void main(String[] args)
	{	
		String []name={"vijay","vijay","Ajay","Ajay","rajesh","uday"};
          removeDuplicate(name);
	}
}
