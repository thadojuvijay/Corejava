package com.curent_Instance_Variables;

public class With_using_this_keyword
{
	int a;
	int b;
	int c;
	
	public With_using_this_keyword(int a,int b,int c) {
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
	
With_using_this_keyword s=new With_using_this_keyword(2, 3, 3);

	s.msg();
}
}
