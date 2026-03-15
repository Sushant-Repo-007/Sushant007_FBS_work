class Employee 

{

	int EmployeeID; // class members here
	String Employeename;
	double Basicsalary;
	double Totalsalary;
	static double Bonusrate = 4.5; // static gets memory at the time of class loading here 

	Employee(int employeeID, String employeename, double basicsalary) {
		EmployeeID = employeeID;
		Employeename = employeename;
		Basicsalary = basicsalary;

	} // constructor ends here

	static void newrate(double newbonusrate)

	{
		Bonusrate = newbonusrate; // bonus rate used  here using static variable here 

	} // static block ends here

	double calsalary() {
		return Totalsalary = Basicsalary + (Basicsalary * Bonusrate) / 100;
	}

	void display() {

		System.out.println("The EmployeeID: " + this.EmployeeID);
		System.out.println("The EmployeeName :" + this.Employeename);
		System.out.println("The Initial BasicSalary :" + this.Basicsalary);
		System.out.println("The Bonus rate is" + Employee.Bonusrate);  
		
		// here we access the static varible use the class name here 
		System.out.println("The calculated salary: " + this.calsalary());

	}

} // class employee ends here

public class TestEmployee {

	public static void main(String[] args) {

		Employee e1 = new Employee(1, "Sushant", 1000);

		e1.display();

		System.out.println("----------------------------------");

		Employee.newrate(9.0); // parameter passed here updated static value here

		System.out.println("After the New Bonusrate is applied ");

		e1.display();

	}

}
