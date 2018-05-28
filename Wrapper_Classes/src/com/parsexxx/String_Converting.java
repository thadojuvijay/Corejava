package com.parsexxx;

public class String_Converting 
{
public static void main(String[] args) {
	
	//converting String number into Integer
	
	String s="1867";
	Integer integer = Integer.valueOf(s);
	System.out.println(integer);
	
	//converting String alphabets into Integer 
	//we cannot convert string alphabets into Integer.
	
    /*String s1="hai";
    Integer valueOf = Integer.valueOf(s1);
    System.out.println(valueOf);*/
	
	
	//cannot convert String alphabets into Integer
	String sy="Hello";
	int parseInt = Integer.parseInt(sy);
	System.out.println(parseInt);
	
	
	
	//converting the Integer into String
	int a=19;
	String valueOf1 = String.valueOf(a);
	System.out.println(valueOf1);
	
	
	
}
}
