import java.util.Scanner;

abstract class ElectricityBill
{
	String customerName;
	int units;// class members here 
	static int charge = 50;
 
		
	 String getCustomerName() {
		return customerName;
	}
	void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	int getUnits() {
		return units;
	}
	
	void setUnits(int units) {
		this.units = units;
	}
	
	
	ElectricityBill(String customerName, int units) {
		this.customerName = customerName;
		this.units = units;
	}
	//constructor
	
	
	// cannot override here 
	
	final void generateBill()
	
	{
	
		 double billAmount = calculateBill();
		 
//		 	function returning here bill amount 

	        // Add 5% tax
	        billAmount = billAmount + (billAmount * 0.05);

	        // Add fixed charge ₹50
	        billAmount = billAmount + 50;

	        System.out.println("Final Bill Amount (₹): " + billAmount);
	        System.out.println("-----------------------------------");
		
	
		
	}
	
	
	void showUsage()
	{
		System.out.println("The customers name is: "+this.customerName);
		System.out.println("The customers Units is :"+this.units);
		
	
	}// display ends here 
	
	abstract double calculateBill();// declarayion here 
	


}// class ElectricityBill ends here 

class ResidentialBill extends ElectricityBill
{
	
	

	ResidentialBill(String customerName, int units) {
		super(customerName, units);
		//
	}

	@Override
	double calculateBill() {
		
		double bill =0;
		
		if (units <= 100) {
            bill = units * 2.5;
        }
        else if (units <= 300) {
            bill = (100 * 2.5) + ((units - 100) * 3.5);
        }
        else {
            bill = (100 * 2.5) + (200 * 3.5) + ((units - 300) * 5);
        }

        // Additional surcharge
        if (units > 500) {
            bill += 150;
        }

        return bill;
		
	}//  function calculate bill ends here 
	



}// class ResidentialBill ends here 

class CommercialBill extends ElectricityBill {

	CommercialBill(String customerName, int units) {
		super(customerName, units);
		// TODO Auto-generated constructor stub
	}

	@Override
	double calculateBill() {
		double bill = units * 6.5;

        // Minimum bill condition
        if (units < 200) {
            bill = 1500;
        }

        // Energy surcharge for high usage
        if (units > 1000) {
            double surcharge = bill * 0.08; // 8% only on unit charges
            bill += surcharge;
        }

        return bill;
	}
	
	
	
}// clsas CommercialBill ends here 




public class TestElectricityBIll {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner sc = new Scanner(System.in);

	        System.out.println("====== Electricity Bill Calculator ======");
	        System.out.println("Select Customer Type:");
	        System.out.println("1. Residential");
	        System.out.println("2. Commercial");

	        System.out.print("Enter choice (1 or 2): ");
	        int choice = sc.nextInt();
	        sc.nextLine(); // clear buffer

	        System.out.print("Enter Customer Name: ");
	        String name = sc.nextLine();

	        System.out.print("Enter Units Consumed: ");
	        int units = sc.nextInt();
	        
	        ElectricityBill bill = null;

	        // Create object based on choice
	        if (choice == 1) {
	            bill = new ResidentialBill(name, units);
	        }
	        else if (choice == 2) {
	            bill = new CommercialBill(name, units);
	        }
	        else {
	            System.out.println("Invalid choice!");
	            return;
	        }

	        // Display bill
	        bill.showUsage();
	        bill.generateBill();

	        sc.close();
		
		

	}

} // class ends here  
