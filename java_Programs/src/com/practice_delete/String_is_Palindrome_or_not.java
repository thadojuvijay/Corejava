package com.practice_delete;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class String_is_Palindrome_or_not {

	public static void main(String[] args) throws IOException {
		
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter the String");
	String reverse="";
	String original = reader.readLine();
	
	for(int i=original.length()-1;i>=0;i--)
	{
		
	reverse=reverse+original.charAt(i);
	}
	
	if(reverse.equals(original))
	{
		System.out.println("palindrome");
	}
	else
	{
		System.out.println("it is not a palindrome");
	}
	
	
	
	
	}
}
