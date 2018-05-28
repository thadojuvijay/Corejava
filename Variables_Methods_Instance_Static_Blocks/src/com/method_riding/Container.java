package com.method_riding;

public class Container 
{
public static void main(String[] args) {
	
	Class_A a=new Class_A();
	a.msg();
	a.display();
	
	Class_B b=new Class_B();
	b.msg();
	b.display();
	
	
	Class_A c=new Class_B();
	c.msg();
	c.display();

	// if we create the object like if child class reference holds parent class object,
	//then we will get error.and if you type case parent into child we  wont get exception on 
	//compilation time but we get runtime exception ClassCastException
	
	
	
	/*Class_B d=new Class_A();
	Class_B e=(Class_B)new Class_A();
	e.display();
	e.msg();*/
	

}
}
