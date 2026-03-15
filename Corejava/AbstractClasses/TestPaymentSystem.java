abstract class Payment {

	// class members here
	String paymentId;
	double amount;
	String payerName;
	String status;

	// Constructor
	Payment(String paymentId, double amount, String payerName) {
		this.paymentId = paymentId;
		this.amount = amount;
		this.payerName = payerName;
		this.status = "PENDING";
	}

	// FINAL template method
	final void process() {

		if (!validate()) {
			status = "FAILED";
			System.out.println("Validation failed ❌");
			return;
		}

		deductAmount();
		sendNotification();

		status = "SUCCESS";
		System.out.println("Payment successful ✅");
	}
	
	
	//body here 	

	abstract boolean validate();

	abstract void deductAmount();

	abstract void sendNotification();

	void printSummary() {
		System.out.println("\nPayment ID : " + paymentId);
		System.out.println("Payer Name : " + payerName);
		System.out.println("Amount     : " + amount);
		System.out.println("Status     : " + status);
	}
}// class payment ends here

class CardPayment extends Payment {

	 String cardNumber;
	 String cvv;

	CardPayment(String paymentId, double amount, String payerName, String cardNumber, String cvv) {
		super(paymentId, amount, payerName);
		this.cardNumber = cardNumber;
		this.cvv = cvv;
	}

	@Override
	boolean validate() {
		if (cardNumber.length() != 16)
			return false;
		if (cvv.length() != 3)
			return false;
		if (amount <= 0)
			return false;
		return true;
	}
	// defined here 
	@Override
	void deductAmount() {
		System.out.println("₹" + amount + " deducted from Card: ****" + cardNumber.substring(12));
	}

	@Override
	void sendNotification() {
		System.out.println("SMS sent for Card payment");
	}
}// class cardpayment ends here

class UPIPayment extends Payment {

	private String upiId;

	UPIPayment(String paymentId, double amount, String payerName, String upiId) {
		super(paymentId, amount, payerName);
		this.upiId = upiId;
	}

	@Override
	boolean validate() {
		if (!upiId.contains("@"))
			return false;
		if (amount < 1 || amount > 100000)
			return false;			
		return true;
	}

	@Override
	void deductAmount() {
		System.out.println("₹" + amount + " deducted via UPI: " + upiId);
	}

	@Override
	void sendNotification() {
		System.out.println("UPI payment notification sent");
	}
}// class upipayment ends here

public class TestPaymentSystem {

	public static void main(String[] args) {

		Payment p1 = new CardPayment("P101", 0, "Sushant", "1234567812345678", "123");

		p1.process();
		p1.printSummary();

		System.out.println("------------------------------");

		// 2️⃣ Valid UPI Payment
		p1 = new UPIPayment("P102", 1500, "Rahul", "rahul@upi");

		p1.process();
		p1.printSummary();

		System.out.println("------------------------------");

		// 3️⃣ Valid Card Payment
		p1 = new CardPayment("P103", 500, "Amit", "1111222233334444", "456");

		p1.process();
		p1.printSummary();

		System.out.println("------------------------------");

		// 4️⃣ Valid UPI Payment
		p1 = new UPIPayment("P104", 50000, "Priya", "priya@okaxis");

		p1.process();
		p1.printSummary();

		System.out.println("------------------------------");

	}

}
