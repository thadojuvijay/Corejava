package com.instanceVariables_Methods;

public class OverallExampleofDefaultinstancestaticlocal 
{
	int d;         // instance variable
	static int a;   // static variables
	double b;
	float c;
	char f;
	String s;
	long t;
	boolean w;
	InstannceVaraiables y;
	
	
	public void msg()
	{
		//int e=0;
		int e=0;                //local variables
		e=8;
		System.out.println(e);
	}
public static void main(String[] args) {
OverallExampleofDefaultinstancestaticlocal example=new OverallExampleofDefaultinstancestaticlocal();
System.out.println(example.d);
System.out.println(example.a);

System.out.println(OverallExampleofDefaultinstancestaticlocal.a);

System.out.println("double"+example.b);
System.out.println("float"+example.c);
System.out.println("char"+example.f);
System.out.println("string"+example.s);
System.out.println("LOng"+example.t);
System.out.println("boolean"+example.w);
example.msg();
System.out.println(example.y);
/**

 */
}
}
