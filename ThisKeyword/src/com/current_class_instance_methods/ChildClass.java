package com.current_class_instance_methods;

public class ChildClass extends Current_Instance_Methods
{
	public void show()
	{
		msg();//this.msg()
		display();//this.display()
	}
	
public static void main(String[] args) {
	
	ChildClass childClass=new ChildClass();
	childClass.show();
}
}
