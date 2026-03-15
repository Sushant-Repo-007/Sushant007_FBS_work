class Library

{

	// class members here
	String Username;
	int noofdays;
	double Totalfine;

	Library(String username, int noofdays) {
		this.Username = username;
		this.noofdays = noofdays;
	} // parameterized constructor here

	static double fine = 4.5;

	static void updatefine(double newfine) // static block here
	{

		fine = newfine;

	}// staticfunction ends here

	double calfine() // method to calculate the fine here

	{

		return Totalfine = noofdays * fine;

	} // method to calculate fine here

	void display() // responsibilty
	{

		System.out.println("The username:" + this.Username);
		System.out.println("The No of days are :" + this.noofdays);
		System.out.println("The Calculated fine :" + this.calfine());

	}

} // class library end here

public class TestLibrary {

	public static void main(String[] args) {

		Library l1 = new Library("Sushant", 10); // object created in the heap memory here

		l1.display();

		System.out.println("-------------------------");

		System.out.println("The updated fine after this is ");

		Library.updatefine(9);

		l1.display();

	}

}
