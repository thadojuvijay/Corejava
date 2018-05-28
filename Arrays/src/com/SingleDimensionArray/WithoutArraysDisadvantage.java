package com.SingleDimensionArray;

public class WithoutArraysDisadvantage 
{
public static void main(String[] args) {
	
	//1,2,3,4,5,5
	
	int a=1;
	int b=2;
	int c=3;
	int d=4;
	int e=5;
	
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
	System.out.println(d);
	System.out.println(e);
	
	
	int []a1={1,2,3,4,5};
	System.out.println(a1[0]);
	
	for(int i=0;i<a1.length;i++)
	{
		System.out.println(a1[i]);
	}
	//System.out.println(a1[5]);
}
}
