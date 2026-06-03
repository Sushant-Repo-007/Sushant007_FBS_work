package Demo;

import java.sql.SQLException;

public class EmployeeController {
	
	
	EmployeeService es = new EmployeeService();
	
	
	public void displayAllEmployees()
	{
		
		try {
			es.displayAllEmployees();
		} catch (Exception e) {
		
			System.out.println(e);
		}
		
		
		finally {
			
			System.out.println("Employee Feteched Successfully here ");
			
		}
		
		
	}


	public int addEmployee(Employee emp) {
		try {
			return es.addEmployee(emp);
		} catch (SQLException e) {
			
			System.out.println(e.getMessage());
		}
		return 0;
	}


	public int deletEmployeeByid(int id) {
		
		
		return es.deleteEmployeeServiceByid(id);
		
	}


	public Employee searchEmployeeByID(int id2) {
			
		
		return es.searchEmployeeByID(id2);
			
		
	}


	public int UpdateEmployeeByName(int id3, String name) {
		return es.UpdateEmployeeByName(id3,name);
		
	}


	public int UpdateEmployeeBySalary(int id4, double salary) {
		
		return es.UpdateEmployeeBySalary(id4,salary);
	}


	



	


	
	
	
	
	

}
