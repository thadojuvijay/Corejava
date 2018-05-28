package com.Finally;

public class Case1 {

	public static void main(String[] args) {
		try{
			
			System.out.println("try");
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
		}
		finally{
			
			System.out.println("finally");
		}
		

	}

}
