package com.create_Checked_Exceptions;




public class Parameterized_Constructor_Checked_Exception extends Exception
{
	/*
	 * if we not used super parameterized constructor of exception class.
	 * then jvm not display our msg.when exception occurs.
	 * if we want jvm to display our exception msg,
	 * we must use the super() constructor of Exception class.
	 */
	
	
	
public Parameterized_Constructor_Checked_Exception(String str) {
	super(str);
}
}
