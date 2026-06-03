package Demo;

public class Employee {

	int id;
	String name;
	Double Salary;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return Salary;
	}

	public void setSalary(Double salary) {
		Salary = salary;
	}

	public Employee() {

	}

	public Employee(int id, String name, Double salary) {
		this.id = id;
		this.name = name;
		Salary = salary;
	}

	@Override
	public String toString() {
		return "id=" + id + "\n, name=" + name + "\n, Salary=" + Salary;
	}

}
