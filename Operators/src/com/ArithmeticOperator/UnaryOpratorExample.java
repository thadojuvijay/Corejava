package com.ArithmeticOperator;

public class UnaryOpratorExample 
{
public static void main(String[] args) {
	int a=6;
	
	int b=++a;
	
	int c=b--;
	
	int d =a++ + --b- --c; // 8 6 6
	
	
	System.out.println(d);
}
}
