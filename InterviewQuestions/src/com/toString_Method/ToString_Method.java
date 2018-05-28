package com.toString_Method;

public class ToString_Method 
{
int a;
private Integer eno;
private String name;

ToString_Method(int a,Integer eno,String name)
{
	this.a=a;
	this.eno=eno;
	this.name=name;
}

public Integer getEno() {
	return eno;
}

public void setEno(Integer eno) {
	this.eno = eno;
}


public String msg()
{
	return "raju";
}




@Override
public String toString() {
	return "ToString_Method [a=" + a + ", eno=" + eno + ", name=" + name + ", getEno()=" + getEno() + ", msg()=" + msg()
			+ "]";
}

public static void main(String[] args) {
	
	ToString_Method s=new ToString_Method(1,3,"uday");
	System.out.println(s); // here iam directly printing object because of toString() iam directly getting values.
}

}
