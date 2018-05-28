package com.instanceofOperator2;

public class Employee extends Company
{
public static void main(String[] args) {
	Employee employee=new Employee();
	System.out.println(employee instanceof Company);
}
}
