package com.basicPrograms;

import java.util.Scanner;

/*
 * Armstrong Number in Java: Armstrong number is a number that is equal 
 * to the sum of cubes of its digits for example 0, 1, 153, 370, 371, 407 etc.

Let's try to understand why 153 is an Armstrong number.

153 = (1*1*1)+(5*5*5)+(3*3*3)  
where:  
(1*1*1)=1  
(5*5*5)=125  
(3*3*3)=27  
So:  
1+125+27=153  
 */



public class ArmStrong 
{
public static void main(String[] args) {
	int sum=0,a,temp;
	
	Scanner scanner=new Scanner(System.in);
	
	System.out.println("Enter the number");
	int n = scanner.nextInt();
	 temp=n;
	while(n>0)
	{
     		a=n%10;
     		sum=sum+(a*a*a);
     		n=n/10;
     		
	}
	if(temp==sum)
	{
		System.out.println("Arm strong");
	}
	else
	{
		System.out.println("not ArmStrong");
	}
	
}
}
