package com.Reverse_Strings;

public class Reverse_String_case1 
{
	static char reverse;
	public static void main(String[] args) {
		
		
		String str="vijaykumar";
		char[] charArray = str.toCharArray();
		
		for(int i=charArray.length-1;i>=0;i--)
		{
			
		System.out.print(str.charAt(i));
		}
		
			}
}
