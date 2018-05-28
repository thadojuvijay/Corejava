package com.Current_class_constructor;

public class Example2 
{
	
	
	//Calling parameterized constructor from default constructor
	
	public Example2() {
		this(10);
		System.out.println("Example2() constructor");
		
		
	}
	
	public Example2(int a) {
		System.out.println("parameterized constructor()");
	}
	
public static void main(String[] args)
{
	Example2 example2=new Example2();
}
}
