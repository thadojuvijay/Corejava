package com.Throws;

public class Throws_Practical_Example 
{
//throws keyword is used to delegate or tranfer the responsibility of exception handling to its caller.
	
	//first i try to execute main main method,
	//now main method has to execute the msg().
//The main method will give control to the msg() to execute the msg(),
//at the time of execution msg(),exception found,suppose msg method dont want to handle 
//the exception it will delegate or transfer the exception to the caller method.
//who wants to call that method.here caller is main() method.
//if caller main() method also dont want to handle the exception.it will give that exception
	//to the caller method of main().that is Jvm.jvm will search that corresponding exception
	//with catch block,if it is not it will give exception to  default exception handler.
	//then responsible of the expection handler to display the exception
	
	
	
void msg() throws ArithmeticException
{
System.out.println("msg()");
System.out.println(6/0);
System.out.println("msg()");
}
	
public static void main(String[] args) throws ArithmeticException
{
	Throws_Practical_Example t=new Throws_Practical_Example();
	t.msg();
}
}
