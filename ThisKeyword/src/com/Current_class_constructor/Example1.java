package com.Current_class_constructor;

public class Example1 

{
/*
 * /The this() constructor call can be used to invoke the current class constructor.
	It is used to reuse the constructor. In other words, it is used for constructor chaining.

Calling default constructor from parameterized constructor:
 */
	public Example1() {
	System.out.println("Zero parameter constructor()");
	}
	
	Example1(int a)
	{
		this();
		System.out.println("parameterized constructor()");
	}
	
	public static void main(String[] args) {
		Example1 example1=new Example1(10);
		
	}


}
