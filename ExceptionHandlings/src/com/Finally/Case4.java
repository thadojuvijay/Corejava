package com.Finally;

public class Case4 
{
	public static void main(String[] args) {
		
		
		try{
			System.out.println(10/0);
		}
		
		catch(NullPointerException e)
		{
			
			System.out.println(10/0);
		}
		
		finally {
			System.out.println("finally");
		}
	}
}
