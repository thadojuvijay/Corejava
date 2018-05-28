package com.practice;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import datatransfer.Employee;

public class Presentation {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
List data = Datatransfer.getData();

System.out.println(data);
for (Object object : data) {
	
	Employee emloyee=(Employee)object;
	System.out.println(emloyee.getEno());
   System.out.println(emloyee.getName());
   System.out.println(emloyee.getSalary());
}
	

	
}
}
