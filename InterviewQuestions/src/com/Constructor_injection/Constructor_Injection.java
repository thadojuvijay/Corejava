package com.Constructor_injection;

public class Constructor_Injection 
{
private Integer eno;
private String name;

public Constructor_Injection(Integer eno,String name)
{
this.eno=eno;
this.name=name;
}




public static void main(String[] args) {
	Constructor_Injection injection=new Constructor_Injection(1, "vijay");
	System.out.println(injection);
}
}
