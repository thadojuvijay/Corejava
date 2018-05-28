package com.basicPrograms;


//Fibonacci numbers are sum of two previous numbers
//0,1,1,2,3,5,8,13,21,34,55,89
public class Fibonacci_Program 
{
	
public static void main(String[] args) {
	int n1=0,n2=1,n3;	
	for(int i=0;i<10;i++)
	{
		n3=n1+n2;
		System.out.println(n3);
	    n1=n2;
	    n2=n3;
	
		
	}
	
}
}
