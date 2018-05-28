package com.toString_method;

public class ToString_method
{
public static void main(String[] args) {
	
	
	
	  /*
	    public String toString() {
	        return getClass().getName() + "@" + Integer.toHexString(hashCode());
	    }
	  */
	
	Object obj=new Object();
	System.out.println(obj.toString());
	
	Employee employee=new Employee();
	System.out.println(employee+"----"+employee.toString());
	
	String s=new String("vijay");
	System.out.println(s+"----"+s.toString());
	
}
}
