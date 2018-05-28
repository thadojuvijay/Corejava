package datatransfer;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class Presentation {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
	List resultSet = DataTransfer.getData();
	System.out.println(resultSet);
	
	for (Object obj : resultSet) {
		Employee emp=(Employee)obj;
		System.out.print(emp.getEno());
		System.out.print(emp.getName());
		System.out.println(emp.getSalary());
	}
	
	
	
	
	}

}
