package com.How_Many_We_can_print_Exceptions;

public class Test {

	
	//we can print exception in 4 ways
	//1.directly we can print reference of exception which we got.it internally calling toString()
	//2.By using getMessage() method.this will print the message of exception
	//3.printStackTrace() will print entire exception detaily
	//4.if we not handle the exception by catch block,
	//then jvm will call internaly printStackTrace() method
	
	public static void main(String[] args) {
	
		try{
			System.out.println(10/0);
		}
        catch (ArithmeticException e) 
		{
	
        	System.out.println("directReference    " +e); //toString() calling internally
        	System.out.println("=======================");
        	System.out.println("getMeassage()         "+e.getMessage());//getMessage()
        	System.out.println("========================");
        	System.out.println("getLocalizedMesage   "+e.getLocalizedMessage());
        	System.out.println("=========================");
        	e.printStackTrace();
        	
        
        	
        	
		}
		
	}

}
