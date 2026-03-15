class Device {

	String brand;
	double price;
	static int count = 0;

	String getBrand() {
		return brand;
	}

	void setBrand(String brand) {
		this.brand = brand;
	}

	double getPrice() {
		return price;
	}

	void setPrice(double price) {
		this.price = price;
	}

	static int getCount() {
		return count;
	}

	static void setCount(int count) {
		Device.count = count;
	}

	// class members here
	// Parameterized Constructor
	Device(String brand, double price) {
		this.brand = brand;
		this.price = price;
	}

	void showDevice() {
		System.out.println("Brand: " + brand);
		System.out.println("Price: " + price);
	}
}

class Mobile extends Device {

	int batteryCapacity; // mAh

	// Parameterized Constructor
	Mobile(String brand, double price, int batteryCapacity) {
		super(brand, price); // calling parent constructor
		this.batteryCapacity = batteryCapacity;
	}

	void showMobile() {
		System.out.println("Battery: " + batteryCapacity + " mAh");
	}
}

class SmartPhone extends Mobile {

	int cameraMP;
	int storageGB;

	// Parameterized Constructor
	SmartPhone(String brand, double price, int batteryCapacity, int cameraMP, int storageGB) {

		super(brand, price, batteryCapacity);
		this.cameraMP = cameraMP;
		this.storageGB = storageGB;
	}

	void showSmartPhone() {
		System.out.println("Camera: " + cameraMP + " MP");
		System.out.println("Storage: " + storageGB + " GB");
	}
}

public class TestDevice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SmartPhone s = new SmartPhone("Samsung", 25000, 5000, 64, 128);

		s.showDevice(); // from Device
		s.showMobile(); // from Mobile
		s.showSmartPhone(); // from SmartPhone
		
		System.out.println("The Total count is: "+Device.getCount());
		

	}

}
