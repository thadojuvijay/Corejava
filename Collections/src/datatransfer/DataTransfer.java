package datatransfer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DataTransfer {
	
	
	public static List getData() throws SQLException, ClassNotFoundException{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","spring","abc");
		
		PreparedStatement statement = conn.prepareStatement("select * from employee ");

		ResultSet rs = statement.executeQuery();
		
		List<Employee> list = new ArrayList();
		
		while(rs.next()){
Employee employee=new Employee();
			
			employee.setEno(rs.getInt(1));
			employee.setName(rs.getString(2));
			employee.setSalary(rs.getDouble(3));
			
			list.add(employee);
			
			
			/*
			list.add(rs.getInt(1));
			list.add(rs.getString(2));
			list.add(rs.getDouble(3));
			*/
			
			
		 }
		
		//rs.close();
		
		
		
		return list;
		
		
	}

}
