package com.interfaces;

public interface InterfaceExample 
{

//instance variables
int a=10;
int b=30;

//static variables
static int c=20;
static int d=40;

//instance method without body
void msg();
void display(); 



//static methods will must have body..
static void msg1() 
{
	System.out.println("msg");
}
}
