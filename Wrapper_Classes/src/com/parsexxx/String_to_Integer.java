package com.parsexxx;

public class String_to_Integer 
{
public static void main(String[] args) {
	
	//Converting String to int
	
	String s="hai";
	//int parseInt = Integer.parseInt(s);
	//System.out.println(parseInt);
	
	
	String a="1234";
	int parseInt = Integer.parseInt(a);
	System.out.println(parseInt);
	
	//
	Integer valueOf2 = Integer.valueOf(a);
	System.out.println(valueOf2);
	
	//
	int value = valueOf2.intValue();
	System.out.println(value);
	
    Integer i11= new Integer(10);
    
    System.out.println("i1-------"+i11);
    System.out.println("i1-------"+new Integer(10));
	
	System.out.println("obj--------"+new String_to_Integer());
    
	String_to_Integer integer = new String_to_Integer();
	
	System.out.println("obj--------"+integer.toString());
	   
	
	//converting integer or int to String.
	
	int i=10;
	String valueOf = String.valueOf(i);
	System.out.println(valueOf);
	
	
	
	Integer i1=new Integer(1);
	String valueOf3 = String.valueOf(i1);
	System.out.println(valueOf3);
	
	
	
	
	
	
	
	
	
}
}
