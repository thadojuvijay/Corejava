package com.practice_delete;
import java.util.Scanner;
public class Prime_1_to_100
{
public static void main(String[] args) {
	
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter the number");
	int number = scanner.nextInt();
	
	for(int i=0;i<number;i++)
	{
		int temp=0;
		for(int j=1;j<=number;j++)
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
