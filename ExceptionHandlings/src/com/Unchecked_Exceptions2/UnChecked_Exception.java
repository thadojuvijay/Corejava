package com.Unchecked_Exceptions2;

public class UnChecked_Exception
{
public static void main(String[] args) {
	
	String s=null;  
	System.out.println(s.length());//NullPointerException  
	
	String s1="abc";  
	int i=Integer.parseInt(s1);//NumberFormatException 
	
	
	
	int a[]={1,2,3,4,5};  
	System.out.println(a[5]); //ArrayIndexOutOfBoundsException  
}
}
