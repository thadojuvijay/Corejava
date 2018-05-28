package com.finalize;

public class Student {
	
	
	private Integer a;

	public Integer getA() {
		return a;
	}

	public void setA(Integer a) {
		this.a = a;
	}
@Override
protected void finalize() throws Throwable {
      System.out.println("finalize");
	this.finalize();
}
}
