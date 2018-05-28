package com.interviewQuestions;

public class Inheritance_which_method_willcall {

	public static void main(String[] args) {


/*
 * we have two classes A and B 
 *  B extends A 
 *  in A class B class we have same method,
 *  if i call msg() method from B object which method will come A class msg() or B class msg()
 *  if i call msg() method from creating A object which method will come A class msg() or B class msg()
 */

		B b=new B();
	      b.msg();
	      
	      A a=new A();
	      a.msg();
	      
	      A a1=new B();  // it is executing msg() method based on constructor or object
	      a1.msg();
	      
		
	}

}
