package p2; // within same package here derived class 

public class SalesManager extends p1.Employee

{

	double incentive;
	int target; // state here

	public SalesManager(int id, String name, double salary, double incentive, int target) {
		super(id, name, salary);
		this.incentive = incentive;
		this.target = target;
	}
	// parameterized constructore here

	public double getIncentive() {
		return incentive;
	}

	public void setIncentive(double incentive) {
		this.incentive = incentive;
	}

	public int getTarget() {
		return target;
	}

	public void setTarget(int target) {
		this.target = target;
	}

	public double calsal() {

		return salary + incentive;

	} // common behaviour ends here

	@Override
	public String toString() {
		return super.toString() + "\nincentive=" + incentive + ", target=";
	}

} // class salesManager ends here
