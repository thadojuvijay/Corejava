package com.practice_delete;
import java.util.Scanner;
public class Prime_or_not
{
	
public static void main(String[] args)
{
Scanner scanner=new Scanner(System.in);
System.out.println("Enter the number");
	int number = scanner.nextInt();
	int temp=0;
	for(int i=1;i<=number;i++)
	{
		if(number%i==0)
		{
			temp++;
			
		}
		
	}
	if(temp==2)
	{
		System.out.println("it is a prime");
	}
	else {
		System.out.println("it is not prime");
	}
	
}
}
