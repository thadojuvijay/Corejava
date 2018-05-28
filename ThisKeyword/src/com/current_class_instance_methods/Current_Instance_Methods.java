package com.current_class_instance_methods;

public class Current_Instance_Methods
{

	public void msg()
	{
		System.out.println("msg()");
	}
	
	public void display()
	{
		System.out.println("display()");
		msg();// this.msg()
	}
	
	
}
