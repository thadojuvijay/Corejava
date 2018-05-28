package com.basicPrograms;

import java.util.Scanner;

public class Palindrome_String 
{
public static void main(String[] args) {
	
	String reverse="";
	
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter a string");
	String original = scanner.nextLine();
	int length = original.length();
	
	for(int i=length-1;i>=0;i--)
	{
		reverse=reverse+original.charAt(i);
	}
	
	if(original.equals(reverse))
	{
		System.out.println("it is palindrome");
	}
	else
	{
		System.out.println("not palindrome");
	}
}
}
