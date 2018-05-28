package com.serialization;

import java.io.Serializable;

public class Employee implements Serializable
{
private Integer eno;
private String name;

public Employee( Integer eno,String name) {
	this.eno=eno;
	this.name=name;
}

public void setEno(Integer eno)
{
	this.eno=eno;
}
public Integer getEno()
{
	return eno;
}

public void setName(String name)
{
	this.name=name;
}
public String getName()
{
	return name;
}

public Integer msg()
{
	return 5;
}

}
