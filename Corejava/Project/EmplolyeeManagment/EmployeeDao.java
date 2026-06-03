package Demo;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class EmployeeDao {

	Dbconnection dbc = new Dbconnection();

	// connection created here from the database with respect to its object here

	// Display All Employees

	public ArrayList<Employee> getallEmployees() throws SQLException, IOException {

		Connection con = dbc.getConnection();

		String query = "SELECT * FROM employees";

		PreparedStatement ps = con.prepareStatement(query);

		ResultSet resultSet = ps.executeQuery();

		ArrayList<Employee> emplist = new ArrayList<Employee>();

		while (resultSet.next()) {

			Employee employee = new Employee();

			employee.setId(resultSet.getInt(1));

			employee.setName(resultSet.getString(2));

			employee.setSalary(resultSet.getDouble(3));

			emplist.add(employee);
		}

		return emplist;
	}

	// Add Employee

	public int addEmployee(Employee emp) throws SQLException {

		Connection con = dbc.getConnection();

		String query = "INSERT INTO employees(id,name,salary) VALUES(?,?,?)";

		PreparedStatement ps = con.prepareStatement(query);

		ps.setInt(1, emp.getId());

		ps.setString(2, emp.getName());

		ps.setDouble(3, emp.getSalary());

		return ps.executeUpdate();
	}

	public int deleteEmployeeByid(int id) {

		int result = 0;

		try {

			Connection con = dbc.getConnection();

			String query = "DELETE FROM employees WHERE id = ?";

			PreparedStatement ps = con.prepareStatement(query);

			ps.setInt(1, id);

			result = ps.executeUpdate();

		} catch (Exception e) {

			System.out.println(e.getMessage());
		}

		return result;

	}

	public Employee searchEmployeeByID(int id2) {

		Employee emp = null;

		try {

			Connection con = dbc.getConnection();

			String query = "SELECT * FROM employees WHERE id = ?";

			PreparedStatement ps = con.prepareStatement(query);

			ps.setInt(1, id2);

			ResultSet rs = ps.executeQuery();

			if (rs.next()) {

				emp = new Employee();
				// here all the resultant Employee list of ID name and details will be get it

				emp.setId(rs.getInt("id"));
				emp.setName(rs.getString("name"));
				emp.setSalary(rs.getDouble("salary"));
			}

		} catch (Exception e) {

			System.out.println(e.getMessage());
		}

		return emp;
	}

	public int UpdateEmployeeByName(int id3, String name) {

		int result = 0;

		try {

			Connection con = dbc.getConnection();

			String query = "UPDATE employees SET name = ? WHERE id = ?";

			PreparedStatement ps = con.prepareStatement(query);

			ps.setString(1, name);

			ps.setInt(2, id3);

			result = ps.executeUpdate();

		} catch (Exception e) {

			e.printStackTrace();
		}

		return result;

	}

	public int UpdateEmployeeBySalary(int id4, double salary) {

		int result = 0;

		try {

			Connection con = dbc.getConnection();

			String query = "UPDATE employees SET salary = ? WHERE id = ?";

			PreparedStatement ps = con.prepareStatement(query);

			ps.setDouble(1, salary);

			ps.setInt(2, id4);

			result = ps.executeUpdate();

		} catch (Exception e) {

			System.out.println(e.getMessage());
		}

		return result;

	}

} // Class EmployeeDao Ends here
