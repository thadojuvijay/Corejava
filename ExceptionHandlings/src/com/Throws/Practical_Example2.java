package com.Throws;

import java.sql.DriverManager;
import java.sql.SQLException;

public class Practical_Example2 
{
	void mro() throws SQLException
	{
		DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "spring", "abc");
		System.out.println("income certificate");
	}

	void moffice()throws SQLException
	{
	mro();	
	}
	void meseva()throws SQLException
	{
		moffice();
	}
	public static void main(String[] args)throws SQLException
	{
		Practical_Example2 t=new Practical_Example2();
		t.meseva();
		
		
	}

}
