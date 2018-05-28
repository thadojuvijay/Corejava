package com.create_unchecked_Exceptions;

import java.util.Scanner;

public class Age_Restrictions_Param 
{
	/*
	 * here using the throws keyword optional,because we will get unchecked exceptions
	 * at runtime then we will not get any excpetions at compile time.
	 * then we will use thorws keyword only at compiletime errors or Checked Exceptions.
	 */
	static void ageRestrictions(int age)
	{
		if(age>20)
		{
			System.out.println("eligible for election");
		}
		else
		{
			throw new InvalidAge_param_Con("invalidAge please enter valid age");
		}
	}
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter youtr age");
		int age = in.nextInt();
		Age_Restrictions_Param.ageRestrictions(age);
}
}
