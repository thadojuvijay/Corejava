package com.Current_class_constructor;

public class Example3
{
	
	
	
	// Rule: Call to this() must be the first statement in constructor.
	
	public Example3() {
		
		System.out.println("Example2() constructor");
		//this(10);
		
	}
	
	public Example3(int a) {
		System.out.println("parameterized constructor()");
	}
	
public static void main(String[] args)
{
	Example3 example3=new Example3();
}
}
