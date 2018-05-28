package com.Reverse_Numbers;


import java.io.IOException;

import java.util.Scanner;

public class Reverse_number {

	public static void main(String[] args) throws IOException {

		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number");
		int n = scanner.nextInt();
		int reverse,sum=0;    
		while(n>0)
		{
		reverse= n%10;
		sum=(sum*10)+reverse;
		n=n/10;
		}
		
    System.out.println(sum);
		

	}

}
