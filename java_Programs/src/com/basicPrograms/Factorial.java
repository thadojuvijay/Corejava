package com.basicPrograms;

/*
 * Factorial Program in Java: Factorial of n is the product of all 
 * positive descending integers. Factorial of n is denoted by n!. For example:

4! = 4*3*2*1 = 24  
5! = 5*4*3*2*1 = 120 
 */
public class Factorial 
{
public static void main(String[] args) {
	
	int fact=1;
for(int i=1;i<=5;i++)
{
	fact=fact*i;
}
	
	System.out.println(fact);
	
}

}