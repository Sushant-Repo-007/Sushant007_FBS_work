class Vehicle // base class here 
{
    String vehicleNumber;
    int model;
    String companyName;
    int noOfWheels;
    double price;
    static int count = 0;

    Vehicle(String vehicleNumber, int model, String companyName,
            int noOfWheels, double price)
    {
        this.vehicleNumber = vehicleNumber;
        this.model = model;
        this.companyName = companyName;
        this.noOfWheels = noOfWheels;
        this.price = price;
        count++;
    }
    
    
   
    
    
   
    void display()
    {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Model: " + model);
        System.out.println("Company Name: " + companyName);
        System.out.println("Number of Wheels: " + noOfWheels);
        System.out.println("Price: " + price);
    }

    static int getCount()
    {
        return count;
    }
}

class Bike extends Vehicle // derived class here 
{
    int noOfStands;
    int noOfHelmets; // extra attributes here 
    String bikeCategory;

    Bike(String vehicleNumber, int model, String companyName,
         int noOfWheels, double price,
         int noOfStands, int noOfHelmets, String bikeCategory)
    {
        super(vehicleNumber, model, companyName, noOfWheels, price);
        this.noOfStands = noOfStands;
        this.noOfHelmets = noOfHelmets;
        this.bikeCategory = bikeCategory;
    }

    void display()
    {
        super.display();
        System.out.println("Number of Stands: " + noOfStands);
        System.out.println("Number of Helmets: " + noOfHelmets);
        System.out.println("Bike Category: " + bikeCategory);
    }
}

class Car extends Vehicle // derived class here `
{
    String hasPowerSteering;
    String driveMode;
    String parkingAssistSensors;

    Car(String vehicleNumber, int model, String companyName,
        int noOfWheels, double price,
        String hasPowerSteering, String driveMode, String parkingAssistSensors)
    {
        super(vehicleNumber, model, companyName, noOfWheels, price);
        this.hasPowerSteering = hasPowerSteering;
        this.driveMode = driveMode;
        this.parkingAssistSensors = parkingAssistSensors;
    }

   
    
    
    
    void display()
    {
        super.display();
        System.out.println("Power Steering: " + hasPowerSteering);
        System.out.println("Drive Mode: " + driveMode);
        System.out.println("Parking Assist Sensors: " + parkingAssistSensors);
    }
}

class Bus extends Vehicle  // derived class here 
{
    int passengerCapacity;  //extra attributes here 
    int standingCapacity;

    Bus(String vehicleNumber, int model, String companyName,
        int noOfWheels, double price,
        int passengerCapacity, int standingCapacity)
    {
        super(vehicleNumber, model, companyName, noOfWheels, price);
        this.passengerCapacity = passengerCapacity;
        this.standingCapacity = standingCapacity;
    }

    void display()
    {
        super.display();
        System.out.println("Passenger Capacity: " + passengerCapacity);
        System.out.println("Standing Capacity: " + standingCapacity);
    }
}

public class TestVehicle
{
    public static void main(String[] args)
    {
        Bike b1 = new Bike("MH12AB1234", 2023, "Bajaj",
                2, 80000, 1, 2, "Sports");

        Car c1 = new Car("MH14XY5678", 2024, "Tata",
                4, 900000, "Yes", "Manual", "Yes");

        Bus bs1 = new Bus("MH20ZZ9999", 2022, "Ashok Leyland",
                6, 2500000, 40, 20);

        System.out.println("----- Bike Details -----");
        b1.display();

        System.out.println("\n----- Car Details -----");
        c1.display();

        System.out.println("\n----- Bus Details -----");
        bs1.display();

        System.out.println("\nTotal Vehicles Created: " + Vehicle.getCount());
    }
}