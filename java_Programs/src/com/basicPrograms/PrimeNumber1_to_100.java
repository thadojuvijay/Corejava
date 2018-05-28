package com.basicPrograms;

public class PrimeNumber1_to_100 
{
	
	
public static void main(String[] args) {
	
	
	
	for(int i=0;i<=100;i++)
	{
		int temp=0;
		for(int j=1;j<=i;j++)
		{
			if(i%j==0)
			{
				temp++;
			}
		}
		
		if(temp==2)
		{
		System.out.println(i);	
		}
		
		
	}
	
	
}
}
