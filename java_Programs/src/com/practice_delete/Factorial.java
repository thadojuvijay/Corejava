package com.practice_delete;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Factorial 
{
public static void main(String[] args) throws IOException 
{
	System.out.println("hello");
	int fact=1;
	BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("ENTER THE NUMBER");
	String readLine = reader.readLine();
	int number = Integer.parseInt(readLine);
	
	for(int i=1;i<=number;i++)
	{
		fact=fact*i;
	}
	System.out.println(fact);
}
}
