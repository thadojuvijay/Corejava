package com.curent_Instance_Variables;

public class No_need_of_this_keyword 
{
	int rollno;
	int salary;
	
	 public No_need_of_this_keyword(int a,int b) {
		rollno=a;
		salary=b;
	}
	
	public void msg()
	{
		System.out.println(rollno);
		System.out.println(salary);
		
	}
	

public static void main(String[] args) 
{
	
No_need_of_this_keyword s=new No_need_of_this_keyword(2, 3);

	s.msg();
}
}


