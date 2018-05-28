package com.create_Checked_Exceptions;

import java.util.Scanner;

public class Age_Throw_Param {

	static void ageRestrictions(int age)throws Parameterized_Constructor_Checked_Exception
	{
		if(age>20)
		{
			System.out.println("eligible for election");
		}
		else
		{
			throw new Parameterized_Constructor_Checked_Exception("InvalidAge");
		}
	}
	public static void main(String[] args) throws  Parameterized_Constructor_Checked_Exception
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter youtr age");
		int age = in.nextInt();
Age_Throw_Param.ageRestrictions(age);

	}
}
