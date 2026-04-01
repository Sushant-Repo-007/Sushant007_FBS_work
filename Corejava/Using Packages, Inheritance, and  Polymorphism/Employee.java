package p1; // super class package here 

public class Employee

{

	int id; // attribute here
	String name;
	protected double salary;
	static int count = 0;

	// Parameterized constructor
	protected Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		count++;
	}

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

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public static void setCount(int count) {
		Employee.count = count;
	}

	 public double calsal()
	{

		return salary;

	} // common behaviour here

	@Override
	public String toString()

	{
		return "id=" + id + "\n name=" + name + " \nsalary=" + salary;
	}

	// responsibility here
	static int getCount() {
		return count;
	}

} // class Employee ends here
