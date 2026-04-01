package p2;

public class Admin extends p1.Employee

{
	double allowance; // state here 

	 public Admin(int id, String name, double salary, double allowance) {
		super(id, name, salary);
		this.allowance = allowance;
	}
 // parameterized constructor  ends here 
	public double getAllowance() {
		return allowance;
	}

	public void setAllowance(double allowance) {
		this.allowance = allowance;
	}
	
	
	public double calsal() {
		
		return salary+allowance;
		
	} 
	
	@Override
	public String toString() {
		return  super.toString()+ "\n allowance=" + allowance;
	}

	
	
	

}// Admin class  ends here
