package com.type_casting;

public class Case5 
{
public static void main(String[] args) {
	
	Parent p=(Parent)new Child();
	Child c=(Child)p;
	c.display();
	c.msg();
	c.show();
}
}
