package com.basicPrograms;

import java.util.Scanner;

public class Prime_Number_or_Not {
	public static void main(String[] args) 
	{
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number");
		int n = scanner.nextInt();
		int temp=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				temp++;
			}
		}
		if(temp==2)
		{
			System.out.println("prime number");
		}
		else
		{
			System.out.println("not a prime number");
		}

	
		
		
		
		
		
	}

}
