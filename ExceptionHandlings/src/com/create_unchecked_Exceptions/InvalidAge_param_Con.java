package com.create_unchecked_Exceptions;

public class InvalidAge_param_Con extends RuntimeException
{
	/*
	 * for creating  user defined unchecked exceptions 
	 * we will extends our class with RunTimeException class
	 * 
	 * unchecked exception are runtime exceptions we cannot handle at compile time.
	 * we can handle after the jvm display the exception only.
	 * then we can handle that exception by using try catch blocks.
	 * 
	 * if we not used super parameterized constructor of RuntimeException class.
	 * then jvm not display our msg.when exception occurs.
	 * if we want jvm to display our exception msg,
	 * we must use the super() class parameterized constructor of RuntimeException class.
	 */
	public InvalidAge_param_Con(String str) {
		super(str);
	}
	
}
