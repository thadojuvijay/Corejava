package com.Reverse_Strings;


import java.util.Scanner;

public class String_is_Palindrome_or_not
{
public static void main(String[] args) {
	
	Scanner in=new Scanner(System.in);
	System.out.println("Enter the String");
	
	String reverse="";
String original=in.nextLine();
System.out.println(original.length());

for(int i=original.length()-1;i>=0;i--)// thats why we are doing length-1;
{
	reverse=reverse+original.charAt(i); //charAt(index)//index start from 0 
}
System.out.println(reverse);
}
}
