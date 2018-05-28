package com.curent_Instance_Variables;

public class Without_using_this_keyword
{
	int a;
	int b;
	int c;
	
	public Without_using_this_keyword(int a,int b,int c) 
	{
		a=a;
		b=b;
		c=c;	
	}
	
	
	public void msg()
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	

public static void main(String[] args) 
{
	
	Without_using_this_keyword s =
			new Without_using_this_keyword(2,3,5);

	s.msg();
}
}
