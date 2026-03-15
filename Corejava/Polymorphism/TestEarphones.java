

class Earphones {

	String brandName;
	String color;
	double price;
	String connectivityType;
	String batteryLife;
	String isNoiseCancelling;
	int weight;
	int warrantyPeriod;

	static int count = 0;

	Earphones(String brandName, String color, double price, String connectivityType, String batteryLife,
			String isNoiseCancelling, int weight, int warrantyPeriod) {

		this.brandName = brandName;
		this.color = color;
		this.price = price;
		this.connectivityType = connectivityType;
		this.batteryLife = batteryLife;
		this.isNoiseCancelling = isNoiseCancelling;
		this.weight = weight;
		this.warrantyPeriod = warrantyPeriod;

		count++; // increase object count
	}

	void connect() {
		System.out.println("Earphone connected");
	}// common behaviour here

	void disconnect() {
		System.out.println("Earphone disconnected");
	}

	void playSound() {
		System.out.println("Playing audio");
	}

	void display() {
		System.out.println("Brand Name: " + brandName);
		System.out.println("Color: " + color);
		System.out.println("Price: ₹" + price);
		System.out.println("Connectivity Type: " + connectivityType);
		System.out.println("Battery Life: " + batteryLife);
		System.out.println("Noise Cancelling: " + isNoiseCancelling);
		System.out.println("Weight: " + weight + " grams");
		System.out.println("Warranty: " + warrantyPeriod + " months");
	}

	static int getCount() {
		return count;
	}
} // class earphones ends here

// ---------------- Wired ----------------

class WiredEarphones extends Earphones {

	int cableLength;
	String jackType;
	String hasInlineControls;

	WiredEarphones(String brandName, String color, double price, String connectivityType, String batteryLife,
			String isNoiseCancelling, int weight, int warrantyPeriod, int cableLength, String jackType,
			String hasInlineControls) {

		super(brandName, color, price, connectivityType, batteryLife, isNoiseCancelling, weight, warrantyPeriod);

		this.cableLength = cableLength;
		this.jackType = jackType;
		this.hasInlineControls = hasInlineControls;
	}

	void connect() {
		System.out.println("Connected using audio jack");
	}

	void disconnect() {
		System.out.println("WiredEarphones disconnected");
	}

	void playSound() {
		System.out.println("Playing audio");
	}

	void display() {
		super.display();
		System.out.println("Cable Length: " + cableLength + " cm");
		System.out.println("Jack Type: " + jackType);
		System.out.println("Inline Controls: " + hasInlineControls);
	}
}// class wiredearphones ends here 

// ---------------- Wireless ----------------

class WirelessEarphones extends Earphones {

	String chargingCaseCapacity;
	double bluetoothVersion;
	int range;

	WirelessEarphones(String brandName, String color, double price, String connectivityType, String batteryLife,
			String isNoiseCancelling, int weight, int warrantyPeriod, String chargingCaseCapacity,
			double bluetoothVersion, int range) {

		super(brandName, color, price, connectivityType, batteryLife, isNoiseCancelling, weight, warrantyPeriod);

		this.chargingCaseCapacity = chargingCaseCapacity;
		this.bluetoothVersion = bluetoothVersion;
		this.range = range;
	}

	void connect() {
		System.out.println("Connected using Bluetooth ");
	}

	void disconnect() {
		System.out.println("WiredEarphones disconnected");
	}

	void playSound() {
		System.out.println("Playing audio");
	}

	void display() {
		super.display();
		System.out.println("Charging Case Capacity: " + chargingCaseCapacity);
		System.out.println("Bluetooth Version: " + bluetoothVersion);
		System.out.println("Range: " + range + " meters");
	}
} // class wirlessearphones ends here 

// ---------------- Main ----------------

public class TestEarphones{

	public static void main(String[] args) {

		Earphones e1 = new Earphones("boAt", "Red", 1000, "Wireless", "40 hours", "Yes", 10, 12);

		System.out.println("Earphone Details:");
		e1.display();
		e1.connect();
		e1.disconnect();
		e1.playSound();

		System.out.println("----------------------------------");

		e1 = new WiredEarphones("JBL", "Black", 799, "Wired", "N/A", "No", 15, 6, 120, "3.5mm", "Yes");

		System.out.println("Wired Earphone Details:");
		e1.display();

		e1.connect();
		e1.disconnect();
		e1.playSound();

		System.out.println("----------------------------------");

		e1 = new WirelessEarphones("Sony", "White", 5999, "Wireless", "30 hours", "Yes", 8, 12, "500mAh", 5.2, 10);

		System.out.println("Wireless Earphone Details:");
		e1.display();
		e1.connect();
		e1.disconnect();
		e1.playSound();

		System.out.println("----------------------------------");
		System.out.println("Total Objects Created: " + Earphones.getCount());
	}
}

