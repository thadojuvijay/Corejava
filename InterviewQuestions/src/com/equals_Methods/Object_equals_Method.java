package com.equals_Methods;

public class Object_equals_Method
{
	
	
	
// Object class equals() method compares hashcode of the object
//String class override the object class equals(),then String class equals()
	//method will compares the content or value
	
public static void main(String[] args) {
	
	Employee employee=new Employee();
	Employee employee2=new Employee();
	
	System.out.println(employee.equals(employee2));
	System.out.println(employee.equals(employee));
	
	
	String a=new String("hai");
	String b=new String("hai");
	
	System.out.println(a.equals(b));
}
}
