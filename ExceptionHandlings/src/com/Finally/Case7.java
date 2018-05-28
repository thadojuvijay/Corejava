package com.Finally;

public class Case7
{
public static void main(String[] args) {
	try{
		System.out.println("try");
		System.exit(0); // then jvm will shutdown so it will not execute finally
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
