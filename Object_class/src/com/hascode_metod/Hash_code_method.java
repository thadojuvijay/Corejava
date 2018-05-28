package com.hascode_metod;

public class Hash_code_method 
{
public static void main(String[] args) {
	
	Student student=new Student();
	student.a=0;
	System.out.println(student+" -----  "+student.hashCode()+"----a---"+student.a);
	student.a=10;
	System.out.println(student+" -----  "+student.hashCode()+"----a---"+student.a);
	
	Student student1=new Student();
	System.out.println(student1+"----"+student1.hashCode());
	
	
	Sample s=new Sample();
	System.out.println(s+"--------------"+s.hashCode());
}
}
