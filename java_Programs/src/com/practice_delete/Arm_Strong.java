package com.practice_delete;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Arm_Strong
{
public static void main(String[] args) throws IOException {
	
	BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter the number");
      
	String readLine = reader.readLine();
	int number = Integer.parseInt(readLine);
int a;
int sum=0;
int temp=number;
	while(number>0)
	{
		a=number%10;
		sum=sum+(a*a*a);
		number=number/10;
	}
	
	
	if(temp==sum)
	{
		System.out.println("Arm strong");
	}
	else
	{
		System.out.println("not arm strong");
	}
}
}
