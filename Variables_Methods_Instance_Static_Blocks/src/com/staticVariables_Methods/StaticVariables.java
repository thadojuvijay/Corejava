package com.staticVariables_Methods;

public class StaticVariables 
{
	
	
	static int a=10;
	static public void msg()
	{
		
	}
public static void main(String[] args)
{
StaticVariables.msg();
System.out.println(StaticVariables.a);


StaticVariables variables=new StaticVariables();
System.out.println(variables.a);

}
}
