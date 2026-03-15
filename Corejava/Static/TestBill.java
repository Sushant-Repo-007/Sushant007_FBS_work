class  ElectricityBill // structure 
{
	 int customerID;
	 String customername;
	 int unitsconsumed; // class members here
	 
	 static double ratePerUnit = 5.0;  // gets memory at the time of class loading here 
// rateperunit gets all object whenever we create object we can change it by using the static block 
	 
	 
	ElectricityBill(int customerID, String customername, int unitsconsumed) {
		this.customerID = customerID;
		this.customername = customername;
		this.unitsconsumed = unitsconsumed;
		
		
		
	} // paramerterized constructor here 
	
	static void updateRate(double newRate) {
        ratePerUnit = newRate;
    }
	// static block here 
	
	


	double calculateBill()  
	// method  to calculate rate per unit of electricity in calculate method here 
	
	{
		
		return unitsconsumed * ratePerUnit;
	}// method calcualteBill ends here 


	void displayBill() // responsibility 
	{
		System.out.println("The customer id :"+this.customerID);
		System.out.println("The customer name :"+this.customername);
		System.out.println("The Total units consumed :"+this.unitsconsumed);
		System.out.println("The calcualted electricity :"+this.calculateBill());
		
		
	}
	
	 
		


} // class ElectricityBill ends here 


public class TestBill {  

	public static void main(String[] args) {
		
		// e1 reference created here 
		ElectricityBill  e1 = new ElectricityBill (1,"Sushant",12); // object created in the heap memory here 
		
		
		System.out.println("The Printed values is  here :\n ");
		e1.displayBill(); // invoked here 
		
		
		System.out.println("---------------------------------------------");
		
		System.out.println("The Updated Electricty rate is here :\n");
		
		ElectricityBill.updateRate(6.5); 
		// parameters passed here for updater rate in new rate in static here
		
		System.out.println("Afterupdated electicty bill rate is :\n");
		
		e1.displayBill(); // 2nd time invoked here 
		
		

	}

}
