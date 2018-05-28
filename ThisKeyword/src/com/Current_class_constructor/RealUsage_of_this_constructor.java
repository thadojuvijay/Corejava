package com.Current_class_constructor;

public class RealUsage_of_this_constructor
{
	int a;
	int b;
	int c;
	
	public RealUsage_of_this_constructor(int a,int b,int c) {
		this.a=a;
		this.b=b;
		this.c=c;
	}

	
	
	public void msg()
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	

public static void main(String[] args) 
{
	
RealUsage_of_this_constructor s=new RealUsage_of_this_constructor(2, 3, 3);

	s.msg();
}
}
