package com.Finally;

public class Case8
{
	public static void main(String[] args) {
		
		//once the try block executed then only the catch or finally will executed.
		//if we not write exception code in try block.it will not handle the exception
	//and also it will not executed finally block
		
		System.out.println(10/0);
		try{
			System.out.println("try");
			
		}
		catch (Exception e)
		{
			System.out.println("catch");
		}

		
		finally {
			System.out.println("finally");
		}

	}
}
