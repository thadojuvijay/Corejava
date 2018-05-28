package com.type_casting;

public class Case4
{
public static void main(String[] args) {
	Child c=(Child)new Parent();
	c.display();
	c.msg();
	c.show();
	
	/*
	 * in the above example c is the reference  variable of child class,referring 
	 * to an object of parent Class.This code is valid during Compilation time,
	 * but invalid during execution time,downcasting is not allowed
	 */
	
}
}
