class Device {

    String brand;
    double price;

    Device(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    void showDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
    }
} // class device ends  here 



class Mobile extends Device {

    int batteryCapacity;

    Mobile(String brand, double price, int batteryCapacity) {
        super(brand, price);
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    void showDetails() {
        super.showDetails();   // optional
        System.out.println("Battery: " + batteryCapacity + " mAh");
    }
} // class mobile ends here




class SmartPhone extends Mobile {

    int cameraMP;
    int storageGB;

    SmartPhone(String brand, double price, int batteryCapacity,
               int cameraMP, int storageGB) {

        super(brand, price, batteryCapacity);
        this.cameraMP = cameraMP;
        this.storageGB = storageGB;
    }

    @Override
    void showDetails() {
        super.showDetails();
        System.out.println("Camera: " + cameraMP + " MP");
        System.out.println("Storage: " + storageGB + " GB");
    }
} // class smartphone ends here 




public class TestDevice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Device d1 = new Device("Generic", 5000);
        Device d2 = new Mobile("Nokia", 12000, 4000);
        Device d3 = new SmartPhone("Samsung", 25000, 5000, 64, 128);

        d1.showDetails();
        System.out.println();

        d2.showDetails();   // Mobile version called
        System.out.println();

        d3.showDetails();   // SmartPhone version called
		
		
		

	}

} // class test device ends here 
