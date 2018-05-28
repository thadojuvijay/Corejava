package com.finalize;

public class FInalize_method 
{
	
	
/*	Called by the garbage collector on an object when garbage collection
    * determines that there are no more references to the object.
    * A subclass overrides the {@code finalize} method to dispose of
    * system resources or to perform other cleanup*/
	
public static void main(String[] args) throws Throwable {
	
	//System.out.println("obj finalize---"+new Object().);
	
	
	Student student = null ;
	new Student().finalize();
	System.out.println();
	

	
}
}
