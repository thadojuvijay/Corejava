package com.Remove_Duplicates_FromString_nd_StringArray;

public class Remove_Duplictes_String_without_Collections
{	
	public static char[]   removeDuplicates(String s)
	{
		char[] charArray = s.toCharArray();
		char temp=' ';
		int count=1;
		for(int i=0;i<charArray.length;i++)
		{
			for (int j =i+1; j < charArray.length; j++)
			{
				if(charArray[i]==charArray[j])
				{
				        charArray[j]=temp;	
				        count++;
				} 
			}
			if(charArray[i]!=' ' && count!=1){
		      System.out.println("charr---"+charArray[i]+" is repeated "+count+" times.");	
			}
			count=1;
	   }
		
		//removing spaces using replace method 
		//remove spaces in different types write that logic

		System.out.println("case 1");
		
		for (int i = 0; i < charArray.length; i++) {
			
			if(charArray[i]!=' ')
			{
				System.out.println(charArray[i]);
			}
		}
		

		System.out.println("case 2");
		
		String string=new String(charArray);
		System.out.println(string);
		String replaceAll = string.replace(" ","");
		System.out.println(replaceAll);
		char[] charArray2 = replaceAll.toCharArray();
		
		
		
		
		return charArray2;
	}
	
	
	
	public static void main(String[] args) {
		
		String s="viiijjjayyyaa";
        char[] removeDuplicates2 = removeDuplicates(s);
		for (int i = 0; i < removeDuplicates2.length; i++) 
		{
			
			System.out.println(removeDuplicates2[i]);
		}
		
	}
	
	
	public static void dupMethod(char ch){
		
		
		
	}
	
}
