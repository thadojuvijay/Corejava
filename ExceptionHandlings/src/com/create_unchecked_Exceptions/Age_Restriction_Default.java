package com.create_unchecked_Exceptions;

import java.util.Scanner;

/*
 * here using the throws keyword optional,because we will get unchecked exceptions
 * at runtime then we will not get any excpetions at compile time.
 * then we will use thorws keyword only at compiletime errors or Checked Exceptions.
 */

public class Age_Restriction_Default 
{

	static void ageRestrictions(int age)
	{
		if(age>20)
		{
			System.out.println("eligible for election");
		}
		else
		{
			throw new InvalidAge_Default_cons();
		}
	}
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter youtr age");
		int age = in.nextInt();
		Age_Restriction_Default.ageRestrictions(age);


	}
}
