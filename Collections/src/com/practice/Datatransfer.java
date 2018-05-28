package com.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import datatransfer.Employee;

public class Datatransfer 
{
	public static List getData() throws SQLException, ClassNotFoundException{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","spring","abc");
		
		PreparedStatement statement = conn.prepareStatement("select * from employee ");

		 ArrayList<Employee>list=new ArrayList<>();
		ResultSet rs = statement.executeQuery();
		
		while(rs.next())
		{
			Employee employee=new Employee();
			employee.setEno(rs.getInt(1));
			employee.setName(rs.getString(2));
			employee.setSalary(rs.getDouble(3));
			list.add(employee);
		}
		
		rs.close();
		return list;
	}
}
