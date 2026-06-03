package Demo;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

public class EmployeeService {
	
	EmployeeDao Empdao = new EmployeeDao();
	
	public void displayAllEmployees() throws SQLException, IOException {
	
		
		ArrayList<Employee> emplist = Empdao.getallEmployees();
		
		
		for(Employee e:emplist)
		System.out.println(e);
		
		
		
	}

	public int  addEmployee(Employee emp) throws SQLException
	{
		
		return Empdao.addEmployee(emp);
		
		
	}

	

	public int deleteEmployeeServiceByid(int  id) {
		
		return Empdao.deleteEmployeeByid(id);
		
	}

	public Employee searchEmployeeByID(int id2) {
		 return Empdao.searchEmployeeByID(id2);
		
	}

	

	public int UpdateEmployeeByName(int id3, String name) {
		
		return Empdao.UpdateEmployeeByName(id3,name);
	}

	public int UpdateEmployeeBySalary(int id4, double salary) {
	  return Empdao.UpdateEmployeeBySalary(id4,salary);
		
	}

	



}
