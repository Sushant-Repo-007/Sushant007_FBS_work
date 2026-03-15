import java.util.Scanner;

//Insurance Premium Calculator
abstract class InsurancePolicy {
	// class members here
	String policyHolderName;
	double basePremium;

	String getPolicyHolderName() {
		return policyHolderName;
	}

	void setPolicyHolderName(String policyHolderName) {
		this.policyHolderName = policyHolderName;
	}

	double getBasePremium() {
		return basePremium;
	}

	void setBasePremium(double basePremium) {
		this.basePremium = basePremium;
	}

	InsurancePolicy(String policyHolderName, double basePremium) {
		this.policyHolderName = policyHolderName;
		this.basePremium = basePremium;
	}
	// constructore here

//	responsibility here

	void printPolicyDetails() {
		double finalPremium = calculatePremium();
		
//		finalPremium calcualted here  with calculate premoumn functionality 	

		System.out.println("\n===== Policy Details =====");
		System.out.println("Policy Holder Name : " + policyHolderName);
		System.out.println("Base Premium (₹)   : " + basePremium);
		System.out.println("Final Premium (₹)  : " + finalPremium);
		System.out.println("---------------------------");
	}

	abstract double calculatePremium(); // invoked here
	
	
	// declaration here 

}// class InsurancePolicy ends here

class CarInsurance extends InsurancePolicy {

	int carAgeInYears;
	boolean hadAccidentInLastYear;
	double carValue;

//    	constructor here 

	CarInsurance(String name, double basePremium, int carAgeInYears, boolean hadAccidentInLastYear, double carValue) {

		super(name, basePremium);
		this.carAgeInYears = carAgeInYears;
		this.hadAccidentInLastYear = hadAccidentInLastYear;
		this.carValue = carValue;
	}

	@Override
	
	// defination here 
	double calculatePremium() {
		
		// logic main 
		double premium = basePremium;

		if (carAgeInYears <= 3)
			premium += premium * 0.10;
		else if (carAgeInYears <= 7)
			premium += premium * 0.20;
		else
			premium += premium * 0.30;

		// Accident condition
		if (hadAccidentInLastYear)
			premium += premium * 0.25;
		else
			premium -= premium * 0.10;

		// High value car
		if (carValue > 1000000)
			premium += 2000;

		return premium;

	}

}// class CarInsurance end here

class HealthInsurance extends InsurancePolicy {

	int age;
	boolean isSmoker;
	boolean hasPreExistingDisease;

	HealthInsurance(String name, double basePremium, int age, boolean isSmoker, boolean hasPreExistingDisease) {

		super(name, basePremium);
		this.age = age;
		this.isSmoker = isSmoker;
		this.hasPreExistingDisease = hasPreExistingDisease;
	}

	@Override
	double calculatePremium() {

		double premium = basePremium;

		// Age loading
		if (age < 30)
			premium += premium * 0.10;
		else if (age <= 45)
			premium += premium * 0.25;
		else
			premium += premium * 0.40;

		// Smoker condition
		if (isSmoker)
			premium += premium * 0.30;
		else
			premium -= premium * 0.05;

		// Pre-existing disease
		if (hasPreExistingDisease)
			premium += premium * 0.20;

		return premium;
	}
}// class HealthInsurance ends here

public class TestCalculator {

	@SuppressWarnings("resource")
	public static void main(String[] args)

	{

		Scanner sc = new Scanner(System.in);

		System.out.println("====== Insurance Premium Calculator ======");
		System.out.println("1. Car Insurance");
		System.out.println("2. Health Insurance");

		System.out.print("Enter choice: ");
		int choice = sc.nextInt();
		sc.nextLine(); // clear buffer

		System.out.print("Enter Policy Holder Name: ");
		String name = sc.nextLine();

		System.out.print("Enter Base Premium (₹): ");
		double basePremium = sc.nextDouble();
		
		
		

		InsurancePolicy policy = null; // reference created here local varaibles must be inittial

		if (choice == 1) {

			System.out.print("Enter Car Age (years): ");
			int carAge = sc.nextInt();

			System.out.print("Had accident last year? (true/false): ");
			boolean accident = sc.nextBoolean();

			System.out.print("Enter Car Value (₹): ");
			double carValue = sc.nextDouble();

			policy = new CarInsurance(name, basePremium, carAge, accident, carValue);
			// object creted in  the heap  
		}

		else if (choice == 2) {

			System.out.print("Enter Age: ");
			int age = sc.nextInt();

			System.out.print("Is Smoker? (true/false): ");
			boolean smoker = sc.nextBoolean();

			System.out.print("Has Pre-existing Disease? (true/false): ");
			boolean disease = sc.nextBoolean();

			policy = new HealthInsurance(name, basePremium, age, smoker, disease);
		}

		else {
			System.out.println("Invalid choice!");
			return;
		}

		// Display policy details
		policy.printPolicyDetails();

		sc.close();

	}

}//class TestCalculator ends here 
