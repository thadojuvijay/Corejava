package com.methodOverloading;

public class Method_Overloading 
{
	//types of parameters
	public void add(int x,double y)
	{
		System.out.println("add(int x,double y)"+(x+y));
		
	}
	//order of parameters
	 public void add(double x,int y)
	 {
		 System.out.println("add(double x,int y)"+(x+y));
	 }
	
	//number of parameters
	public void add(int x,int y,int z)
	{
		System.out.println("add(int x,int y,int z)"+(x+y+z));
	
	}
	
public static void main(String[] args)
{

	Method_Overloading overloading=new Method_Overloading();
	overloading.add(1.4, 8);
	overloading.add(1, 1.9);
	overloading.add(1, 3,8);
	
}
}
