package com.Throws;

import java.sql.DriverManager;
import java.sql.SQLException;

public class Example3 {

	void mro() throws SQLException
	{
		DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "spring", "abc");
		System.out.println("income certificate");
	}

	void moffice()throws SQLException
	{
	mro();	
	}
	
	void meseva()
	{
		try{
		moffice();
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args)
	{
		Example3 t=new Example3();
		t.meseva();
		
		
	}
}
