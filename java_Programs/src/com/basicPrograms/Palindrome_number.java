package com.basicPrograms;

import java.io.BufferedReader;
import java.io.IOException;

import java.util.Scanner;

public class Palindrome_number {

	public static void main(String[] args) throws IOException {

		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number");
		int n = scanner.nextInt();
		int reverse,sum=0,temp;    
	
		
		
		temp=n;
		while(n>0)
		{
		reverse= n%10;
		sum=(sum*10)+reverse;
		n=n/10;
		}
		
		if(temp==sum)
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not a palindrome");
		}
		
		

	}

}
