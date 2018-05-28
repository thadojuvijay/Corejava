package com.create_Checked_Exceptions;

import java.util.Scanner;

public class Age_Throw {

	
	/*
	 * step1: first we create the userDefined exception by extending Exception class
	 * step2: user that userdefined exception object in our class.
	 * step 3:if we want jvm to handle our exception and display info.we will give 
	 * our used defined exception object to the jvm.
	 *by using throw keyword. 
	 */
	
	static void ageRestrictions(int age)throws Defaul_Contructor_Checked_Exception
	{
		if(age>20)
		{
			System.out.println("eligible for election");
		}
		else
		{
			throw new Defaul_Contructor_Checked_Exception();
		}
	}
	public static void main(String[] args) throws  Defaul_Contructor_Checked_Exception
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter youtr age");
		int age = in.nextInt();
	Age_Throw.ageRestrictions(age);	

	}

}
