package com.ArithmeticOperator;

public class LogicalOperators
{
public static void main(String[] args) {
	
int a=10;

if(a>-80 && a>-2)
{
	System.out.println("true");
}
else
{
	System.out.println("false");
	
}

// The & will use if the condition the two conditions are true,then we will get true
//if the one condition is true and another condition is false,then we will get false
//if the two conditions are false then we will get false

if(a>20&a>9)
{
	System.out.println("true");
}else
{
	System.out.println("false");
}

/*
 *   | Operator is  used 
 *  from the two condition atleast if one condition is true,we will get true.
 *  if both conditions are false,then we will get false.
 *  if both conditions are true we will get true.
 */

if(a>20|a>20)
{
	System.out.println("true");
	
}else
{
	System.out.println("false");
}


/*
 * 
 */
if(a>20||a>20)
{
	System.out.println("true");
	
}else
{
	System.out.println("false");
}


/*
 *   if the two conditions are different,then we get true.
 *   if the two condition are False,then we get false.
 *   if the two conditions are true,then we will get false.
 */

if(a<40^a>11)
{
	System.out.println("true");
}
else {
	System.out.println("false");
}



		
if(a!=11)
{
	System.out.println("false");
}
else
{
	System.out.println("true");
}


}
}
