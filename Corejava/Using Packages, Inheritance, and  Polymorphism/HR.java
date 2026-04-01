package p2; // within same package here derived class

public class HR extends p1.Employee {

	double commission;

	public HR(int id, String name, double salary, double commission) {
		super(id, name, salary);
		this.commission = commission;
	}

	public double getCommission() {
		return commission;
	}

	public void setCommission(double commission) {
		this.commission = commission;
	}

	public double calsal() {

		return salary + commission;

	} // common behaviour  
	
	

	@Override
	public String toString() {
		return  super.toString()+"\ncommission=" + commission;
	} 
	
	
	
	


} // class HR ends here
