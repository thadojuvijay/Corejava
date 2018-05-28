package com.instanceofOperator;

import com.instanceofOperator2.Company;

public class Example1 
{
public static void main(String[] args) {
	Employee employee=new Employee();
	System.out.println(employee instanceof Employee);
	Object object=new Employee();
	System.out.println(object instanceof Employee);

	
	// if the reference variable holds null it will false
	Employee e=null;
	System.out.println(e instanceof Employee);
	
	
	//Employee employee2=new Company();
	//System.out.println(employee2 instance);
}
}
